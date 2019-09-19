using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using TodoApp.Models;

namespace TodoApp.Services
{
    public class TodoServiceImpl:ITodoService
    {
       private readonly ApplicationContext application;
        private readonly IUserService userService;

        public TodoServiceImpl(ApplicationContext application, IUserService userService)
        {
            this.application = application;
            this.userService = userService;
        }

        public void deleteTodo(long id,string username)
        {
            var user = userService.FindByUserName(username);
            var todo = application.Todos.FirstOrDefault(t => t.TodoId == id);

            user.Todos.Remove(todo);
            application.SaveChanges();
        }


        public Todo FindTodoByID(long id)
        {
            var todo = application.Todos.FirstOrDefault(t => t.TodoId == id);
            return todo;
        }

        public void saveTodo(string name,string username)
        {
            var user = userService.FindByUserName(username);
            user.Todos.Add(new Todo { Name = name });
            application.SaveChanges();
        }

        public void UpdateTodo(Todo todo)
        {
            application.Todos.Update(todo);
            application.SaveChanges();
        }

        public string FindUserById(Todo todo)
        {
            var user = application.Users.FirstOrDefault(u => u.UserId == todo.UserId);
            return user.UserName;
        }
    }
}

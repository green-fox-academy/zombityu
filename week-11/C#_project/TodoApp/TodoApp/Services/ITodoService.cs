using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using TodoApp.Models;

namespace TodoApp.Services
{
   public interface ITodoService
    {
        //List<Todo> getTodos();
        void saveTodo(string name,string username);
        void deleteTodo(long id,string username);
        Todo FindTodoByID(long id);
        void UpdateTodo(Todo todo);
        string FindUserById(Todo todo);

    }
}

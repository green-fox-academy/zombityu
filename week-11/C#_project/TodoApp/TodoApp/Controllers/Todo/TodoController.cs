using Microsoft.AspNetCore.Mvc;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using TodoApp.Models;
using TodoApp.Services;

namespace TodoApp.Controllers
{
    public class TodoController:Controller
    {
        private readonly ITodoService todoService;
        private readonly IUserService userService;

        public TodoController(ITodoService todoService, IUserService userService)
        {
            this.todoService = todoService;
            this.userService = userService;
        }

        [HttpGet("/Home")]
        public IActionResult Index(string username)
        {
            var user = userService.FindByUserName(username);
            return View(user);
        }
        [HttpPost("/Home/Add")]
        public IActionResult Add(string name,string username)
        {
            todoService.saveTodo(name,username);
            return RedirectToAction(nameof(TodoController.Index),"Todo",new { username});
        }

        [HttpPost("/Home/Delete")]
        public IActionResult Delete(long id,string username)
        {
            todoService.deleteTodo(id,username);
            return RedirectToAction(nameof(TodoController.Index), "Todo", new { username });
        }

        [HttpPost("/Home/Edit")]
        public IActionResult EditTodo(long id)
        {
            var todo = todoService.FindTodoByID(id);
            return View(todo);
        }

        [HttpPost("/home/update")]
        public IActionResult Update(string name,long id)
        {
            var newtodo = todoService.FindTodoByID(id);
            newtodo.Name = name; 
            var username = todoService.FindUserById(newtodo);
            todoService.UpdateTodo(newtodo);
            return RedirectToAction(nameof(TodoController.Index), "Todo", new { username});
        }
    }
}

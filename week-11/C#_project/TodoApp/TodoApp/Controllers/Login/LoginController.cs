using Microsoft.AspNetCore.Mvc;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using TodoApp.Services;

namespace TodoApp.Controllers
{
    public class LoginController:Controller
    {
        private readonly IUserService userService;

        public LoginController(IUserService userService)
        {
            this.userService = userService;
        }

        [HttpGet("/")]
        public IActionResult Login()
        {
            return View();
        }

        [HttpPost("/login")]
        public IActionResult AddUser(string username)
        {
            userService.AddUser(username);
            return RedirectToAction(nameof(TodoController.Index),"Todo",new { username});
        }
    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using TodoApp.Models;

namespace TodoApp.Services
{
    public interface IUserService
    {
        User FindByUserName(string username);
        void AddUser(string username);
    }
}

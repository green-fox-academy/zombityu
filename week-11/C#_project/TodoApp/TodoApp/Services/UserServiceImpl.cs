using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using TodoApp.Models;

namespace TodoApp.Services
{
    public class UserServiceImpl : IUserService
    {
        private readonly ApplicationContext application;

        public UserServiceImpl(ApplicationContext application)
        {
            this.application = application;
        }

        public void AddUser(string username)
        {
            var user = FindByUserName(username);
            if (user == null)
            {
                var newUser = new User { UserName = username };
                application.Users.Add(newUser);
                application.SaveChanges();
            }
        }

        public User FindByUserName(string username)
        {
            var user = application.Users.Include(a => a.Todos).FirstOrDefault(a => a.UserName == username);
            if (user == null)
            {
                return null;
            }

            return user;
        }

    }
}

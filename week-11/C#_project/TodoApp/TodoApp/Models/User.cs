using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace TodoApp.Models
{
    public class User
    {

        public long UserId { get; set; }
        public string UserName { get; set; }
        public List<Todo> Todos { get; set; }
    }
}

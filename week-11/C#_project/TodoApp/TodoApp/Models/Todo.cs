using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace TodoApp.Models
{
    public class Todo
    {
        public long TodoId { get; set; }
        public string Name { get; set; }
        public long UserId { get; set; }
    }
}

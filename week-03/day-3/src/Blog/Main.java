package Blog;

public class Main {
    public static void main(String[] args) {
        Blog myBlog = new Blog();

      myBlog.deletePost(0);
      myBlog.update(0,new BlogPost("Ityu's blog"));
      System.out.println(myBlog);

    }
}

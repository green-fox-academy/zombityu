package Blog;

import java.util.ArrayList;
import java.util.List;

public class Blog {
    List<BlogPost> blogPostList = new ArrayList<>();

    Blog(){
        blogpostList();
    }

    List<BlogPost> blogpostList(){
     BlogPost post1 = new BlogPost("Jani's blog");
     BlogPost post2 = new BlogPost("Peti's blog");
     BlogPost post3 = new BlogPost("Pisti's blog");
     BlogPost post4 = new BlogPost("My Blog");

     blogPostList.add(post1);
     blogPostList.add(post2);
     blogPostList.add(post3);
     blogPostList.add(post4);

     return blogPostList;
    }

    void deletePost(int index){
        for (int i = 0; i <blogPostList.size() ; i++) {
          if (i == index){
            blogPostList.remove(blogPostList.get(i));
          }
        }
    }

    List<BlogPost> update(int index,BlogPost post){
      blogPostList.set(index,post);

      return blogPostList;
    }

  @Override
  public String toString() {
    return "blogPostList " + blogPostList;
  }
}

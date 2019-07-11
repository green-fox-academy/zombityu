package Blog;

import java.util.ArrayList;
import java.util.List;

public class Blog {
    List<BlogPost> blogPostList = new ArrayList<>();

    void add(BlogPost blog){
        blogPostList.add(blog);
    }

}

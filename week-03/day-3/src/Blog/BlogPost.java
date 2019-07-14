package Blog;

public class BlogPost {
    String authorName;
    String title;
    String text;
    String publicationDate;

    BlogPost(String title){
        this.title = title;
    }

    @Override
    public String toString() {
        return authorName + '\'' +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", publicationDate='" + publicationDate + '\'' +
                '}';
    }
}

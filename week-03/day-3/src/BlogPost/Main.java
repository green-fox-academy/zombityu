package BlogPost;

public class Main {
    public static void main(String[] args) {
        BlogPost blog1 = new BlogPost();
        blog1.authorName = "John Doe";
        blog1.title = "Lorem Ipsum";
        blog1.text = "Lorem ipsum dolor sit amet.";
        blog1.publicationDate = "2000.05.04.";

        BlogPost blog2 = new BlogPost();
        blog1.authorName = "Tim Urban";
        blog1.title = "Wait but why";
        blog1.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
        blog1.publicationDate = "2010.10.10.";

        BlogPost blog3 = new BlogPost();
        blog1.authorName = "William Turton";
        blog1.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        blog1.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. " +
                "When I asked to take his picture outside one of IBM’s New York City offices," +
                " he told me that he wasn’t really into the whole organizer profile thing.";
        blog1.publicationDate = "2017.03.28.";
    }
}

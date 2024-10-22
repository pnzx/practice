package practice.p_4;

public class Book {
    String title;
    String author;

    public Book(String t) {
        title = t;
        author = "작자미상";
    }

    public Book(String t, String a) {
        title = t;
        author = a;
    }

    public static void main(String[] args) {
        Book littlePrince = new Book("어린왕자", "생텍쥐페리");
        Book loveStory = new Book("춘향전");
        System.out.printf("%s %s\n", littlePrince.title, littlePrince.author);
        System.out.printf("%s %s", loveStory.title, loveStory.author);
    }
}

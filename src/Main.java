import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

class Video {
    private String title;
    private String director;

    public Video(String title, String director) {
        this.title = title;
        this.director = director;
    }
}

class Newspaper {
    private String title;
    private String publisher;

    public Newspaper(String title, String publisher) {
        this.title = title;
        this.publisher = publisher;
    }
}

class MediaLibrary<T> {
    private List<T> media = new ArrayList<>();

    public void addMedia(T mediaItem) {
        media.add(mediaItem);
    }

    public List<T> getAllMedia() {
        return new ArrayList<>(media);
    }
}

public class Main {
    public static void main(String[] args) {
        MediaLibrary<Book> bookLibrary = new MediaLibrary<>();
        MediaLibrary<Video> videoLibrary = new MediaLibrary<>();
        MediaLibrary<Newspaper> newspaperLibrary = new MediaLibrary<>();

        Book book = new Book("The Lord of the Rings", "Tolkien");
        Video video = new Video("The Matrix", "Lana Wachowski");
        Newspaper newspaper = new Newspaper("The New York Times", "The New York Times Company");

        bookLibrary.addMedia(book);
        videoLibrary.addMedia(video);
        newspaperLibrary.addMedia(newspaper);

        System.out.println("Books: " + bookLibrary.getAllMedia());
        System.out.println("Videos: " + videoLibrary.getAllMedia());
        System.out.println("Newspapers: " + newspaperLibrary.getAllMedia());
    }
}
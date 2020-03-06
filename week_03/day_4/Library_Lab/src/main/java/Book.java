public class Book {

    private String Title;
    private String Author;
    private Genre genre;

    public Book(String title, String author, Genre genre) {
        this.Title = title;
        this.Author = author;
        this.genre = genre;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        this.Author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}

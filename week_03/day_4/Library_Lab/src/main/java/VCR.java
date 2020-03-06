public class VCR {
    private String Title;
    private AgeRating ageRating;
    private Genre genre;

    public VCR(String title, AgeRating ageRating, Genre genre) {
        this.Title = title;
        this.ageRating = ageRating;
        this.genre = genre;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public AgeRating getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(AgeRating ageRating) {
        this.ageRating = ageRating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}

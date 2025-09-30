package academy.devdojo.maratona.javacore.ZZDoptional.domain;

public class Manga {
    private Integer id;
    private String title;
    private int chapters;
    private String genre;
    private Integer classification;

    public Manga(Integer id, String title, int chapters, String genre, int classification) {
        this.id = id;
        this.title = title;
        this.chapters = chapters;
        this.genre = genre;
        this.classification = classification;
    }

    public Manga(Integer id, String title, int chapters, String genre) {
        this.id = id;
        this.title = title;
        this.chapters = chapters;
        this.genre = genre;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getChapters() {
        return chapters;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setChapters(int chapters) {
        this.chapters = chapters;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClassification() {
        return classification;
    }

    public void setClassification(Integer classification) {
        this.classification = classification;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", chapters=" + chapters +
                ", genre='" + genre + '\'' +
                ", classification=" + classification +
                '}';
    }
}

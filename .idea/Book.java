import java.lang.String;

public class Book extends Items {
    private String title;
    private String author;
    private Int HP;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setHP(Int HP) {
        this.HP = HP;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Int getHP() {
        return HP;
    }
}
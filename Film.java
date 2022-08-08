import java.security.Key;

public class Film {
    protected String id; 
    protected String title;
    protected FilmType type;
    protected double ranking;

    public Film(String id, String title, FilmType type, double ranking) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.ranking = ranking;
    }

    public String getId() {
        return this.id;
    }
    public String getTitle() {
        return this.getTitle();
    }
    public FilmType getType() {
        return this.type;
    }
    public double getRanking() {
        return this.ranking;
    }
    public boolean hasKeyword(String keyword) {
        return this.title.contains(keyword);
    }
}

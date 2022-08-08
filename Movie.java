public class Movie extends Film {
    int duration;
    public Movie(String id, String title, FilmType type, double ranking, int duration) {
        super(id, title, type, ranking);
        this.duration = duration;
    }

    public int getDuration() {
        return this.duration;
    }

    
    
}

public class Series extends Film {
    
    private double averageTime;
    private int epidoseNumber;

    public Series(String id, String title, FilmType type, double ranking, double averageTime, int epidoseNumber) {
        super(id, title, type, ranking);
        this.averageTime = averageTime;
        this.epidoseNumber = epidoseNumber;
    }
    
    public double getAverageTime() {
        return this.averageTime;
    }
    public int getEpisodeNumber() {
        return this.epidoseNumber;
    }
    

}

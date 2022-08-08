public class Homework6 {

    // static void sort(Movie[] movieList) {

    // }
    // static void sort(Series[] seriesList) {

    // }
    static void sort(Film[] film) {

    }
    public static void main(String[] args) {
        Movie[] movieList = new Movie[5];
        Series[] seriesList = new Series[5];

        // khai bao tung phan tu

        //
        String keyword = "abc";

        for (Movie movie : movieList) {
            if (movie.hasKeyword(keyword)) {
                //print
            }
        }
        for (Series series : seriesList) {
            if (series.hasKeyword(keyword)) {
                // print
            }
        }

        Film[] filmList = new Film[seriesList.length + movieList.length];
        for (Movie movie : movieList) {
            Film film = new Film(movie.getId(), movie.getTitle(), movie.getType(), movie.getRanking());
        }
        for (Series series : seriesList) {
            if (series.hasKeyword(keyword)) {
                // print
            }
        }

        sort(movieList);
        sort(seriesList);

        Movie movieTemp = null;
        for (Movie movie : movieList) {
            if (movie.getType() == FilmType.COMEDY) {
                if (movieTemp == null) {
                    movieTemp = movie;
                } else {
                    if (movie.getRanking() > movieTemp.getRanking()) {
                        movieTemp = movie;
                    } 
                }
            }
            
        }
    }
}

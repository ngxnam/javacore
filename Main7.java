public class Main7 {

    public static void main(String[] args) {
        // Animal animal = new Animal();
        Dog dog = new Dog("begie", "Alex");
        dog.speak();
        dog.move();

        Sedan sedan = new Sedan("Toyota", "red");
        
        Car car = new Sedan("Honda", "White");
        
        car.horn(true);

        Sedan sedan1 = (Sedan)car;
        sedan1.getColor();

        Car car2 = new Car("Ford");
        if (car2 instanceof Sedan) {
            System.out.println("car 2 la Sedan");
        } else {
            System.out.println("car 2 KHONG la Sedan");
        }
        // Sedan sedan2 = (Sedan)car2;
        // sedan2.horn(true);

        Film[] filmList = new Film[10];
        Movie m0 = new Movie("id1", "title", FilmType.ACTION, 4.8, 12);
        Series s1 = new Series("id2", "title", FilmType.COMEDY, 4.0, 120, 10);
        filmList[0] = m0;
        filmList[1] = s1;
        Film newFilm = new Film("id2",  "title", FilmType.DOCUMENTARY, 3.0);
        filmList[2] = newFilm;

        for (Film film : filmList){
            if (film != null) {
                System.out.println(film.id);
                if (film instanceof Movie) {
                    Movie movie = (Movie)film;
                    movie.getDuration();
                } else if (film instanceof Series) {
                    Series series = (Series)film;
                    series.getEpisodeNumber();
                } else {
                    System.out.println("ko biet loai doi tuong nao");
                }
            }
        }

        Sedan sedan3 = new Sedan("Nissan", "yellow");
        
        System.out.println(sedan3.getColor());

        changeColor(sedan3);

        System.out.println(sedan3.getColor());

        int number = 10;
        System.out.println(number);
        increase(number);
        System.out.println(number);
        
    }
    public static void changeColor(Sedan sedan) {
        sedan.setColor("Gray");
    }
    public static void increase(int x) {
        x = x++;
    }
}

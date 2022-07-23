public class Lecture1HomeWork {
    public static void main(String[] args) {

        int i = 10;

        int n = i++ % 5;

        System.out.println("i: " + i);
        System.out.println("n: " + n);

        i = 10;
        n = ++i % 5;
        System.out.println("i: " + i);
        System.out.println("n: " + n);

        double d = 9.0/5;
        System.out.println("d: " + d);

        System.out.println(9/5);

        int x = 50; 
        int y = 10;
        System.out.println(x > 0);
        System.out.println(x % y);
        System.out.println(x >= 2 && x <= 15);
        System.out.println(x - y < 5);
        System.out.println((x < 10) || (x > 30));
        System.out.println(x >= 10000);
        System.out.println(x >= 100000 && x <= 999999);

        double randNumber = Math.random();
        int number = (int)(randNumber * 100);
        System.out.println("number : " + number);
    }
}

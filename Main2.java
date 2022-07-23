import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        String s1 = "CAT";
        System.out.println(s1);
        
        String s2 = "Cat";
        System.out.println(s2);
        
        String s3 = new String("Cat");
        System.out.println(s3);

        String s4 = new String("Cat");
        System.out.println(s4);

        String s7 = s4;

        String s5 = "Dog";
        System.out.println(s5);

        String s6 = new String("Dog");
        System.out.println(s6);

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);

        System.out.println(s3.equals(s4));
        System.out.println(s3.equals(s1));
        System.out.println(s1.equals(s2)); 

        String txt = "Toi la coder";
        // chieu dai
        System.out.println("length: " + txt.length());
        // chuyen thanh chu hoa
        System.out.println("chu hoa: " + txt.toUpperCase());
        // chuyen thanh chu thuong
        System.out.println("chu thuong: " + txt.toLowerCase());

        char ch = txt.charAt(5);
        System.out.println("ky tu: " + ch);

        // tim chu o
       int firstIndex = txt.indexOf("o");
       System.out.println(firstIndex);

       int lastIndex = txt.lastIndexOf("o");
       System.out.println("last index: " + lastIndex);

       firstIndex = txt.indexOf("k");
       System.out.println("first index: " + firstIndex);

       String subString = txt.substring(1);
       System.out.println("subs tring: " + subString);
       subString = txt.substring(1, 8);
       System.out.println("sub string 2: " + subString);

       int index = txt.indexOf("la");
       System.out.println(index);

       
       LocalDate birthday = LocalDate.of(1988, 3, 25);

       LocalDate currentDate = LocalDate.now();
        
       //tinh tuoi
       int birthdayYear = birthday.getYear();
       int currentYear = currentDate.getYear();

       int age = currentYear - birthdayYear;
       System.out.println("tuoi: " + age);

       int month = birthday.getMonthValue();
       System.out.println("month: " + month);
       int day = birthday.getDayOfMonth();
       System.out.println("day: " + day);

       LocalDate newDate = birthday.plusDays(300);
       System.out.println(newDate);
       
       System.out.println(birthday.isLeapYear());

       System.out.println(birthday.minusMonths(4));

       LocalTime startTime = LocalTime.of(10, 30, 12);

       LocalTime newTime = startTime.minusMinutes(45);
       System.out.println(newTime);

       LocalDateTime currentTime = LocalDateTime.now();

       LocalDateTime birthTime = LocalDateTime.of(
                            LocalDate.of(1988, 3, 25), 
                            LocalTime.of(4, 15, 30)
                            );
        
        birthTime = LocalDateTime.of(1988, 03, 25, 23, 15, 30);

        System.out.println(birthTime);

        boolean compareResult = currentTime.isEqual(birthTime);
        System.out.println("is equal: " + compareResult);
        
        boolean isAfter = currentTime.isAfter(birthTime);
        System.out.println("is After: " + isAfter);

        boolean isBefore = currentTime.isBefore(birthTime);
        System.out.println("is Before: " + isBefore);

        // muc tieu: hien thi ngay theo dang nam/thang/ngay, gio theo dang gio-phut-giay
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd E W hh:mm:ss.SSS");
        String display = formatter.format(birthTime);
        System.out.println("hien thi: " + display);


        ///////// SCANNER /////////////////
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hay nhap so nguyen");
        int intNumber;
        intNumber = scanner.nextInt();
        System.out.println("ban da nhap: " + intNumber);
        
        System.out.println("Hay nhap so double");
        double doubleNumber = scanner.nextDouble();
        System.out.println("ban da nhap: " + doubleNumber);
        scanner.nextLine();
        
        System.out.println("hay nhap text");
        String inputText;
        inputText = scanner.nextLine();
        System.out.println("ban da nhap: " + inputText);


        System.out.println("Hay nhap so tu ban phim: ");
        int number = scanner.nextInt();
        
        int randNumber = (int)(Math.random() * 100);

        System.out.println("random number: " + randNumber);

        String compare = number > randNumber ? "so nhap tu ban phim lon hon" : "so nhap tu ban phim nho hon";

        System.out.println("So sanh: " + compare);

        scanner.close();

        String text = "Toi \"la\" coder";
        System.out.println(text);



    }

}

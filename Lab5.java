import java.io.Console;
import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        
        Book[] bookList = new Book[5];

        bookList[0] = new Book("BOOK1", 
                    "Toan hoc", 
                     "Nguyen Van A", 
                    "SGK", 
                 "Giao duc", 
                 1998);
        
        bookList[1] = new Book("BOOK2", 
                    "Van hoc", 
                     "Nguyen Van B", 
                    "SGK", 
                 "Giao duc", 
                 2022);

        bookList[2] = new Book("BOOK3", 
                    "Naruto", 
                     "Kishimto Masshashi", 
                    "Mange", 
                 "Kim Dong", 
                 2021);

        bookList[3] = new Book("BOOK4", 
                    "Toan nang cao", 
                     "Nguyen Van C", 
                    "Tham khao", 
                 "Tre", 
                 2021);

        bookList[4] = new Book("BOOK5", 
                    "One pice", 
                     "Echiro Oda", 
                    "Manga", 
                 "Kim Dong", 
                 2022);

        for (Book book : bookList) {
            System.out.println(book.tensach);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap tu khoa ten sach");
        String keyword = scanner.nextLine();
        scanner.close();

        for (int index = 0; index < bookList.length; index++) {
            Book book = bookList[index];
            if (book.hasKeyword(keyword)) {
                System.out.println("ten sach: " + book.tensach);        
            }        
        }

        int checkYear = 2022;
        for (Book book : bookList) {
            if (book.checkPublishYear(checkYear)) {
                System.out.println("Sach xuat ban nam " + checkYear + ": " + book.tensach);
            }
        }
        
    }
}

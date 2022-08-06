import java.time.LocalDate;
import java.time.Year;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        Employee2[] employees = new Employee2[5];
        employees[0] = new Employee2("NV01", "Nguyen Van A", LocalDate.of(1983, 2, 16), Gender.MALE, 20.5);
        employees[1] = new Employee2("NV02", "Trinh Van Quyet", LocalDate.of(1989, 9, 11), Gender.MALE, 35.8);
        employees[2] = new Employee2("NV03", "Pham Minh Tung", LocalDate.of(1997, 1, 23), Gender.MALE, 10.5);
        employees[3] = new Employee2("NV04", "Ha Ngoc My", LocalDate.of(1996, 5, 15), Gender.FEMALE, 45.5);
        employees[4] = new Employee2("NV05", "Ho Ngoc Ha", LocalDate.of(2003, 7, 27), Gender.FEMALE, 29.5);
    
        //tim theo id
        Scanner sc = new Scanner(System.in);
        System.out.print("Tim theo id: ");
        String idFind = sc.nextLine();

        for (Employee2 employee : employees) {
            if (employee.hasID(idFind)) {
                System.out.println("Tim thay nhan vien-> " + employee.toString());
            }
        }

        //tim theo ten
        System.out.println();
        System.out.print("Tim theo ten: ");
        String nameFind = sc.nextLine();

        for (Employee2 employee : employees) {
            if (employee.hasNameContain(nameFind)) {
                System.out.println("Tim thay nhan vien-> " + employee.toString());
            }
        }

        //Dem so nam_nu
        System.out.println();
        int maleCnt = 0, femaleCnt = 0;

        for (Employee2 employee : employees) {
            if (employee.gender == Gender.MALE) {
                maleCnt++;
            } else {
                femaleCnt++;
            }
        }

        System.out.println("Tong so nam: " + maleCnt + ", Tong so nu: " + femaleCnt);

        //liet ke nhan vien > 30 tuoi
        System.out.println();
        int empCnt = 0;
        LocalDate curDate = LocalDate.now();
        
        for (Employee2 employee : employees) {
            if (curDate.getYear() - employee.dateOfBirth.getYear() > 30) {
                empCnt++;
            }
        }

        System.out.println("Tong so nhan vien > 30 tuoi: " + empCnt);

        //tim nv co sinh nhat trong thang
        System.out.println();
        System.out.print("Tim sinh nhat trong thang: ");
        int monthVal = sc.nextInt();
        
        for (Employee2 employee : employees) {
            if (monthVal == employee.dateOfBirth.getMonthValue()) {
                System.out.println("Nhan vien sinh nhat trong thang " + monthVal + "-> " + employee.toString());
            }
        }

        //in ra top 3 nv luong cao nhat
        System.out.println();
        Arrays.sort(employees);
        int salCnt = 0;

        for (Employee2 employee : employees) {
            if (salCnt < 3) {
                System.out.println("Top 3 nhan vien luong cao nhat-> " + employee.toString());
                salCnt++;
            } else {
                break;
            }
        }

        sc.close();
    }
}

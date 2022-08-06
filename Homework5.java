import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.*;


// import mypack.Employee;
// import mypack.gioiTinh;

import mypack.*;
import mypack.Employee;
import mypack.animal.*;
// import mypack.Employee;
// import mypack.animal.Employee;

public class Homework5 {
    static void mangGiamDan(Employee[] employeeList){
        Employee trungGian;
        for( int i= 0; i < employeeList.length -1; i++){
            for(int j= i + 1; j < employeeList.length; j++){
                if(employeeList[i].luongThang < employeeList[j].luongThang ){
                    trungGian = employeeList[i];
                    employeeList[i] = employeeList[j];
                    employeeList[j] = trungGian;
                }
            }
        }
    }
    static void dauNgat(){
        System.out.println("----------------------------------------");
    }

    static void printLuong(Employee[] list, int index) {
        System.out.println(list[index].luongThang);
    }

    public static void main(String[] args) {
        
        Dog dog = new Dog();

        mypack.Employee employee = new mypack.Employee("", "", gioiTinh.NAM, 123);
        mypack.animal.Employee emp = new mypack.animal.Employee();

        Employee[] employeeList= new Employee[5];
        // employeeList[0]= new Employee("NV01", "Nguyen Van A", "01/01/2000", gioiTinh.NAM, 1000);
        // employeeList[1]= new Employee("NV02", "Nguyen Van B", "02/02/1888", gioiTinh.NU, 2000);
        // employeeList[2]= new Employee("NV03", "Nguyen Van C", "03/03/1876", gioiTinh.NAM, 1500);
        // employeeList[3]= new Employee("NV04", "Nguyen Van D", "04/02/2000", gioiTinh.NU, 4000);
        // employeeList[4]= new Employee("NV05", "Nguyen Van E", "05/01/2002", gioiTinh.NAM, 3500);

        employeeList[0]= new Employee("NV01", "Nguyen Van A", gioiTinh.NAM, 1000);
        employeeList[1]= new Employee("NV02", "Nguyen Van B", gioiTinh.NU, 2000);
        employeeList[2]= new Employee("NV03", "Nguyen Van C", gioiTinh.NAM, 1500);
        employeeList[3]= new Employee("NV04", "Nguyen Van D", gioiTinh.NU, 4000);
        employeeList[4]= new Employee("NV05", "Nguyen Van E", gioiTinh.NAM, 3500);

        // employeeList[0].formatter = DateTimeFormatter.ofPattern("yyyy:MM:dd");

        employeeList[0].getBirthday();

        employeeList[0].setBirthday("01/01/2000");

        printLuong(employeeList, 0);

        //tim nhan vien theo ID
        Scanner scanner= new Scanner(System.in);
        System.out.print("nhap ID nhan vien can tim: ");
        String ID= scanner.nextLine();
        for(Employee employee: employeeList){
            if (employee.checkID(ID)){
                employee.inThongTinNhanVien();//in thong tin nhan vien ID, ten, ngay sinh, gioi tinh, luong
            }
        }
        dauNgat();
        //tim nhan vien theo ten
        System.out.print("nhap ten nhan vien de tim: ");
        String keyword= scanner.nextLine();
        for(Employee employee: employeeList){
            if (employee.haskeyword(keyword)){
                employee.inThongTinNhanVien();//in thong tin nhan vien ID, ten, ngay sinh, gioi tinh, luong
            }
        }
        dauNgat();
        //dem so nhan vien nam 
        int nam= 0;
        int nu = 0;
        for(Employee employee: employeeList){
            if (employee.checkGioiTinh(gioiTinh.NAM)){
                nam++;
            } else {
                nu++;
            }
        }
        System.out.println("so nhan vien nam trong cong ty: "+ nam);
        System.out.println("so nhan vien nu trong cong ty: "+ (employeeList.length-nam));
        dauNgat();
        //cac nhan vien tren 30tuoi
        System.out.println("nhan vien tren 30t");
        for(Employee employee: employeeList){
            if (employee.isGreater30YearOld()){
                employee.inThongTinNhanVien();//in thong tin nhan vien ID, ten, ngay sinh, gioi tinh, luong
            }
        }
        dauNgat();
        //in ra nhan vien sinh nhat trong thang
        System.out.print("nhap thang can kiem tra nhan vien co sinh nhat:");
        int month= scanner.nextInt();
        for(Employee employee: employeeList){

            if (employee.checkBirthMonth(month)){
                employee.inThongTinNhanVien();//in thong tin nhan vien ID, ten, ngay sinh, gioi tinh, luong
            }
        }
        dauNgat();
        //in ra top 3 nguoi luong cao nhat
        mangGiamDan(employeeList);//sap xep mang giam dan the luong thang
        System.out.println("top 3 nguoi luong cao la:");
        employeeList[0].inThongTinNhanVien();
        employeeList[1].inThongTinNhanVien();
        employeeList[2].inThongTinNhanVien();
        scanner.close();
    }
}
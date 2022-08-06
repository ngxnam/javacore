package mypack;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class Employee {

    //khai bao thuoc tinh
    public String id;
    public String ten;
    private LocalDate ngaySinh;
    //public LocalDate ngaySinh;
    public gioiTinh namORnu;
    public long luongThang;
    //constructor
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");//formatter time
    
    public Employee(String id, String ten, gioiTinh female, long luongThang){
        this.id= id;
        this.ten= ten;
        //this.ngaySinh= ngaySinh;
        // this.ngaySinh= LocalDate.parse(ngaySinh, formatter);//chuyen String sang date
        this.namORnu= female;
        this.luongThang= luongThang;
    }
    //tim chinh xac this.id
    public boolean checkID(String ID){
        boolean result= this.id.equals(ID);
        return result;
    }
    //tim chinh xac this.namORnu
    public boolean checkGioiTinh(gioiTinh XY){
        boolean result= this.namORnu.equals(XY); //this.namORnu == XY;
        return result;
    }
    //tim theo tu khoa this.ten
    public boolean haskeyword(String keyword){
        boolean result= this.ten.contains(keyword);
        return result;
    }
    //in thong tin nhan vien
    public void inThongTinNhanVien(){
        System.out.print(this.id+ "\t");
        System.out.print(this.ten+ "\t");
        System.out.print(this.ngaySinh+ "\t");
        System.out.print(this.namORnu+ "\t");
        System.out.print(this.luongThang+ "d\n");
    }
    //kiem tra nhan vien tren 30 tuoi
    public boolean isGreater30YearOld(){
        LocalDate now= LocalDate.now();
        int age= Period.between(this.ngaySinh, now).getYears();
        boolean result= (age > 30)? true: false;//kiem tra co hon 30t khong
        // age = now.getYear() - this.ngaySinh.getYear();
        return result;
    }
    //kiem tra thang
    public boolean checkBirthMonth(int month){
        boolean result= this.ngaySinh.getMonthValue()==month;
        return result;
    }
    //tim chinh xac luong
    public boolean checkluongThang(long luong){
        boolean result= this.luongThang == luong;
        return result;
    }

    public void setBirthday(String birthday) {
        this.ngaySinh = LocalDate.parse(birthday, this.formatter);
    }
    public String getBirthday() {
        // return this.ngaySinh.format(this.formatter);
        return "";
    }
}
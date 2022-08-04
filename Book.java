public class Book {
    public String masach;
    public String tensach;
    public String tacgia;
    public String theloai;
    public String nhaxuatban;
    public int namxuatban;

    public Book(String masach, String tensach, 
                String tacgia, String theloai, 
                String nhaxuatban, int namxuatban) {
        this.masach = masach;
        this.tensach = tensach;
        this.tacgia = tacgia;
        this.theloai = theloai;
        this.nhaxuatban = nhaxuatban;
        this.namxuatban = namxuatban;
    }

    public boolean hasKeyword(String keyword) {
        boolean result = this.tensach.contains(keyword);
        return result;
    }
    public boolean checkPublishYear(int year) {
        boolean result = this.namxuatban == year;
        return result;
    }
}

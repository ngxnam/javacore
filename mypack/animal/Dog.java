package mypack.animal;

enum GENDER {
    MALE,
    FEMALE
}
public class Dog {
    public String breed;
    public String size;
    public int age;
    public String color;

    public GENDER gender; 

    public Dog() {
        breed = "abx";
        size = "Small";
        age = 2;
        color = "Grey";
    }

    public Dog(String breed, String size, int age, String color) {
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color = color;
    }
    
    public void printGender() {
        if (this.gender == GENDER.MALE) {
            System.out.println("gioi tinh duc");
        } else if (this.gender == GENDER.FEMALE) {
            System.out.println("gioi tinh cai");
        } else {
            System.out.println("Ko biet gioi tinh");
        }
    }

    public void eat() {
        System.out.println("mum mum mum");
    }
    public void bark() {
        System.out.println("go go go....");
    }
    
    /**
     * in ra ten cac thuoc tinh
     */
    public void print() {
        // System.out.println(this.breed);
        // System.out.println(this.size);
        // System.out.println(this.age);
        // System.out.println(this.color);
        String textToPrint = this.toString();
        System.out.println(textToPrint);
    }

    // convert object to text
    public String toString() {
        String text = this.breed + " " + this.size + " " + this.age + " " + this.color;
        return text;
    }
}
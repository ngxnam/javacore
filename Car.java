public class Car {
    String brand;
    
    public Car(String brand) {
        this.brand = brand;
    }

    public void horn(boolean isCrowd) {
        if (isCrowd) {
            System.out.println("TUY TUY TUY TUY");
        } else {
            System.out.println("Tuyt tuy...");
        }
    }
}

public class Sedan extends Car {
    String color;
    public Sedan(String brand, String color) {
        super(brand);
        this.color = color;
    }
    
    @Override
    public void horn(boolean isCrowd) {
        System.out.println("bim bim");
    }

    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}

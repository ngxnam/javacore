public class Dog extends Animal {

    public Dog(String breed, String name) {
        this.breed = breed;
        this.name = name;
    }
    @Override
    public void speak() {
        
        System.out.println(this.name + " Speak GO GO !!!!");
        
    }

    public void move() {
        super.move();
        // super.getName();
        System.out.println(super.getName() + " Dog move");
    }
    
}

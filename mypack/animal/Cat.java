package mypack.animal;

public class Cat extends Animal {

    public Cat(double weight) {
        this.weight = weight;
    }

    // public double getWeight() {
    //     return this.weight;
    // }
    // public double getCatWeigh() {
    //     return this.getWeight();
    // }
    public void run(double speed) {
        System.out.println("speed with double value: " + speed);
    }
    public void run(float speed) {
        System.out.println("speed with float value" + speed);
    }
    public void run(double speed, int second) {
        System.out.println("in " + second + " the cat will get speed " + speed);
    }
}

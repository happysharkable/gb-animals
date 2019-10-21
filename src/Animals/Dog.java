package Animals;

public class Dog extends Animal {

    public Dog() {
        runLimit = 500;
        jumpLimit = 0.5;
        swimLimit = 10;
    }

    public Dog(double runLimit, double jumpLimit, double swimLimit) {
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
        this.swimLimit = swimLimit;
    }

    @Override
    public void run(double distance) {
        if (distance <= runLimit) { System.out.println("run: true"); return; }
        System.out.println("run: false");
    }
    @Override
    public void jump(double height) {
        if (height <= jumpLimit) { System.out.println("jump: true"); return; }
        System.out.println("jump: false");
    }

    @Override
    public void swim(double distance) {
        if (distance <= swimLimit) { System.out.println("swim: true"); return; }
        System.out.println("swim: false");
    }
}

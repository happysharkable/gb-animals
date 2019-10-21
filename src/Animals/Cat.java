package Animals;

public class Cat extends Animal {
    private int appetite;
    private boolean hungry = true;
    private Bowl bowl = new Bowl(15);

    public Cat() {
        runLimit = 200;
        jumpLimit = 2;
        appetite = 10;
    }

    public Cat(double runLimit, double jumpLimit, int appetite) {
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
        this.appetite = appetite;
    }

    public void eat() {
        if (bowl.isEnoughFood(appetite)) {
            this.hungry = false;
            bowl.eat(appetite);
        }
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isHungry() {
        if (hungry) {
            return true;
        } else {
            return false;
        }
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
        System.out.println("swim: false");
    }

}

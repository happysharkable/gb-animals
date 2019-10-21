package Animals;

public abstract class Animal {
    protected double runLimit;
    protected double jumpLimit;
    protected double swimLimit;
    public abstract void run(double distance);
    public abstract void jump(double height);
    public abstract void swim(double distance);
}

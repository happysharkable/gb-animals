package Animals;

public class Bowl {
    private int volume;
    private int food;

    public Bowl(int volume) {
        this.volume = volume;
        this.food = volume;
    }

    public boolean isEnoughFood(int foodWanted) {
        boolean result = false;
        if (foodWanted <= food) result = true;
        return result;
    }

    public void eat(int foodEaten) {
        food -= foodEaten;
    }

    public void fillWithFood() {
        food = volume;
    }

    public int getFoodLeft() {
        return food;
    }
}

public class PetRock {
    private String name;
    private boolean happy = false;
    private int favNumber= 42;
    private double massInGrams = 0;

    public PetRock(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isHappy() {
        return happy;
    }

    public void playWithRock() {
        happy = true;
    }

    public String getHappyMessage() {
        if (!happy) {
            throw new IllegalStateException();
        }
        return "I'm happy!";
    }

    public int getFavNumber() {
        return 42;
    }

    public void waitTillHappy() {
        while (!happy) {
        //do nothing
        }
    }

    public double getMassInGrams() {
        return massInGrams;
    }

    public void setMassInGrams(double massInGrams) {
        this.massInGrams = massInGrams;
    }

    public String toString() {
        return "PetRock{" +
                "name='" + name + '\'' +
                ", happy=" + happy +
                ", favNumber=" + favNumber +
                ", massInGrams=" + massInGrams +
                '}';
    }
}

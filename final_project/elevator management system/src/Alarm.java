public class Alarm {
    private boolean isActive;

    public Alarm() {
        this.isActive = false;
    }

    public void activate() {
        isActive = true;
        System.out.println("Alarm activated");
    }

    public void deactivate() {
        isActive = false;
        System.out.println("Alarm deactivated");
    }

    public boolean isActive() {
        return isActive;
    }
}

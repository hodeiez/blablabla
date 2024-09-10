public class Sensor {
    boolean isActivated;

    public boolean isActivated() {
        return isActivated;
    }

    public Sensor(boolean isActivated) {
        this.isActivated = isActivated;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }
}

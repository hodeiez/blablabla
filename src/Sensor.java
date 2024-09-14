public class Sensor {
    private boolean isActivated;
    private boolean detected;


    public boolean isActivated() {
        return isActivated;
    }

    public Sensor(boolean isActivated) {
        this.isActivated = isActivated;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }

    public boolean isDetected() {
        return detected;
    }

    public void setDetected(boolean detected) {
        this.detected = detected;
    }

    public void setOpen(boolean b) {
    }
}


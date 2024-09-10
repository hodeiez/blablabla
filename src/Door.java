public class Door extends Sensor {
    boolean isOpen;

    public Door(boolean isActivated, boolean isOpen) {
        super(isActivated);
        this.isOpen = isOpen;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    }

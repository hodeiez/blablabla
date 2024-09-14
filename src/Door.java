public class Door extends SensorOpenClose {
    private boolean isOpen;

    public Door(boolean isActivated, boolean isOpen) {
        super(isActivated);
        this.isOpen = isOpen;
    }

    public boolean isOpen() {

        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
        if(this.isOpen){
            setDetected(true);
        }
    }

    @Override
    public void setDetected(boolean detected) {
        super.setDetected(detected);
    }
}

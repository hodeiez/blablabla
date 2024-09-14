public class Door extends SensorOpenClose {
    private boolean isOpen;

    public Door(boolean isActivated, boolean isOpen) {
        super(isActivated);
        this.isOpen = isOpen;
    }

    public boolean isOpen() {

        return isOpen;
    }
    @Override
    public void setOpen(boolean open) {
        isOpen = open;
        if(this.isOpen){
            setDetected(true);
        }
    }
    public Sensor getSensor(){
        return this;
    }
    @Override
    public void setDetected(boolean detected) {
        super.setDetected(detected);
    }
}

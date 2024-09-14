public class Window extends SensorOpenClose {
    private boolean isOpen;

    public Window(boolean isActivated, boolean isOpen) {
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
    public Sensor getSensor(){
        return this;
    }
    @Override
    public void setDetected(boolean detected) {
        super.setDetected(detected);
    }
}
public class SensorOpenClose extends Sensor{
    boolean open;
    public SensorOpenClose(boolean isActivated) {
        super(isActivated);
    }

    @Override
    public boolean isDetected() {
        return super.isDetected();
    }
    public boolean isOpen(){
        return  open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }
}

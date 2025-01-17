package sensors;

public class SensorOpenClose extends Sensor{
    boolean open;

    public SensorOpenClose(String id, String objectType,boolean activated,String placedAt) {
        super(activated,false,id,objectType,SensorType.OPEN.toString(), placedAt);
    }

    @Override
    public boolean isDetected() {
        return isOpen() && isActivated;
    }
    public boolean isOpen(){
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }
    @Override
    public void setObjectActionated(){
        setOpen(true);
    }
    @Override
    public String getIdentification(){
        return objectType + " with id: " + objectId;
    }
    @Override
    public String getSensorType() {
        return "opened";
    }
}

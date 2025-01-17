package sensors;

public class SensorMovement extends Sensor{
    boolean bastardMoving;

    public SensorMovement(boolean isActivated, boolean detected, String objectId, String objectType, boolean bastardMoving,String placedAt) {
        super(isActivated, detected, objectId, objectType, SensorType.MOTION.toString(), placedAt);
        this.bastardMoving = bastardMoving;
    }

    private boolean isBastardMoving() {
        return bastardMoving;
    }

    public void setBastardMoving(boolean bastardMoving) {
        this.bastardMoving = bastardMoving;
    }
    @Override
    public boolean isDetected() {
        return isBastardMoving() && isActivated;
    }
    @Override
    public void setObjectActionated(){
        setBastardMoving(true);
    }
    @Override
    public String getIdentification(){
        return objectType + " with id: " + objectId;
    }
    @Override
    public String getSensorType() {
        return "motion";
    }
}

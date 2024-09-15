package sensors;

public class SensorSmoke extends Sensor{
 boolean smoke;

    public SensorSmoke(boolean isActivated, boolean detected, String objectId, String objectType, String sensorType,boolean smoke) {
        super(isActivated, detected, objectId, objectType, sensorType);
        this.smoke = smoke;
    }

    public boolean isSmoke() {
        return smoke;
    }

    public void setSmoke(boolean smoke) {
        this.smoke = smoke;
    }

    @Override
    public boolean isDetected() {
        return isSmoke() && isActivated;
    }
    @Override
    public void setObjectActionated(){
        setSmoke(true);
    }
    @Override
    public String getIdentification(){
        return objectType + " with id: " + objectId;
    }
    @Override
    public String getSensorType() {
        return "smoke";
    }
}
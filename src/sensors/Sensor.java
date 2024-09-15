package sensors;

public abstract class Sensor {
    boolean isActivated;
    boolean detected;
    String objectId;
    String objectType;
    String sensorType;
    String placedAt;

    public Sensor(boolean isActivated, boolean detected, String objectId, String objectType, String sensorType, String placedAt) {
        this.isActivated = isActivated;
        this.detected = detected;
        this.objectId = objectId;
        this.objectType = objectType;
        this.sensorType = sensorType;
        this.placedAt = placedAt;
    }


    public boolean isActivated() {
        return isActivated;
    }


    public void setActivated(boolean activated) {
        isActivated = activated;
    }

    public boolean isDetected() {
        return detected;
    }

    public void setObjectActionated(){

    }
    public String getIdentification(){
        return "sensors.Sensor not attached to object";
    }
    public String getSensorType() {
        return "sensors.Sensor type not defined";
    }
    public String getPlacedAt() {
        return this.placedAt;
    }
}


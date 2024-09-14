public abstract class Sensor {
    boolean isActivated;
    boolean detected;
    String objectId;
    String objectType;
    String sensorType;

    public Sensor(boolean isActivated, boolean detected, String objectId, String objectType, String sensorType) {
        this.isActivated = isActivated;
        this.detected = detected;
        this.objectId = objectId;
        this.objectType = objectType;
        this.sensorType = sensorType;
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
        return "Sensor not attached to object";
    }
    public String getSensorType() {
        return "Sensor type not defined";
    }
}


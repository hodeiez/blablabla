package sensors;

public enum SensorType {
    SMOKE("smoke"),
    MOTION("motion"),
    OPEN("openClose");

    private final String name;

    SensorType(String s) {
        name = s;
    }

    public String toString() {
        return this.name;
    }

}


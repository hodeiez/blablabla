package sensors;

public enum ObjectType {
    WINDOW("window"),
    DOOR("door"),
    ROOM("room");

    private final String name;

    ObjectType(String s) {
        name = s;
    }

    public String toString() {
        return this.name;
    }
}


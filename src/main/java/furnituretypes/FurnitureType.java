package furnituretypes;

public abstract class FurnitureType {
    private final String name;

    FurnitureType(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

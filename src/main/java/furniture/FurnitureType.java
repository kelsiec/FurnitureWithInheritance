package furniture;

public enum FurnitureType {
    CHAIR("chair"),
    TABLE("table");

    private final String name;

    FurnitureType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

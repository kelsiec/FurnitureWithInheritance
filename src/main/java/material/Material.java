package material;

public abstract class Material {
    private final String name;
    private boolean isBroken;
    private boolean isBurnt;

    public Material(String name) {
        this.name = name;
    }

    public void hit() {
        isBroken = true;
    }

    public void setFire() {
        isBurnt = true;
    }

    public String getName() {
        return name;
    }

    public boolean getBroken() {
        return isBroken;
    }

    public boolean getBurnt() {
        return isBurnt;
    }
}

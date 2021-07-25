package materials;

import java.util.Locale;

public abstract class Material {
    private boolean isBroken; // has a
    private boolean isBurnt; // has a

    public void hit() {
        isBroken = true;
    }

    public void setFire() {
        isBurnt = true;
    }

    public boolean getBroken() {
        return isBroken;
    }

    public boolean getBurnt() {
        return isBurnt;
    }

    public String toString() {
        return this.getClass().getSimpleName().toLowerCase();
    }
}

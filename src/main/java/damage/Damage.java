package damage;

public class Damage {
    private boolean damaged = false;

    public boolean isDamaged() {
        return damaged;
    }

    public void applyDamage() {
        damaged = true;
    }
}

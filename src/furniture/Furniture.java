package furniture;

import materials.Material;
import damage.DamageType;

public abstract class Furniture {
    private String name;
    private Material material;

    @SuppressWarnings("WeakerAccess")
    protected Furniture(String name, Material material) {
        this.name = name;
        this.material = material;
    }

    public void damage(DamageType damageType) {
        this.material.applyDamage(damageType);
    }

    public void printStatus() {
        System.out.println(
            String.format(
                "The %s %s is %sbroken, and it is %sburnt.",
                this.material.getName(),
                this.name,
                this.material.isDamaged(DamageType.BLUNT) ? "" : "not ",
                this.material.isDamaged(DamageType.FIRE) ? "" : "not "
            )
        );
    }
}

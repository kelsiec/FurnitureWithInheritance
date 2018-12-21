package furniture;

import materials.Material;
import materials.MaterialType;
import damage.DamageType;

public class Furniture {
    private Material material;
    private FurnitureType furnitureType;

    public Furniture(FurnitureType furnitureType, MaterialType materialType) {
        this.furnitureType = furnitureType;
        this.material = new Material(materialType);
    }

    public void damage(DamageType damageType) {
        this.material.applyDamage(damageType);
    }

    public void printStatus() {
        System.out.println(
                String.format(
                        "The %s %s is %sbroken, and it is %sburnt.",
                        this.material.getName(),
                        this.furnitureType.getName(),
                        this.material.isDamaged(DamageType.BLUNT) ? "" : "not ",
                        this.material.isDamaged(DamageType.FIRE) ? "" : "not "
                )
        );
    }
}

package furniture;

import materials.Material;
<<<<<<< HEAD
import damage.DamageType;

public abstract class Furniture {
    private String name;
    private Material material;

    @SuppressWarnings("WeakerAccess")
    protected Furniture(String name, Material material) {
        this.name = name;
        this.material = material;
=======
import materials.MaterialType;
import materials.damage.DamageType;

public class Furniture {
    private Material material;
    private FurnitureType furnitureType;

    public Furniture(FurnitureType furnitureType, MaterialType materialType) {
        this.furnitureType = furnitureType;
        this.material = new Material(materialType);
>>>>>>> 4fd5fba... initial commit
    }

    public void damage(DamageType damageType) {
        this.material.applyDamage(damageType);
    }

    public void printStatus() {
        System.out.println(
            String.format(
                "The %s %s is %sbroken, and it is %sburnt.",
                this.material.getName(),
<<<<<<< HEAD
                this.name,
=======
                this.furnitureType.getName(),
>>>>>>> 4fd5fba... initial commit
                this.material.isDamaged(DamageType.BLUNT) ? "" : "not ",
                this.material.isDamaged(DamageType.FIRE) ? "" : "not "
            )
        );
    }
}

import furnituretypes.FurnitureType;
import materials.Material;

public class Furniture {
    private final Material material;
    private final FurnitureType furnitureType;

    public Furniture(FurnitureType furnitureType, Material materialType) {
        this.furnitureType = furnitureType;
        this.material = materialType;
    }

    public void hit() {
        this.material.hit();
    }

    public void setFire() {
        this.material.setFire();
    }

    public void printStatus() {
        System.out.printf(
                "The %s %s is %sbroken, and it is %sburnt.%n",
                this.material,
                this.furnitureType,
                this.material.getBroken() ? "" : "not ",
                this.material.getBurnt() ? "" : "not "
        );
    }
}

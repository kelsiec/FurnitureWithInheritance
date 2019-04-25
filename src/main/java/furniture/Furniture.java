package furniture;

import material.Material;

public abstract class Furniture {
    private final String furnitureType;
    private Material material;

    public Furniture(String furnitureType, Material materialType) {
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
        System.out.println(
                String.format(
                        "The %s %s is %sbroken, and it is %sburnt.",
                        this.material.getName(),
                        this.furnitureType,
                        this.material.getBroken() ? "" : "not ",
                        this.material.getBurnt() ? "" : "not "
                )
        );
    }
}

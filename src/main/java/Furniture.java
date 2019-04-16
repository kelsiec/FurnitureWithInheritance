public class Furniture {
    private String material;
    private String furnitureType;
    private boolean isBroken;
    private boolean isBurnt;

    public Furniture(String furnitureType, String materialType) {
        this.furnitureType = furnitureType;
        this.material = materialType;
    }

    public void hit() {
        isBroken = true;
    }

    public void setFire() {
        if (!material.equals("glass")) {
            isBurnt = true;
        }
    }

    public void printStatus() {
        System.out.println(
                String.format(
                        "The %s %s is %sbroken, and it is %sburnt.",
                        this.material,
                        this.furnitureType,
                        this.isBroken ? "" : "not ",
                        this.isBurnt ? "" : "not "
                )
        );
    }
}

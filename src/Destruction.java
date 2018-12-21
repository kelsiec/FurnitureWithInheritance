import furniture.Furniture;
import furniture.FurnitureType;
import materials.MaterialType;
import damage.DamageType;

public class Destruction {
    public static void main(String[] args) {
        Furniture chair = new Furniture(FurnitureType.CHAIR, MaterialType.PLYWOOD);
        chair.printStatus();

        System.out.println("Thwacking the chair...");
        chair.damage(DamageType.BLUNT);
        chair.printStatus();

        System.out.println("Setting fire to the chair...");
        chair.damage(DamageType.FIRE);
        chair.printStatus();

        System.out.println();

        Furniture table = new Furniture(FurnitureType.TABLE, MaterialType.GLASS);
        table.printStatus();

        System.out.println("Thwacking the table...");
        table.damage(DamageType.BLUNT);
        table.printStatus();

        System.out.println("Setting fire to the table...");
        table.damage(DamageType.FIRE);
        table.printStatus();
    }
}

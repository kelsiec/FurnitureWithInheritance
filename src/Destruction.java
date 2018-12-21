<<<<<<< HEAD
import furniture.Chair;
import furniture.Furniture;
import furniture.Table;
import materials.Glass;
import materials.Plywood;
import damage.DamageType;

public class Destruction {
    public static void main(String[] args) {
        Furniture table = new Chair(new Plywood());
=======
import furniture.Furniture;
import furniture.FurnitureType;
import materials.MaterialType;
import materials.damage.DamageType;

public class Destruction {
    public static void main(String[] args) {
        Furniture table = new Furniture(FurnitureType.CHAIR, MaterialType.PLYWOOD);
>>>>>>> 4fd5fba... initial commit
        table.printStatus();

        System.out.println("Thwacking the chair...");
        table.damage(DamageType.BLUNT);
        table.printStatus();

        System.out.println("Setting fire to the chair...");
        table.damage(DamageType.FIRE);
        table.printStatus();

        System.out.println();

<<<<<<< HEAD
        Furniture table2 = new Table(new Glass());
=======
        Furniture table2 = new Furniture(FurnitureType.TABLE, MaterialType.GLASS);
>>>>>>> 4fd5fba... initial commit
        table2.printStatus();

        System.out.println("Thwacking the table...");
        table.damage(DamageType.BLUNT);
        table2.printStatus();

        System.out.println("Setting fire to the table...");
        table.damage(DamageType.FIRE);
        table2.printStatus();
    }
}

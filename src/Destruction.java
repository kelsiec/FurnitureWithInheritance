import furniture.Chair;
import furniture.Furniture;
import furniture.Table;
import materials.Glass;
import materials.Plywood;
import materials.damage.DamageType;

public class Destruction {
    public static void main(String[] args) {
        Furniture table = new Chair(new Plywood());
        table.printStatus();

        System.out.println("Thwacking the chair...");
        table.damage(DamageType.BLUNT);
        table.printStatus();

        System.out.println("Setting fire to the chair...");
        table.damage(DamageType.FIRE);
        table.printStatus();

        System.out.println();

        Furniture table2 = new Table(new Glass());
        table2.printStatus();

        System.out.println("Thwacking the table...");
        table.damage(DamageType.BLUNT);
        table2.printStatus();

        System.out.println("Setting fire to the table...");
        table.damage(DamageType.FIRE);
        table2.printStatus();
    }
}

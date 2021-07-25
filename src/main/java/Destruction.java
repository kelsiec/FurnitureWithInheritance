import furnituretypes.Chair;
import furnituretypes.Table;
import materials.Glass;
import materials.Plywood;

public class Destruction {
    public static void main(String[] args) {
        Furniture chair = new Furniture(new Chair(),new Plywood());
        chair.printStatus();

        System.out.println("Thwacking the chair...");
        chair.hit();
        chair.printStatus();

        System.out.println("Setting fire to the chair...");
        chair.setFire();
        chair.printStatus();

        System.out.println();

        Furniture table = new Furniture(new Table(), new Glass());
        table.printStatus();

        System.out.println("Thwacking the table...");
        table.hit();
        table.printStatus();

        System.out.println("Setting fire to the table...");
        table.setFire();
        table.printStatus();
    }
}

package materials;

import materials.damage.DamageType;

import java.util.Arrays;
import java.util.HashSet;

public class Plywood extends Material {
    public Plywood() {
        super("plywood", new HashSet<>(Arrays.asList(DamageType.BLUNT, DamageType.FIRE)));
    }
}

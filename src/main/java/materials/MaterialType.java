package materials;

import damage.DamageType;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public enum MaterialType {
    GLASS ("glass", new HashSet<>(Collections.singletonList((DamageType.BLUNT)))),
    PLYWOOD("plywood", new HashSet<>(Arrays.asList(DamageType.BLUNT, DamageType.FIRE)));

    private final String name;
    private final HashSet<DamageType> damageTypes;

    MaterialType(String name, HashSet<DamageType> damageTypes) {
        this.name = name;
        this.damageTypes = damageTypes;
    }

    public String getName() {
        return name;
    }

    public HashSet<DamageType> getDamageTypes() {
        return damageTypes;
    }

}

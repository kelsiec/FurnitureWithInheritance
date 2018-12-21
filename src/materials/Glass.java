package materials;

import damage.DamageType;

import java.util.Collections;
import java.util.HashSet;

public class Glass extends Material {
    public Glass() {
        super("glass", new HashSet<>(Collections.singletonList((DamageType.BLUNT))));
    }
}

package materials;

import damage.Damage;
import damage.DamageType;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public abstract class Material {
    private final String name;
    private Map<DamageType, Damage> damages;

    protected Material(String name, HashSet<DamageType> damageTypes) {
        this.name = name;

        damages = new HashMap<>();
        for (DamageType damageType : damageTypes) {
            damages.put(damageType, new Damage());
        }
    }

    public String getName() {
        return this.name;
    }

    public void applyDamage(DamageType damageType) {
        Damage damage = damages.get(damageType);
        if (damage != null) {
            damage.applyDamage();
        }
    }

    public boolean isDamaged(DamageType damageType) {
        Damage damage = damages.get(damageType);
        if (damage != null) {
            return damage.isDamaged();
        } else {
            return false;
        }
    }
}

package materials;

import materials.damage.Damage;
import materials.damage.DamageType;

import java.util.HashMap;
import java.util.Map;

public class Material {
    private final String name;
    private Map<DamageType, Damage> damages;

    public Material(MaterialType materialType) {
        this.name = materialType.getName();

        damages = new HashMap<>();
        for (DamageType damageType : materialType.getDamageTypes()) {
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

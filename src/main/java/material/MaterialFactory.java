package material;

public class MaterialFactory {
    public static Material getMaterialType(String materialType) {
        if (materialType.equalsIgnoreCase("glass")) {
            return new Glass();
        } else if (materialType.equalsIgnoreCase("plywood")) {
            return new Plywood();
        }

        throw new UnsupportedOperationException(
                "Material type " + materialType + "is not supported."
        );
    }
}

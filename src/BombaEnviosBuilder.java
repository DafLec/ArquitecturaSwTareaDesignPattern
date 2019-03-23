public class BombaEnviosBuilder extends ProveedorBuilder {
    private static final String NOMBRE =  "Bomba Envios";
    private static final String UBICACION = "Yucatan";
    private static final double PRECIO_CAJA = 42.0;
    private static final double PRECIO_DOCS = 20.0;

    @Override
    public Proveedor buildProveedor() {
        BombaEnvios bombaEnvios = new BombaEnvios(NOMBRE, UBICACION, PRECIO_CAJA, PRECIO_DOCS);
        return bombaEnvios;
    }
}

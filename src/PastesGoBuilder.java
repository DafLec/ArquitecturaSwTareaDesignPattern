public class PastesGoBuilder extends ProveedorBuilder {
    private static final String NOMBRE =  "Pastes Go";
    private static final String UBICACION = "Pachuca";
    private static final double PRECIO_CAJA = 19.0;
    private static final double PRECIO_DOCS = 59.0;
    private static final double PRECIO_EXCESO = 600.0;

    @Override
    public Proveedor buildProveedor() {
        PastesGo pastesGo = new PastesGo(NOMBRE, UBICACION, PRECIO_CAJA, PRECIO_DOCS, PRECIO_EXCESO);
        return pastesGo;
    }
}

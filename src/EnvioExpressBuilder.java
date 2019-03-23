public class EnvioExpressBuilder extends ProveedorBuilder {
    private static final String NOMBRE =  "Envio Express";
    private static final String UBICACION = "Sonora";
    private static final double PRECIO_CAJA = 25.0;
    private static final double PRECIO_DOCS = 39.0;
    private static final double PRECIO_EXCESO = 500.0;

    @Override
    public Proveedor buildProveedor() {
        EnvioExpress envioExpress = new EnvioExpress(NOMBRE, UBICACION, PRECIO_CAJA, PRECIO_DOCS, PRECIO_EXCESO);
        return envioExpress;
    }
}

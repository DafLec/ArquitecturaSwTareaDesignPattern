public interface Proveedor {
    static double LIMITE_DIMENSIONES = 100.0;
    static final double PESO_ESTANDAR = 250.0;
    public double calcularPrecio(Envio envio);
}

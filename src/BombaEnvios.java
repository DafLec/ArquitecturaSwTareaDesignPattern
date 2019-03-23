public class BombaEnvios implements Proveedor{

    private final String nombre;
    private final String ubicacion;
    private final double precioCaja;
    private final double precioDocs;

    public BombaEnvios(final String nombre, final String ubicacion, final double precioCaja,
                        final double precioDocs){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.precioCaja = precioCaja;
        this.precioDocs = precioDocs;
    }

    @Override
    public double calcularPrecio(Envio envio) {
        double precio = 0;
        if(envio.getTipo().equals("documento")){
            precio = precioDocs * envio.getPeso()/PESO_ESTANDAR;
        } else{
            if(envio.getTipo().equals("caja")){
                precio = precioCaja * envio.getPeso()/PESO_ESTANDAR;
            }
        }
        return precio;
    }
}

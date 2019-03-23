public class PastesGo implements Proveedor{

    private final String nombre;
    private final String ubicacion;
    private final double precioCaja;
    private final double precioDocs;
    private final double precioExceso;

    public PastesGo(final String nombre, final String ubicacion, final double precioCaja,
                    final double precioDocs, final double precioExceso){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.precioCaja = precioCaja;
        this.precioDocs = precioDocs;
        this.precioExceso = precioExceso;
    }

    @Override
    public double calcularPrecio(Envio envio) {
        double precio = 0;
        if(envio.getTipo().equals("documento")){
            precio = precioDocs * envio.getPeso()/PESO_ESTANDAR;
        } else{
            if(envio.getTipo().equals("caja")){
                precio = this.precioCaja * envio.getPeso()/PESO_ESTANDAR;
            }
            if(envio.getDimensiones() > LIMITE_DIMENSIONES){
                double extra = envio.getDimensiones() - LIMITE_DIMENSIONES;
                precio += extra * precioExceso;
            }
        }
        return precio;
    }

}

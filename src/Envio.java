import java.util.List;

public class Envio {
    private String id;
    private String dirEntrega;
    private String dirRemitente;
    private String cpEntrega;
    private String cpRemitente;
    private Double peso;
    private Proveedor proveedor;
    private String tipo;
    private List<String> etiquetas;
    private double dimensiones;
    private String ruta;
    private double precio;

    public Envio (String id, String dirEntrega, String dirRemitente,
                  String cpEntrega, String cpRemitente, Double peso,
                  String tipo, List<String> etiquetas, Double dimensiones, String ruta){
        this.id = id;
        this.dirEntrega = dirEntrega;
        this.dirRemitente = dirRemitente;
        this. cpEntrega = cpEntrega;
        this.cpRemitente = cpRemitente;
        this.peso = peso;
        this.tipo = tipo;
        this.etiquetas = etiquetas;
        this.dimensiones = dimensiones;
        this.ruta = ruta;

        this.proveedor = definirProveedor();
        this.precio = proveedor.calcularPrecio(this);
    }

    public Proveedor definirProveedor(){
        ProveedorBuilder builder;
        switch (cpEntrega){
            case "Yucatan":
                builder = new BombaEnviosBuilder();
                return  builder.buildProveedor();
            case "Pachuca":
                builder = new PastesGoBuilder();
                return builder.buildProveedor();
            default:
                builder = new EnvioExpressBuilder();
                return builder.buildProveedor();
        }
    }

    public double getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(double dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDirEntrega() {
        return dirEntrega;
    }

    public void setDirEntrega(String dirEntrega) {
        this.dirEntrega = dirEntrega;
    }

    public String getDirRemitente() {
        return dirRemitente;
    }

    public void setDirRemitente(String dirRemitente) {
        this.dirRemitente = dirRemitente;
    }

    public String getCpEntrega() {
        return cpEntrega;
    }

    public void setCpEntrega(String cpEntrega) {
        this.cpEntrega = cpEntrega;
    }

    public String getCpRemitente() {
        return cpRemitente;
    }

    public void setCpRemitente(String cpRemitente) {
        this.cpRemitente = cpRemitente;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<String> getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(List<String> etiquetas) {
        this.etiquetas = etiquetas;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }




}

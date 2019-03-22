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
    private String ruta;

    public Envio (String id, String dirEntrega, String dirRemitente, String cpEntrega, String cpRemitente, Double peso, Proveedor proveedor, String tipo, List<String> etiqutetas, String ruta){
        this.id = id;
        this.dirEntrega = dirEntrega;
        this.dirRemitente = dirRemitente;
        this. cpEntrega = cpEntrega;
        this.cpRemitente = cpRemitente;
        this.peso = peso;
        this.proveedor = proveedor;
        this.tipo = tipo;
        this.etiquetas = etiqutetas;
        this.ruta = ruta;
    }


}

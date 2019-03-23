import java.util.List;

public interface ClienteFisico {
    final String rfc;
    final List<Envio> envios;
    final int numEnvios;

    public void agregarEnvio(String dirEntrega, String dirRemitente, String cpEntrega, String cpRemitente, Double peso,
            List<Proveedor> proveedor, String tipo, List<String> etiqutetas, String ruta);

}

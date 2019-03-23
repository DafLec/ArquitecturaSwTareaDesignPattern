public class ClienteAdapter implements ClienteFisico {
    Cliente cliente;

    public ClienteAdapter(Cliente cliente) {
        this.cliente = cliente;
    }

    public void agregarEnvio(String dirEntrega, String dirRemitente, String cpEntrega, String cpRemitente, Double peso,
            List<Proveedor> proveedor, String tipo, List<String> etiqutetas, String ruta) {
        String id = rfc.getDirFiscal() + Integer.toString(numEnvios++);
        envios.add(new Envio(id, dirEntrega, dirRemitente, cpEntrega, cpRemitente, peso, proveedor, tipo, etiqutetas,
                ruta));
    }
}
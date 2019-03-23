import java.util.List;

public class Cliente {
    private RFC rfc;
    private List<Envio> envios;
    private int numEnvios;

    public Cliente(String dirFiscal, String razonSocial){
        this.rfc = new RFC(dirFiscal, razonSocial);
        this.numEnvios = 0;
    }

    public void agregarEnvio(String dirEntrega, String dirRemitente, String cpEntrega,
                             String cpRemitente, Double peso, String tipo, List<String> etiqutetas,
                             Double dimensiones, String ruta){
        String id = rfc.getDirFiscal()+Integer.toString(numEnvios++);
        envios.add(new Envio(id,dirEntrega,dirRemitente,cpEntrega,cpRemitente,peso,tipo,etiqutetas,dimensiones,ruta));
    }

}

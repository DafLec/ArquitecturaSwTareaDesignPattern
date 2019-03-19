import java.util.*;

public class Main {
    public static void main(String[] args){
        Cliente cliente = new Cliente("045GT7", "Juan Velez" );

        Proveedor proveedor1 = new Proveedor("Envio Express", "Sonora");
        Proveedor proveedor2 = new Proveedor("BombaEnvios", "Yucatan");
        Proveedor proveedor3 = new Proveedor("PastesGo", "Pachuca");

        List<Proveedor> proveedores = new List;
        proveedores.add(proveedor1);
        proveedores.add(proveedor2);
        proveedores.add(proveedor3);

        List<String> etiquetas = new List;
        etiquetas.add("No entregar si no esta la persona");

        cliente.agregarEnvio("tu casa","mi casa", "10189", "11300", 506.89, proveedores, "normal", etiquetas, "la ruta");
    }
}

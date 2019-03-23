import java.util.*;

public class Main {
    public static void main(String[] args){
        Cliente cliente = new Cliente("045GT7", "Juan Velez" );

        List<String> etiquetas = new ArrayList<>();
        etiquetas.add("No entregar si no esta la persona");

        cliente.agregarEnvio("tu casa","mi casa", "10189",
                "11300", 506.89,"normal", etiquetas, 50.0, "la ruta");
    }
}

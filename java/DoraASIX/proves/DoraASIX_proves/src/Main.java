import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;

public class LogicalNetworkMap {
    public static void main(String[] args) {
        // Crear el grafo
        Graph graph = new SingleGraph("Mapa Lógico de Red");

        // Configuración de estilo para los nodos y bordes
        graph.setAttribute("ui.stylesheet",
                           "node { size: 20px; fill-color: blue; text-alignment: above; } " +
                                   "node.router { fill-color: red; } " +
                                   "node.host { fill-color: green; size: 15px; } " +
                                   "edge { fill-color: gray; }");

        // Ejemplo de datos
        int numRouters = 2;
        int[][] redesPorRouter = {{3, 2}, {2, 4}}; // [Router1: 3 redes con 2 hosts cada una], [Router2: 2 redes con 4 hosts]

        // Generar routers
        for (int r = 1; r <= numRouters; r++) {
            String routerId = "Router" + r;
            Node router = graph.addNode(routerId);
            router.setAttribute("ui.class", "router");
            router.setAttribute("ui.label", routerId);

            // Generar redes y hosts conectados al router
            int numRedes = redesPorRouter[r - 1][0];
            int hostsPorRed = redesPorRouter[r - 1][1];

            for (int net = 1; net <= numRedes; net++) {
                String redId = "R" + r + "Net" + net;
                Node red = graph.addNode(redId);
                red.setAttribute("ui.label", "Red" + net);

                // Conectar router a la red
                graph.addEdge(routerId + "-" + redId, routerId, redId);

                // Generar hosts en la red
                for (int h = 1; h <= hostsPorRed; h++) {
                    String hostId = redId + "H" + h;
                    Node host = graph.addNode(hostId);
                    host.setAttribute("ui.class", "host");
                    host.setAttribute("ui.label", "Host" + h);

                    // Conectar red al host
                    graph.addEdge(redId + "-" + hostId, redId, hostId);
                }
            }
        }

        // Mostrar el grafo en pantalla
        graph.display();

        // Guardar el grafo como imagen (requiere librerías adicionales como Batik)
        try {
            graph.addAttribute("ui.screenshot", "mapa-logico-red.png");
        } catch (Exception e) {
            System.err.println("Error al guardar la imagen: " + e.getMessage());
        }
    }
}

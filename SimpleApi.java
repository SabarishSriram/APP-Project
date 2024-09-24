import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleApi {

    public static void main(String[] args) throws IOException {
        // Create an HTTP server on port 8080
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        // Create an endpoint "/products"
        server.createContext("/products", new ProductHandler());

        // Start the server
        server.setExecutor(null); // Use default executor
        System.out.println("Server started at http://localhost:8080/products");
        server.start();
    }

    // Handler to respond with the list of products
    static class ProductHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            // Retrieve the list of products
            List<Product> products = ProductDataStore.getProducts();

            // Convert the product list to a JSON-like string
            String response = products.stream()
                    .map(Product::toString)
                    .collect(Collectors.joining(",\n", "[\n", "\n]"));

            // Send HTTP headers
            exchange.sendResponseHeaders(200, response.length());

            // Write the response
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }
}

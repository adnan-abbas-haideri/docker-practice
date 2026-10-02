import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class Main {

    public static void main(String[] args) throws IOException {

        HttpServer server = HttpServer.create(
            new InetSocketAddress("0.0.0.0", 8080), 0
        );

        server.createContext("/", exchange -> {

            String response = """
                <!DOCTYPE html>
                <html>
                <head>
                    <title>Java Docker App</title>
                    <style>
                        body {
                            font-family: Arial, sans-serif;
                            text-align: center;
                            margin-top: 100px;
                            background: #f4f4f4;
                        }

                        h1 {
                            color: #333;
                        }

                        p {
                            color: #666;
                            font-size: 18px;
                        }
                    </style>
                </head>
                <body>
                    <h1>Hello from Adnan! 🚀</h1>
                    <p>This Java application is running inside Docker.</p>
                </body>
                </html>
                """;

            exchange.getResponseHeaders()
                    .set("Content-Type", "text/html");

            exchange.sendResponseHeaders(200, response.getBytes().length);

            OutputStream output = exchange.getResponseBody();
            output.write(response.getBytes());
            output.close();
        });

        server.start();

        System.out.println("Java web server running on port 8080");
    }
}

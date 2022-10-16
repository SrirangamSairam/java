package org.example;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class AppHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String msg = "Hello from App by - " + Thread.currentThread().getName();
        exchange.sendResponseHeaders(200,msg.length());
        OutputStream outputStream = exchange.getResponseBody();
        outputStream.write(msg.getBytes());
        outputStream.flush();
        outputStream.close();
    }
}

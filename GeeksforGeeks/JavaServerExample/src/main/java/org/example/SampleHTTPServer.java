package org.example;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

public class SampleHTTPServer {
    public static void main(String[] args) {
        try {
            HttpServer httpServer = HttpServer.create(new InetSocketAddress("localhost",8080),0);
            httpServer.createContext("/hello",new HelloHandler());
            httpServer.createContext("/app",new AppHandler());
            httpServer.setExecutor(Executors.newFixedThreadPool(12));
            httpServer.start();
            System.out.println("Server started on port 8080");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

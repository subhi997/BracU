package tcpsimple;

import util.NetworkUtil;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private ServerSocket serverSocket;
    private int clientCount = 0;

    Server() {
        try {
            serverSocket = new ServerSocket(44444);
            while (true) {
                Socket clientSocket = serverSocket.accept();
                serve(clientSocket);
            }
        } catch (Exception e) {
            System.out.println("Server starts:" + e);
        }
    }

    public void serve(Socket clientSocket) {
        clientCount++;
        NetworkUtil nc = new NetworkUtil(clientSocket);
        System.out.println(nc.read() + "," + clientCount);
        nc.write("Hello Client : " + clientCount);
    }

    public static void main(String args[]) {
        Server server = new Server();
    }
}


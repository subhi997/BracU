package tcpobject;

import java.net.ServerSocket;
import java.net.Socket;

import util.NetworkUtil;

public class Server {

    private ServerSocket serverSocket;

    Server() {
        try {
            serverSocket = new ServerSocket(33333);
            while (true) {
                Socket clientSocket = serverSocket.accept();
                serve(clientSocket);
            }
        } catch (Exception e) {
            System.out.println("Server starts:" + e);
        }
    }

    public void serve(Socket clientSocket) {
        NetworkUtil nc = new NetworkUtil(clientSocket);
        new ReadThread(nc);
        new WriteThread(nc, "Server");
    }

    public static void main(String args[]) {
        Server server = new Server();
    }
}

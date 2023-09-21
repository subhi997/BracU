package tcpsimple;

import util.NetworkUtil;

public class Client {

    public Client(String serverAddress, int serverPort) {
        try {
            NetworkUtil nc = new NetworkUtil(serverAddress, serverPort);
            String name = "C";
            nc.write(name);
            System.out.println(nc.read());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        String serverAddress = "127.0.0.1";
        int serverPort = 44444;
        Client client = new Client(serverAddress, serverPort);
    }
}


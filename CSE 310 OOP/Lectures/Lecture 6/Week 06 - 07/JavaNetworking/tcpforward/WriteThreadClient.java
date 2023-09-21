package tcpforward;

import util.NetworkUtil;

import java.util.Scanner;

public class WriteThreadClient implements Runnable {

    private Thread thr;
    private NetworkUtil nc;
    String name;

    public WriteThreadClient(NetworkUtil nc, String name) {
        this.nc = nc;
        this.name = name;
        this.thr = new Thread(this);
        thr.start();
    }

    public void run() {
        try {
            Scanner input = new Scanner(System.in);
            while (true) {
                String from = name;
                System.out.print("Enter name of the client to send: ");
                String to = input.nextLine();
                System.out.print("Enter the message: ");
                String text = input.nextLine();
                Message message = new Message(from, to, text);
                nc.write(message);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            nc.closeConnection();
        }
    }
}




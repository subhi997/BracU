package tcpforward;

import util.NetworkUtil;

import java.util.HashMap;

public class ReadThreadServer implements Runnable {
    private Thread thr;
    private NetworkUtil nc;
    public HashMap<String, NetworkUtil> clientMap;


    public ReadThreadServer(HashMap<String, NetworkUtil> map, NetworkUtil nc) {
        this.clientMap = map;
        this.nc = nc;
        this.thr = new Thread(this);
        thr.start();
    }

    public void run() {
        try {
            while (true) {
                Object o = nc.read();
                if (o != null) {
                    if (o instanceof Message) {
                        Message obj = (Message) o;
                        String to = obj.getTo();
                        NetworkUtil nc = clientMap.get(to);
                        if (nc != null) {
                            nc.write(obj);
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            nc.closeConnection();
        }
    }
}




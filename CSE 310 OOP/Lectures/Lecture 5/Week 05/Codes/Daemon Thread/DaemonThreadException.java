class DaemonThreadException extends Thread{  
 public void run(){  
  System.out.println("Name: "+Thread.currentThread().getName());  
  System.out.println("Daemon: "+Thread.currentThread().isDaemon());  
 }  
  
 public static void main(String[] args){  
  DaemonThreadException t1=new DaemonThreadException();  
  DaemonThreadException t2=new DaemonThreadException();  
  t1.start();  
  t1.setDaemon(true);//will throw exception here  
  t2.start();  
 }  
}  
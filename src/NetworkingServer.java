import java.net.*;
import java.io.*;
public class NetworkingServer {
    public static void main(String[] args) {
        ServerSocket server = null;
        Socket client;
        int portnumber = 1987;
        if (args.length >= 1){
            portnumber = Integer.parseInt(args[0]);
        }
        try{
            server = new ServerSocket(portnumber);
        }catch(IOException ie){
            System.out.println("Cannot open socket." + ie);
            System.exit(1);
        }
        System.out.println("ServerSocket is created " + server);
        while(true) {
            try{
                System.out.println("Waiting for connect request...");
                client = server.accept();
            } catch (IOException ie){
                System.out.println("ett lämpligt error meddelande");
            }
        }
    }
}

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {

        int port = 9090;
        ServerSocket socket = new ServerSocket(port);
        Socket ss = socket.accept(); //ждём коннект

        System.out.println("Коннект есть");

        OutputStream resp = ss.getOutputStream(); //Ответный поток...поток на ответ

        /*String html = "<html>";
        String header = "HTTP/1.1 200 OK\nContent-type: text/html\nContent-Length: " + html.length() + "\nConnection: close\n\n";
        String output = header + html;

        resp.write(output.getBytes());*/
        String[] command = {"shutdown", "-s"};
        Process exec = Runtime.getRuntime().exec(command);


        ss.close();
        socket.close();

    }
}

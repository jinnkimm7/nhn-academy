package thread_programming.socket;

import com.sun.security.jgss.GSSUtil;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

// 180.210.81.192, port:12345
public class Ex1 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("180.210.81.192", 12345);
            System.out.println("서버에 연결되었습니다.");

            socket.getOutputStream().write("hello".getBytes());

            byte[] buffer = new byte[256];
            int length = socket.getInputStream().read(buffer);
            System.out.println("Received : " + length);

            socket.close();
        } catch (UnknownHostException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

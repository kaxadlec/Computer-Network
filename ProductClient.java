package HW;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

// ProductClient 클래스 선언
public class ProductClient {
    public void start() throws IOException {

        Socket socket = new Socket("localhost", 50001);
        DataInputStream dis = new DataInputStream(socket.getInputStream());
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        System.out.println("[클라이언트] 서버에 연결됨");

        Scanner scanner = new Scanner(System.in);

        list();
    }

    public void stop() {
        try {
            socket.close();
            scanner.close();
        } catch(Exception e) {}
        System.out.println("[클라이언트] 종료됨");
    }

}

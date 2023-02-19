package HW;

import javax.xml.crypto.Data;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

// ProductClient 클래스 선언
public class ProductClient {
    public static void main(String[] args) {
        Socket socket = null;
        DataInputStream dis = null;
        DataOutputStream dos = null;
        Scanner scanner = null;


        ProductClient productclient = new ProductClient();
        try{
            socket = new Socket("localhost", 50001);
            dis = new DataInputStream(socket.getInputStream());
            dos = new DataOutputStream(socket.getOutputStream());
            System.out.println("[클라이언트] 서버에 연결됨");
            scanner = new Scanner(System.in);

            list();


        } catch (IOException e) {
            System.out.println("입출력 예외발생");
        }
        try {
            socket.close();
            scanner.close();
        } catch(Exception e) {}
        System.out.println("[클라이언트] 종료됨");
    }
}

package HW;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
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

            System.out.println();
            System.out.println("[상품 목록]");
            System.out.println("---------------------------------------------------------------");
            System.out.printf("%-6s%-30s%-15s%-10s\n", "no", "name", "price", "stock");
            System.out.println("---------------------------------------------------------------");

            //상품 목록 요청하기
            JSONObject request = new JSONObject();
            request.put("menu", 0);
            request.put("data", new JSONObject());
            dos.writeUTF(request.toString());
            dos.flush();

            //응답 받기
            JSONObject response = new JSONObject(dis.readUTF());
            if(response.getString("status").equals("success")) {
                //상품 목록 출력
                JSONArray data = response.getJSONArray("data");
                for(int i=0; i<data.length(); i++) {
                    JSONObject product = data.getJSONObject(i);
                    System.out.printf(
                            "%-6d%-30s%-15d%-10d\n",
                            product.getInt("no"),
                            product.getString("name"),
                            product.getInt("price"),
                            product.getInt("stock")
                    );
                }
            }

            System.out.println();
            System.out.println("---------------------------------------------------------------");
            System.out.println("메뉴: 1.Create | 2.Update | 3.Delete | 4.Exit");
            System.out.print("선택: ");
            String menu_number = scanner.nextLine();
            System.out.println();

            switch(menu_number) {
                case "1" -> create();
                case "2" -> update();
                case "3" -> delete();
                case "4" -> exit();
            }


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

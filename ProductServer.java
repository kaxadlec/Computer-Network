package HW;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// ProductServer 클래스와 SocketClient 중첩 클래스 선언
public class ProductServer {
    private ServerSocket serverSocket;
    private ExecutorService threadPool;
    private List<Product> products;
    private int sequence;
    //메소드: 서버 시작
    public void start() throws IOException {
        serverSocket = new ServerSocket(50001);
        threadPool = Executors.newFixedThreadPool(100);
        products = new Vector<Product>();

        System.out.println( "[서버] 시작됨");

        while(true) {
            //연결 수락
            Socket socket = serverSocket.accept();
            //요청 처리용 SocketClient 생성
            SocketClient sc = new SocketClient(socket);
        }
    }
    //메소드: 서버 종료
    public void stop() {
        try {
            serverSocket.close();
            threadPool.shutdownNow();
            System.out.println( "[서버] 종료됨 ");
        } catch (IOException e1) {}
    }
    //중첩 클래스: 요청 처리
    public class SocketClient {
        //필드
        private Socket socket;

    }

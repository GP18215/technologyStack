package distribute;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created with IntelliJ IDEA.
 * User: MiaoYongchang
 * Date: 2019/6/5
 * Time: 12:56
 * Description: No Description
 */
public class SocketServerProvider {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(8080);

            Socket socket = serverSocket.accept();
            ObjectInputStream objectInputStream =
                    new ObjectInputStream(socket.getInputStream());
            User user = (User)objectInputStream.readObject();
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(serverSocket!=null){
                    serverSocket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

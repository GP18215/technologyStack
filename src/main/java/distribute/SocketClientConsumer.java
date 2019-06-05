package distribute;

import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * Created with IntelliJ IDEA.
 * User: MiaoYongchang
 * Date: 2019/6/5
 * Time: 13:03
 * Description: No Description
 */
public class SocketClientConsumer {
    public static void main(String[] args) {
        Socket socket = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            User user = new User();
            user.setAge(18);
            user.setName("miao");
            socket = new Socket("127.0.0.1",8080);
            objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            objectOutputStream.writeObject(user);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

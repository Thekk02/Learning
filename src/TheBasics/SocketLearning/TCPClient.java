package TheBasics.SocketLearning;

import java.io.OutputStream;
import java.net.Socket;

/**
 * 1.向服务器发送连接，给服务器发送数据，读取服务器回写的数据
 * 2.流对象：获取字节输出流
 * 3.close关闭套接字
 * 实现：
 *  1.创建一个客户端对象Socket，构造方法绑定服务器的ip和端口
 *  2.使用get
 */
public class TCPClient {
    public static void main(String[] args) throws Exception{
        //创建客户端对象socket，绑定ip和端口
        Socket socket = new Socket("127.0.0.1",8888);

        //使用方法获取网络字节输出流对象
        OutputStream os = socket.getOutputStream();

        //使用write方法，给服务器发送数据
        os.write("你好服务器".getBytes());

        //释放资源
        socket.close();
    }
}

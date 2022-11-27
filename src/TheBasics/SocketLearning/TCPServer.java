package TheBasics.SocketLearning;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * tcp的服务器端
 * 可以使用accept方法接受套接字的连接
 */
public class TCPServer {
    public static void main(String[] args) throws Exception{
        //创建服务器端对象serversocket
        ServerSocket server = new ServerSocket(8888);
        //使用accept方法
        Socket socket = server.accept();
        //获取网络字节输入流对象
        InputStream is =  socket.getInputStream();
        //使用读取方法read读取客户端的数据
        byte [] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len));
        //使用网络字节输入流对象的方法获取对象
        OutputStream os = socket.getOutputStream();
        //使用网络字节输出流对象的write放啊，给客户端回写数据
        os.write("收到谢谢".getBytes());
        //释放资源
        socket.close();
        server.close();
    }
}

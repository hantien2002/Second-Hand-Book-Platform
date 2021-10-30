package Gateway;

import java.io.*;
import java.util.ArrayList;

public class AdminGateway {
    public void saveadmintoFile(ArrayList adminList){
        try
        {
            FileOutputStream fos = new FileOutputStream("src/main/java/Database/adminData.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(adminList);
            oos.close();
            fos.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList readadminfromFile() {
        ArrayList adminList = new ArrayList<>();
        try {
            File file = new File("src/main/java/Database/adminData.ser");
            file.createNewFile();
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            adminList = (ArrayList) ois.readObject();
            ois.close();
            fis.close();
        } catch (EOFException e) {
            adminList = new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return adminList;
    }

}

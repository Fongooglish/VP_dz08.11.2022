import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public interface TxtWriter {
    static void writeTxt(ArrayList list) throws FileNotFoundException {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("src\\dogList.txt", "rw");
            for (int i = 0; i < list.size(); i++) {
                String temp = list.get(i).toString();
                randomAccessFile.writeBytes(temp);
                randomAccessFile.writeBytes("\r\n");
            }
            randomAccessFile.close();
        }
        catch (FileNotFoundException exception) {
            exception.getMessage();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


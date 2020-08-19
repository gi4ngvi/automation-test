package utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtils {
    private File file;
    private FileWriter fw;
    private BufferedWriter bw;

    public void writeFile(String filePath, String... lines) {
        file = new File(filePath);
        try {
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            for (String shipment : lines) {
                bw.write(shipment);
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

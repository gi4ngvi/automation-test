package utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    private File file;
    private FileWriter fw;
    private BufferedWriter bw;
    private BufferedReader br;

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

    public List<String> readFile(String filePath) {
        String line;
        FileReader fr;
        List<String> lines = new ArrayList<>();
        try {
            file = new File(filePath);
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            try {
                while ((line = br.readLine()) != null) {
                    lines.add(line);
                }
                fr.close();
                br.close();
            } catch (IOException ioex) {
                return null;
            }

        } catch (FileNotFoundException ex) {
            return null;
        }
        return lines;
    }
}

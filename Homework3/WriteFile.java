package Homework3;
import java.io.FileWriter;
import java.io.IOException;


public class WriteFile {
    public void writeData(String data, String path) {
        System.out.println("Данные записаны в файл: " + path);
        try(FileWriter fw = new FileWriter(path, true)) {
            fw.append(data);
            fw.append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
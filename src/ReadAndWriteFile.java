import java.io.*;
import java.util.*;
import java.nio.file.FileAlreadyExistsException;
public class ReadAndWriteFile {
    public List<String> readFile(String filePath) {
        List<String> text = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int count = 0;
            while ((line = br.readLine()) != null) {
                text.add(line);
                for (int i=0;i<line.length();i++){
                    count++;
                }
            }
            String displaycount = "Tổng ký tự: " +count;
            text.add(displaycount);
            br.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return text;
    }
    public void writeFile(String filePath, List<String> text){
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (String i: text) {
                bufferedWriter.write(i);
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

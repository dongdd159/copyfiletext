import java.util.*;
public class Copyfiletextmain {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<String> text = readAndWriteFile.readFile("C:\\Users\\admin\\OneDrive\\Máy tính\\file.txt");
        readAndWriteFile.writeFile("result.txt",text);
    }
}

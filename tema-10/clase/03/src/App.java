import java.io.BufferedWriter;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) throws Exception {

        String text1 = "En un lugar de la Mancha,",
                text2 = "cuyo nombre no quiero acordarme";
        FileWriter outPutFile = new FileWriter("file.txt");
        
        BufferedWriter out = new BufferedWriter(outPutFile);

        try {
            char[] text1CharArray = text1.toCharArray();
            for (char character : text1CharArray) {
                outPutFile.write(character); 
            }
            out.newLine();
            out.write(text2);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            out.close();
        }
    }
}

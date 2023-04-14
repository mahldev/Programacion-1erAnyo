import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class App {

    private static String showDiff(String[] diff) {
        String res = "", aux = "";
        String word = "", word1 = "";
        Scanner sc, sc1;
        boolean isEqual = true;

        if (diff[0].length() == 0)
            return "+________________\n   -" + diff[1];
        sc = new Scanner(diff[0]).useDelimiter(" ");
        sc1 = new Scanner(diff[1]).useDelimiter(" ");
        try {
            while (sc.hasNext() && isEqual) {
                isEqual = (word = sc.next()).equals(word1 = sc1.next());
            }
        } catch (Exception e) {
            word1 = "";
        }
        sc.close();
        sc1.close();
        sc = new Scanner(word).useDelimiter("");
        sc1 = new Scanner(word1).useDelimiter("");
        try {
            while (sc.hasNext()) {
                if (!(res = sc.next()).equals(aux = sc1.next())) {
                    sc.close();
                    sc1.close();
                    return "+" + res + "\n   -" + aux;
                }
            }
        } catch (Exception e) {
            return "+" + res + "\n   -";
        }
        aux = sc1.next();
        sc.close();
        sc1.close();
        return "+ \n   -" + aux;
    }

    public static void main(String[] args) throws Exception {

        String currentLine1, currentLine2;
        int lineNumber = 0;
        boolean isEqual = true;
        String[] diff = new String[2];

        try (
                BufferedReader file1 = new BufferedReader(new FileReader("texto1.txt"));
                BufferedReader file2 = new BufferedReader(new FileReader("texto2.txt"));) {
            while ((currentLine1 = file1.readLine()) != null
                    && (currentLine2 = file2.readLine()) != null
                    && isEqual) {
                lineNumber++;
                isEqual = currentLine1.equals(currentLine2);
                if (!isEqual) {
                    diff[0] = currentLine2;
                    diff[1] = currentLine1;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println(isEqual
                ? "Los archivos son iguales"
                : lineNumber + ": " + showDiff(diff));
    }
}

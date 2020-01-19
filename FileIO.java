import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author RAMESHA
 */
public class FileIO {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\RAMESHA\\Desktop\\test.txt");

        FileReader fileReader;
        try {
            fileReader = new FileReader(file);
            Capitalize capitalize = new Capitalize(fileReader);

            String line;
            try {
                while ((line = capitalize.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (NullPointerException e) {
                System.out.println("end of document");
            }

        } catch (FileNotFoundException ex) {
            File newfile = new File("C:\\Users\\RAMESHA\\Desktop\\test.txt");
            newfile.createNewFile();
            System.out.println("Created");

            FileWriter fw = new FileWriter(newfile);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < 10; i++) {
                bw.write("Line " + i);
                bw.newLine();
            }
            bw.close();
        }
    }

}

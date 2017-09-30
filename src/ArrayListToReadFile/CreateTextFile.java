package ArrayListToReadFile;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
public class CreateTextFile {

    public static void main(String[] args){
        try {
            File file = new File("C:\\Users\\psmit\\Google Drive\\" +
                    "Java Workspace\\YouTubeJavaTutorial\\fileName1.txt");
            //name and location of file

            if (!file.exists()) {
                file.createNewFile();
            }

            PrintWriter pw = new PrintWriter(file);
            pw.println("Line 1: this is my file content");
            pw.println("Line 2: this is my file content");
            pw.println("Line 3: this is my file content");
            pw.println("Line 4: this is my file content");
            pw.println("Line 5: this is my file content");
            pw.close();
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

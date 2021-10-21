package ExercisesStreamsFilesAndDirectories;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GetFolderSize08 {
    public static void main(String[] args) {
        try{
            FileWriter fileWriter = new FileWriter("output.txt");
            File[] file = new File("D:\\JavaAdvance\\" +
                    "04. Java-Advanced-Files-and-Streams-Exercises-Resources").listFiles();

            long sum = 0;
            assert file != null;
            for (File file1 : file) {
                System.out.println(file1.length());
                sum+=file1.length();
            }

            fileWriter.write("Folder size: " + sum);
            fileWriter.flush();

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}

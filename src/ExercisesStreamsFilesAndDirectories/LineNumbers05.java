package ExercisesStreamsFilesAndDirectories;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LineNumbers05 {
    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Path.of("D:\\JavaAdvance\\" +
                    "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt"));

            FileWriter fileWriter = new FileWriter("outLineNumbers.txt");

            int count = 0;
            for (String line : lines) {
                fileWriter.write(++count + ". " + line + "\n");
                fileWriter.flush();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

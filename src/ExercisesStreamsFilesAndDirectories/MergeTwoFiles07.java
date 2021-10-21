package ExercisesStreamsFilesAndDirectories;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MergeTwoFiles07 {
    public static void main(String[] args) {
        try{
            FileWriter fileWriter = new FileWriter("output1.txt");
            List<String> fileOne = Files.readAllLines(Path.of("D:\\JavaAdvance\\" +
                    "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt" ));

            List<String> fileTwo = Files.readAllLines(Path.of("D:\\JavaAdvance\\" +
                    "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt" ));


            for (String file : fileOne) {
                fileWriter.write(file + System.lineSeparator());
                fileWriter.flush();
            }


            for (String file : fileTwo) {
                fileWriter.write(file + System.lineSeparator());
                fileWriter.flush();
            }

        }catch (IOException ignored){

        }
    }
}

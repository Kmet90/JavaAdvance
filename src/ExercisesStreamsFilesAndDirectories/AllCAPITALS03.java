package ExercisesStreamsFilesAndDirectories;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AllCAPITALS03 {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("outAllCapitals.txt");
            BufferedReader reader = new BufferedReader(new FileReader("D:\\JavaAdvance\\" +
                    "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toUpperCase() + "\n");
                writer.flush();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

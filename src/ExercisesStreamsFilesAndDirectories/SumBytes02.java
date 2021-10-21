package ExercisesStreamsFilesAndDirectories;

import java.io.*;

public class SumBytes02 {
    public static void main(String[] args) throws IOException {
        String path = "D:\\JavaAdvance\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String pathOut = "output.txt";
        File file = new File(pathOut);
        long sum = 0;
        int oneByte = reader.read();
        while (oneByte > 0) {
            if (!(oneByte == 10 || oneByte == 13)) {
                sum += oneByte;
            }
            oneByte = reader.read();
        }
        System.out.println(sum);
        //file.createNewFile ();

        PrintWriter writer = new PrintWriter(file);
        writer.println(sum);
        writer.close();

    }
}


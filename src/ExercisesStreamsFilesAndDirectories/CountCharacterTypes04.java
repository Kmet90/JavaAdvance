package ExercisesStreamsFilesAndDirectories;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CountCharacterTypes04 {
    public static void main(String[] args) {
        int countVowels = 0;
        int countConsonants = 0;
        int countPunctuation = 0;

        try{
            String file = String.join("", Files.readAllLines(Path.of("D:\\JavaAdvance\\" +
                    "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt")));

            String lookPunc = "!,.?";
            String vowels = "aeiou";

            for (int i = 0; i < file.length(); i++) {
                char symbol = file.charAt(i);

                if(vowels.contains(String.valueOf(symbol))){
                    countVowels+=1;
                }else if(lookPunc.contains(String.valueOf(symbol))){
                    countPunctuation +=1;
                }else if(symbol != 32){
                    countConsonants +=1;
                }
            }

            FileWriter fileWriter = new FileWriter("outCharacterCountTypes");
            fileWriter.write(String.format("""
                    Vowels: %d
                    Consonants: %d
                    Punctuation: %d""",countVowels,countConsonants,countPunctuation));

            fileWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

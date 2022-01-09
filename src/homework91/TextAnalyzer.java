package homework91;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class TextAnalyzer {

    public TextAnalyzer() {
    }

    public static void printTextStatistic(File file) {
        Map<Character, Integer> lettersMap = new HashMap<>();

        try (BufferedReader bufferReader = new BufferedReader(new FileReader(file))) {
            for (; ; ) {
                int charCode = bufferReader.read();
                if (charCode == -1)
                    break;
                if (Character.isLetter(charCode)) {
                    Character letter = Character.toLowerCase((char) charCode);
                    if (!lettersMap.containsKey(letter)) {
                        lettersMap.put(letter, 1);
                    } else {
                        lettersMap.put(letter, lettersMap.get(letter) + 1);
                    }
                }
            }

        } catch (FileNotFoundException e) {
            System.err.println("File is not found!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        lettersMap.entrySet().stream().sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}

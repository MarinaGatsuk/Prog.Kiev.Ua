package homework91;


import java.io.File;

public class EnglishText {
    public static void main(String[] args) {
        File file = new File("D:\\Docs\\EnglishText.txt");

        TextAnalyzer.printTextStatistic(file);

    }


}

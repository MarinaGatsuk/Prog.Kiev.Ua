package advancedhomework2;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String text = "My string with some random text!";
        File file1 = new File ("Text_transformer.txt");
        File file2 = new File ("Inverse_transformer.txt");
        File file3 = new File ("UpDown_Transformer.txt");

        TextTransformer textTransformer = new TextTransformer();
        InverseTransformer inverseTransformer = new InverseTransformer();
        UpDownTransformer upDownTransformer = new UpDownTransformer();

        TextSaver textSaver1 = new TextSaver(textTransformer, file1);
        textSaver1.saveTextToFile(text);

        TextSaver textSaver2 = new TextSaver(inverseTransformer, file2);
        textSaver2.saveTextToFile(text);

        TextSaver textSaver3 = new TextSaver(upDownTransformer, file3);
        textSaver3.saveTextToFile(text);
    }
}

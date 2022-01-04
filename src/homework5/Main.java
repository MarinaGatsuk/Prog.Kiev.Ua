package homework5;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File folderin = new File("D:\\Docs");

        File folderOut = new File("D:\\Docs\\New Folder");
        folderOut.mkdirs();

        try {
            FileService.copyTxtFiles(folderin, folderOut);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


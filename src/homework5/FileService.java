package homework5;

import java.io.*;

public class FileService {

    public static void copyFile(File in, File out) throws IOException {
        try (InputStream is = new FileInputStream(in); OutputStream os = new FileOutputStream(out)) {

            is.transferTo(os);
        } catch (IOException e) {
            ///
            throw e;
        }
    }

    public static void copyTxtFiles(File folderIn, File folderOut) throws IOException {
        File[] files = folderIn.listFiles();
        for (int i = 0; i < files.length; i++) {
            int firstIndexExtention;
            firstIndexExtention = files[i].getName().lastIndexOf('.');
            String extention = files[i].getName().substring(firstIndexExtention+1);
            if (extention.equals("txt")) {
                File out = new File(folderOut, files[i].getName());
                copyFile(files[i], out);
            }
        }
    }

}

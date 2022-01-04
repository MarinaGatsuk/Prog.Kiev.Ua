package homework4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GroupFileStorage {

    public GroupFileStorage() {
    }

    public void saveGroupToCSV(Group gr) {
       try (PrintWriter printWriter = new PrintWriter(new File("D:\\Docs\\" + gr.getGroupName() + ".csv"))){
           for (int i =0; i<gr.getStudents().length; i++){
               if (gr.getStudents()[i] != null){
                   printWriter.println(gr.getStudents()[i].toCSVString());
               }
           }
       } catch (IOException e) {
            e.printStackTrace();
       }
   }

   public Group loadGroupFromCSV(File file){
       Group loadedGroup = new Group();
       int firstIndexOfExtention = file.getName().lastIndexOf('.');
       String groupName = file.getName().substring(0, firstIndexOfExtention);
       loadedGroup.setGroupName(groupName);
       try (Scanner sc = new Scanner(file)) {
           while (sc.hasNextLine()){
               loadedGroup.addStudent(new Student().fromCSVString(sc.nextLine()));
           }
       } catch (FileNotFoundException e){
           e.printStackTrace();
       } catch (GroupOverflowException e){
           System.out.println(e.getMessage());
       }
        return loadedGroup;
   }

   public File findFileByGroupName(String groupName, File workFolder){
       File[] files = workFolder.listFiles();
       for (int i = 0; i < files.length; i++) {
           if (files[i].getName().equals(groupName+".csv")) {
                return files[i];
           }
       }
    return null;
   }
}

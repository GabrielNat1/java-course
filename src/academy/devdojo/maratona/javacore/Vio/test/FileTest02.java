package academy.devdojo.maratona.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDir = new File("folder");
        boolean isCreated = fileDir.mkdir();
        System.out.println("Directory created: " + isCreated);
        File file = new File(fileDir, "file.txt");
        boolean isFileCreated = file.createNewFile();
        System.out.println(isFileCreated);

        File fileRenamed = new File(fileDir, "file_renamed.txt");
        boolean isRenamed = file.renameTo(fileRenamed);
        System.out.println("File renamed: " + isRenamed);

        File directoryRenamed = new File("folder_renamed");
        boolean isDirRenamed = fileDir.renameTo(directoryRenamed);
        System.out.println("Directory renamed: " + isDirRenamed);
    }
}

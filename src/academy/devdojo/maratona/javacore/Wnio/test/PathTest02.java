package academy.devdojo.maratona.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path folderPath = Paths.get("folder");
        if (Files.notExists(folderPath)) {
            Path folderDirectory = Files.createDirectories(folderPath);
            boolean isDirectoryCreated = Files.exists(folderDirectory) && Files.isDirectory(folderDirectory);
            System.out.println("Directory created: " + isDirectoryCreated);
        }
        Path subFolderPath = Paths.get("folder/subfolder/subsubfolder");
        Path subfolderDirectory = Files.createDirectories(subFolderPath);

        Path filePath = Paths.get(subFolderPath.toString(), "file.txt");
        if (Files.notExists(filePath)) {
            Path filePathCreated = Files.createFile(filePath);
            boolean isFileCreated = Files.exists(filePathCreated) && Files.isRegularFile(filePathCreated);
            System.out.println("File created: " + isFileCreated);
        }

        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "file_renamed.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
}

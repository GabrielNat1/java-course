package academy.devdojo.maratona.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {
    public static void main(String[] args) {
        Path archiveZip = Paths.get("folder/archive.zip");
        Path filesForZip = Paths.get("folder/subfolder1/subsubfolder1/subsubfile.txt");
        zip(archiveZip, filesForZip);
    }

    private static void zip(Path archiveZip, Path filesForZip) {
        try(ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(archiveZip));
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(filesForZip)) {
            for (Path file : directoryStream){
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                zipStream.putNextEntry(zipEntry);
                Files.copy(file, zipStream);
                zipStream.closeEntry();
            }
            System.out.println("Zip created successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package academy.devdojo.maratona.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String pathProject = "home/gabriel/dev";
        Path path1 = Paths.get(pathProject, "file.txt");
        System.out.println(path1);
        System.out.println(path1.normalize());

        Path path2 = Paths.get("home/./gabriel/./dev/./file.txt");
        System.out.println(path2);
        System.out.println(path2.normalize());
    }
}

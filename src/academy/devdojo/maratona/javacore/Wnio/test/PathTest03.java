package academy.devdojo.maratona.javacore.Wnio.test;

import java.nio.file.Path;

public class PathTest03 {
    public static void main(String[] args) {
        Path dir = Path.of("home/gabriel");
        Path file1 = Path.of("dev/file.txt");
        Path resolve = dir.resolve(file1);
        System.out.println(resolve);

        Path absolute = Path.of("/home/gabriel");
        Path relative = Path.of("dev");
        Path file2 = Path.of("file.txt");
        System.out.println("1 "+absolute.resolve(relative));
        System.out.println("2 "+absolute.resolve(file2));
        System.out.println("3 "+relative.resolve(absolute));
        System.out.println("4 "+relative.resolve(file2));
        System.out.println("5 "+file2.resolve(absolute));
        System.out.println("6 "+file2.resolve(relative));
    }
}

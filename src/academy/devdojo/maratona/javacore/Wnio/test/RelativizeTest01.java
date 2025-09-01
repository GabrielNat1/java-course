package academy.devdojo.maratona.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("home/gabriel");
        Path clazz = Paths.get("home/gabriel/dev/java/course/helloworld.java");
        Path toClazz = dir.relativize(clazz);
        System.out.println(toClazz);

        Path absolute1 = Paths.get("/home/gabriel");
        Path absolute2 = Paths.get("/usr/local");
        Path absolute3 = Paths.get("home/gabriel/dev/java/course/helloworld.java");
        Path relative1 = Paths.get("temp");
        Path relative2 = Paths.get("temp/temp.42341412412");

        System.out.println("1 "+absolute1.relativize(absolute3));
        System.out.println("2 "+absolute3.relativize(absolute1));
        System.out.println("3 "+absolute1.relativize(absolute2));
        System.out.println("4 "+relative1.relativize(relative2));


    }
}

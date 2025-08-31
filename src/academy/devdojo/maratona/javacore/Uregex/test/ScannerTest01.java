package academy.devdojo.maratona.javacore.Uregex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String text = "People1, people2, people3, people4, people5";
        String[] peoples = text.split(", ");
        for (String name : peoples){
            System.out.println(name);
        }
    }
}

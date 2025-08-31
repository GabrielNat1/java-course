package academy.devdojo.maratona.javacore.Uregex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String text = "People1, people2, people3, people4, people5, true, 32131231";
        Scanner scanner = new Scanner(text);
        scanner.useDelimiter(",");
        while (scanner.hasNext()) {
            //System.out.println(scanner.next().trim());
            if(scanner.hasNextInt()){
                int i = scanner.nextInt();
                System.out.println("int "+i);
            } else if (scanner.hasNextBoolean()) {
                boolean b = scanner.nextBoolean();
                System.out.println("boolean "+b);
            } else{
                System.out.println(scanner.next());
            }
        }
        scanner.close();
    }
}

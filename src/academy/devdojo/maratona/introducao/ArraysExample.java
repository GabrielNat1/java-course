package academy.devdojo.maratona.introducao;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int[] age = new int[3];
        age[0] = 20;
        age[1] = 25;
        age[2] = 30;

        for(int i=0; i < age.length; i++){
            if(i == 0) {
                for (int value : age){
                    System.out.println(value + "y");
                }
            }
        }
    }
}

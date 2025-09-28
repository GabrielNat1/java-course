package academy.devdojo.maratona.introduction;

public class ArraysMultidimensionais {
    public static void main(String[] args) {
        // dias e meses por exemplo
        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 21;
        dias[0][2] = 11;

        dias[1][0] = 31;
        dias[1][1] = 21;
        dias[1][2] = 11;

        for (int i = 0; i < dias.length; i++){
            for (int j = 0; j < dias[i].length; j++){
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("------------------------------");

        for (int[] arrBase: dias){
            for (int num: arrBase){
                System.out.println(num);
            }
        }
    }
}

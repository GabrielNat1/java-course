package academy.devdojo.maratona.javacore.ZZAinnerclasses.test;

public class OuterClassesTest03 {
    private String name = "name";

    static class Nested {
        private String lastName = "lastName";
        void print(){
            System.out.println(new OuterClassesTest03().name + " " + lastName);
        }

    public static void main(String[] args) {
            Nested nested = new Nested();
            nested.print();
        }



    }
}

package academy.devdojo.maratona.javacore.ZZAinnerclasses.test;

public class OuterClassesTest02 {
    private String name = "name";

    void print(final String param){
        final String lastName = "lastName";
        class LocalClass {
            public void printLocal(){
                System.out.println(param);
                System.out.println(name + " " + lastName);
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outerClassesTest02 = new OuterClassesTest02();
        outerClassesTest02.print("");
    }
}

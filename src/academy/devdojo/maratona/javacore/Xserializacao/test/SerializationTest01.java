package academy.devdojo.maratona.javacore.Xserializacao.test;

import academy.devdojo.maratona.javacore.Xserializacao.domain.Classroom;
import academy.devdojo.maratona.javacore.Xserializacao.domain.Student;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationTest01 {
    public static void main(String[] args) {
        Student student = new Student(1L, "Gabriel", "123456");
        Classroom classroom1 = new Classroom("class1");
        student.setaClass(classroom1);
        //serialization(student);
        deserialization();
    }

    private static void serialization(Student student){
        Path path = Paths.get("folder/student.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(student);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void deserialization(){
        Path path = Paths.get("folder/student.ser");
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            Student student = (Student) ois.readObject();
            System.out.println(student);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

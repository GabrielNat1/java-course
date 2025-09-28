package academy.devdojo.maratona.javacore.Xserialization.domain;

import java.io.*;


public class Student implements Serializable {
    private static final long serialVersionUID = -5818123809357761522L;

    private Long id;
    private String name;
    private transient String password;
    private static final String SCHOOL_NAME = "schoolTest";
    private transient Classroom aClassroom;

    public Student(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public void writeObject(ObjectOutputStream oos){
        try{
            oos.defaultWriteObject();
            oos.writeUTF(aClassroom.getName());
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public void readObject(ObjectInputStream ois){
        try{
            ois.defaultReadObject();
            String nameClassroom = ois.readUTF();
            aClassroom = new Classroom(nameClassroom);

        }catch (IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", SCHOOL NAME='" + SCHOOL_NAME + '\'' +
                ", class='" + aClassroom + '\'' +
                '}';
    }

    public Classroom getaClass() {
        return aClassroom;
    }

    public void setaClass(Classroom aClassroom) {
        this.aClassroom = aClassroom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

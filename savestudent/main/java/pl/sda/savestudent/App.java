package pl.sda.savestudent;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.studentmodel.Student;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

    Student student = new Student("Anna", "Kowalska", 1);
    Student student1 = new Student("Rose", "Hathaway", 2);
    Student student2 = new Student("Olaf", "Snow", 3);
    Student student3 = new Student("Elza", "Moor", 4);
    Student student4 = new Student("Lisa", "Dragomir", 5);
        List<Student> students = Arrays.asList(student, student1, student2, student3, student4);
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("students.json"), students);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}

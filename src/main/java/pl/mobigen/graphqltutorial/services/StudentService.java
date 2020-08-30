package pl.mobigen.graphqltutorial.services;

import org.springframework.stereotype.Service;
import pl.mobigen.graphqltutorial.model.Address;
import pl.mobigen.graphqltutorial.model.Student;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class StudentService {

    private Map<String, Student> students = new HashMap<>();

    @PostConstruct
    private void init() {
        Student student = Student.builder()
                .name("michal")
                .age(18)
                .phone("731495305")
                .address(Address.builder()
                        .city("Warsaw")
                        .street("Stefanika")
                        .zipCode(22400)
                        .build()
                ).build();
        this.students.put(student.getName(), student);
    }

    public Student getStudentByName(String name) {
        return this.students.get(name);
    }

    public Student createStudent(Student student) {
        this.students.put(student.getName(), student);
        return student;
    }
}

package pl.mobigen.graphqltutorial.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;
import pl.mobigen.graphqltutorial.model.Student;
import pl.mobigen.graphqltutorial.services.StudentService;

@Component
public class StudentQueryResolver implements GraphQLQueryResolver {

    private StudentService studentService;

    public StudentQueryResolver(StudentService studentService) {
        this.studentService = studentService;
    }

    public Student student(String name) {
        return studentService.getStudentByName(name);
    }

}

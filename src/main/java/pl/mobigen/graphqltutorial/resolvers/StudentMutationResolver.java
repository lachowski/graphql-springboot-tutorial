package pl.mobigen.graphqltutorial.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;
import pl.mobigen.graphqltutorial.model.Student;
import pl.mobigen.graphqltutorial.services.StudentService;

@Component
public class StudentMutationResolver implements GraphQLMutationResolver {

    private StudentService studentService;

    public StudentMutationResolver(StudentService studentService) {
        this.studentService = studentService;
    }

    public Student createStudent(Student student) {
        return studentService.createStudent(student);
    }

}

package schedule_system.schedule_system.Student;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    /**
     * @param student estudent.
     * @return Response.
     */
    @RequestMapping("/create")
    public Student create(@RequestParam(value="name", defaultValue="newestudent") String name) {
        return new Student(name);
    }
}

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework
import com.example.demo.entity.Student;

@RestController
public class StudentController{
    @Autowired
    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student st){
        return
    }
}

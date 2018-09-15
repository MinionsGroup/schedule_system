package schedule_system.schedule_system.Student;

import java.util.concurrent.ThreadLocalRandom;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Data
@Entity
public class Student {

    private @Id @GeneratedValue Long id;
    private int code;
    private String name;
    private String lastName;
    private int age;



    public Student()
    {
        super();
    }
    public Student(long id,int code, String name, String lastName, int age)
    {
        super();
        this.id = id;
        this.code = code;
        this.name = name;
        this.age = age;
    }
    public Student( String name)
    {
        this.code = ThreadLocalRandom.current().nextInt(2000, 2500);
        this.name = name;
        this.age = ThreadLocalRandom.current().nextInt(5, 50);;
    }

    @Override
    public String toString()
    {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}

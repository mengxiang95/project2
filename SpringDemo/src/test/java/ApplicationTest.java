import com.springdemo.entity.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationTest {

    @Test
    public void propertyTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        Student student = (Student)applicationContext.getBean(Student.class);
        System.out.println(student);
    }
}

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * Author:<H3>Gavin.C</H3>
 * Date: 13-11-13
 * Time: 下午2:41
 * Email:learningpro@163.com
 * Comment:-
 */
public class ManContextAppTest {

    private ApplicationContext ac;

    @Before
    public void before() {
        System.out.println("初始化对象");
        ac = new ClassPathXmlApplicationContext("classpath:learningPro-context.xml");
    }

    @Test
    public void test(){

    }

}

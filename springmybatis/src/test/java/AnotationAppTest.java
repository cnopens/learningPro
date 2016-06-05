import com.learningpro.dao.BaseTest;
import com.learningpro.dao.TestMapper;
import com.learningpro.service.TestService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author:<H3>Gavin.C</H3>
 * Date: 13-11-13
 * Time: 上午10:56
 * Email:learningpro@163.com
 * Comment:-
 */
@SuppressWarnings("SpringJavaAutowiringInspection")
public class AnotationAppTest extends BaseTest {

    @Autowired
    private TestService testService;
    @Autowired
    private TestMapper testMapper;

    @Test
    public void testInsert() {
        com.learningpro.domain.Test test = new com.learningpro.domain.Test("caixiaofeng5", "type555");
        testService.addTest(test);
        System.out.println("insert success!");
        System.out.println("current test table count:"+testMapper.findAll().size());

    }

    @Test
    public void testService(){
            List<com.learningpro.domain.Test> lists = testService.findAll();

        for(com.learningpro.domain.Test test:lists){
            System.out.println("\n\r"+test.getName());
        }
    }

}

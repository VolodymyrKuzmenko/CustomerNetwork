/**
 * Created by Vova on 10/12/2015.
 */

import com.kpi.compsys.model.User;
import org.junit.Test;

public class HibernateTest {
    @Test
    public void test1(){
        User user1 = new User();
        user1.setEmail("mail@,ail.ru");
        user1.setPassword("qwertyqwerty");
        user1.setStatus(2);

      //  DaoFactory.genInstance().getUserDao().create(user1);
    }
}
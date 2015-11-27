import com.kpi.compsys.model.User;
import com.kpi.compsys.service.UserService;
import com.kpi.compsys.service.impl.UserServiceImpl;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Vova on 11/27/2015.
 */

public class HibernateTest {
    @Test
    public void hiberTest(){
        UserService service = new UserServiceImpl();

        for (User user :service.getAll() ){
            System.out.println(user.getEmail());
        }

        Assert.assertTrue(true);
    }

}
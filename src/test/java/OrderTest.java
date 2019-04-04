import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import seed.entity.Order;
import seed.mapper.OrderMapper;
import seed.service.OrderService;

/**
 * Created by yibin on 2019/4/3.
 */
@SpringBootTest
public class OrderTest {
    @Autowired
    OrderService orderService;
    @Autowired
    OrderMapper mapper;
    @Test
    public void test(){
        Order order=orderService.get(211361257675035385L);
        System.out.print(order.getAppCode());
    }
}

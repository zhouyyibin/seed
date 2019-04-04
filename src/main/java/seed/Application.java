package seed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import seed.service.OrderService;

/**
 * 后台应用启动类.
 * Created by yibin on 2018/05/23.
 */
@SpringBootApplication(scanBasePackages = {"seed"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }

}

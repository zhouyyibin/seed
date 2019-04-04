package seed.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import seed.entity.Order;
import seed.service.OrderService;
import seed.tools.RestfulResult;

import static seed.tools.RestfulResult.success;

/**
 * Created by yibin on 2019/4/3.
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @RequestMapping(value = "", method = RequestMethod.GET)
    public RestfulResult get(@RequestParam(value = "id", defaultValue = "", required = false) Long id){
        Order order=orderService.get(id);
        return success(order) ;
    }
}

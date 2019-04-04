package seed.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import seed.entity.Order;
import seed.mapper.OrderMapper;

/**
 * Created by yibin on 2019/4/3.
 */
@Service
@Transactional
public class OrderService {
    @Autowired
    OrderMapper mapper;
    public Order get(Long id){
       return mapper.selectByPrimaryKey(id);
    }
}

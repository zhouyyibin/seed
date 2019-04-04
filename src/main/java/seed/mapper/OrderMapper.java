package seed.mapper;

import org.apache.ibatis.annotations.Mapper;
import seed.entity.Order;

@Mapper
public interface OrderMapper {
    Order selectByPrimaryKey(Long id);
}
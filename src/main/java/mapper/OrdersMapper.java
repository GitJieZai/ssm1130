package mapper;

import java.util.List;

import pojo.Orders;

public interface OrdersMapper {
	
	public Orders findById(Integer id);
	
	public List<Orders> findOrdersDetailAll();
	
	public List<Orders> findAll();
	
	public List<Orders> findByUserId(Integer userid);
}


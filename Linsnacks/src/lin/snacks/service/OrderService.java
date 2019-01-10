
package lin.snacks.service;

import java.util.List;

import lin.snacks.pojo.Order;

public interface OrderService {

	public void addall(Order order);
	public List<Order> findorderByidAndostatus(Order order);
	public List<Order> findAll();
	public void delete(String id);
	public void updateorder(Order order);
	public List<Order> findBystatu(String ostatus);
	public void updateByidst(String id,String ostatus);
}




package mapper;

import java.util.HashMap;
import java.util.List;

import pojo.Orders;
import pojo.UserInfo;

public interface UserInfoMapper {
	public List<UserInfo> findUserInfoOrdersOrderDetailGoodsList();
	
	public List<UserInfo> findBySearch(HashMap<String, String> hashmap);
	
	public List<UserInfo> findUserById(List list);
	
	public List<UserInfo> findAll();
	
	public int updateUserById(String username);
}

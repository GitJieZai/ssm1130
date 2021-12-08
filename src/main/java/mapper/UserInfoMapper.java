package mapper;

import java.util.HashMap;
import java.util.List;

import com.luoyingjie.pojo.Orders;
import com.luoyingjie.pojo.UserInfo;

public interface UserInfoMapper {
	public List<UserInfo> findUserInfoOrdersOrderDetailGoodsList();
	
	public List<UserInfo> findBySearch(HashMap<String, String> hashmap);
	
	public List<UserInfo> findUserById(List list);
	
	public List<UserInfo> findAll();
	
	public int updateUserById(String username);
}

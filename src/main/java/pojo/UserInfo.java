package pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class UserInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String userName;//�û�����
	private String userPass;//�û�����
	private Date birthday;//����
	private String gender;//�Ա�
	private String address;//��ַ
	//һ���û���Ӧ���������һ�Զ��ϵ��
	private List<Orders> ordersList;
	
	public List<Orders> getOrderslist() {
		return ordersList;
	}
	public void setOrderslist(List<Orders> ordersList) {
		this.ordersList = ordersList;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "\n============\nUserInfo [id=" + id + ", userName=" + userName + ", userPass=" + userPass + ", birthday=" + birthday
				+ ", gender=" + gender + ", address=" + address + ", orderslist=" + ordersList + "]";
	}
}

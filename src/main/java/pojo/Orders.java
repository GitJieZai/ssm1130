package pojo;

import java.util.Date;
import java.util.List;

public class Orders {
	private Integer id;//������
	private Integer userid;//�µ��û�id 
	
	private Date createtime;//��������ʱ��
	private String memo;//��ע
	//һ��������Ӧһ���û���һ��һ��ϵ��
	private UserInfo userInfo;
	//һ��������Ӧ���������ϸ(һ�Զ��ϵ)
	private List<OrderDetail> orderDetailList;
	//һ��������Ӧ�����Ʒ(һ�Զ�Ĺ�ϵ)
	private List<Goods> goodsList;
	
	public List<Goods> getGoodsList() {
		return goodsList;
	}
	public void setGoodsList(List<Goods> goodsList) {
		this.goodsList = goodsList;
	}
	public List<OrderDetail> getOrderDetailList() {
		return orderDetailList;
	}
	public void setOrderDetailList(List<OrderDetail> orderDetailList) {
		this.orderDetailList = orderDetailList;
	}
	
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	@Override
	public String toString() {
		return "\nOrders [id=" + id + ", userid=" + userid + ", createtime=" + createtime + ", memo=" + memo
				+ ", userInfo=" + userInfo + ", orderDetailList=" + orderDetailList + ", goodsList=" + goodsList + "]\n";
	}
}

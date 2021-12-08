package pojo;

public class OrderDetail {
	private Integer id;
	private Integer orderid;//����id
	private Integer goodsid;//��Ʒid
	private Integer itemsnum;//��Ʒ��������
	//һ��������ϸ��Ӧһ����Ʒ(һ��һ��ϵ)
	private Goods goods;
	
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getOrderid() {
		return orderid;
	}
	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}
	public Integer getGoodsid() {
		return goodsid;
	}
	public void setGoodsid(Integer goodsid) {
		this.goodsid = goodsid;
	}
	public Integer getItemsnum() {
		return itemsnum;
	}
	public void setItemsnum(Integer itemsnum) {
		this.itemsnum = itemsnum;
	}
	@Override
	public String toString() {
		return "\nOrderDetail [id=" + id + ", orderid=" + orderid + ", goodsid=" + goodsid + ", itemsnum=" + itemsnum
				+ ", goods=" + goods + "]";
	}
}

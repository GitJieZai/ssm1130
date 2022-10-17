package mapper;

import java.util.HashMap;
import java.util.List;

import pojo.Goods;

public interface GoodsMapper {
	
	public Goods selectGoods(int id);
	
	public List<Goods> findAll();
	
	public List<HashMap<String, Object>> findAllMap();
	
	public List<Goods> findAllResultMap();
	
	public List<Goods> findByName(String gname);
	
	public int addGoods(Goods model);
	
	public int addGoodsMap(HashMap<String, Object> hashmap);
	
	public int updateGoods(Goods model);
	
	public int deleteGoods(int id);
	
	public int getRecount();
	
}

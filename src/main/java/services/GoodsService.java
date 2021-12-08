package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luoyingjie.mapper.GoodsMapper;
import com.luoyingjie.pojo.Goods;


//Ӧ�õ�ҵ����(����service����)
@Service("goodsService")
public class GoodsService {
	//����ע��
	@Autowired
	GoodsMapper mapper=null;

	public GoodsMapper getMapper() {
		return mapper;
	}

	public void setMapper(GoodsMapper mapper) {
		this.mapper = mapper;
	}
	/**
	 * �鿴������Ʒ
	 * @return
	 */
	public List<Goods> findAll(){
		return mapper.findAll();
	}

}

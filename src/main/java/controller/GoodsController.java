package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.luoyingjie.pojo.Goods;
import com.luoyingjie.services.GoodsService;

@Controller
@RequestMapping("/goods")
public class GoodsController {
	//�Զ�ע��service����
	@Autowired
	private GoodsService service=null;
	
	@RequestMapping("/findall")
	public String findAll(Model model) {
		List<Goods> list=service.findAll();
		model.addAttribute("goodslist", list);
		System.out.println(list);
		return "goods/findall";
	}
	@RequestMapping("/findAllJson")
	public @ResponseBody List<Goods> findAllJson(){
		List<Goods> list=service.findAll();		
		return list;
	}

}

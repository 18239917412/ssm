package com.yh.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.yh.bean.Item;
import com.yh.bean.ItemVo;
import com.yh.service.ItemService;

@RequestMapping("/item")
@Controller
public class ItemController {
	
	@Resource(name="ItemService")
	private ItemService is;
	
	@RequestMapping("/findAll.action")
	public ModelAndView findAll(){

		List<Item> list = is.findItem();
		
		ModelAndView m = new ModelAndView();
		
		m.addObject("itemList", list);
		
		m.setViewName("itemList");
		
		return m;
		
	}
	
/*	@RequestMapping("/findItemById.action")
	public ModelAndView findItemById(HttpServletRequest request){
		
		String idStr = request.getParameter("id");
		Integer id = Integer.parseInt(idStr);
		
		Item item = is.findItemById(id);
		
		ModelAndView m = new ModelAndView();
		
		m.addObject("item",item);
		
		m.setViewName("editItem");
		
		return m;
		
	}*/
	
/*	@RequestMapping("/findItemById.action")
	public String findItemById(HttpServletRequest request,ModelMap m){
		
		String idStr = request.getParameter("id");
		Integer id = Integer.parseInt(idStr);
		
		Item item = is.findItemById(id);
		
		m.addAttribute("item", item);
		
		return "editItem";
		
	}*/
	
	@RequestMapping("/findItemById.action")
	public String findItemById(@RequestParam(value="itemid",required=true,defaultValue="1") Integer id,ModelMap m){
		
		Item item = is.findItemById(id);
		
		m.addAttribute("item", item);
		
		return "editItem";
		
	}
	
	@RequestMapping("/update.action")
	public String update(Item item){
		
		is.update(item);
		
		return "succ";
		
	}
	
	@RequestMapping("/toinsert.action")
	public String toinsert(){
		
		return "insert";
	}
	@RequestMapping("/insert.action")
	public String insert(Item item){
		
		is.insert(item);
		
		return "succ";
	}
	
	@RequestMapping("/delete.action")
	public String delete(int id){
		
		is.delete(id);
		
		return "succ";
	}
	
	@RequestMapping("/queryitem.action")
	public String queryitem(ItemVo vo){
		
		System.out.println(vo.getItem().getId());
		
		System.out.println(vo.getItem().getName());
		
		return "succ";
		
	}
	
}
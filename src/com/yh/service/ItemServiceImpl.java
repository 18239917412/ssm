package com.yh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yh.bean.Item;
import com.yh.mapper.ItemMapper;

@Service("ItemService")
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemMapper mapper;
	
	@Override
	public List<Item> findItem() {
		
		return mapper.findItem();
		
	}

	@Override
	public Item findItemById(int id) {

		return mapper.findItemById(id);
		
	}

	@Override
	public void insert(Item item) {

		mapper.insert(item);
		
	}
	
	@Override
	public void update(Item item) {
		
		mapper.update(item);
		
	}

	@Override
	public void delete(int id) {
		
		mapper.delete(id);
		
	}
	
}

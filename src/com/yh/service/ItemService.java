package com.yh.service;

import java.util.List;

import com.yh.bean.Item;

public interface ItemService {

	public List<Item> findItem();
	
	public Item findItemById(int id);
	
	public void insert(Item item);
	
	public void update(Item item);
	
	public void delete(int id);
	
}

package com.yh.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.yh.bean.Item;

@Repository
public interface ItemMapper {

	public List<Item> findItem();
	
	public Item findItemById(int id);
	
	public void insert(Item item);
	
	public void update(Item item);
	
	public void delete(int id);
}

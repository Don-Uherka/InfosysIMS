package com.qa.ims.controllers;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.ims.controller.OrderController;
import com.qa.ims.persistence.dao.OrderDAO;
import com.qa.ims.persistence.dao.OrderItemsDAO;
import com.qa.ims.persistence.domain.Item;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.persistence.domain.OrderItems;
import com.qa.ims.utils.Utils;
@RunWith(MockitoJUnitRunner.class)
public class OrderTestController {
	@Mock
	private Utils utils;

	@Mock
	private OrderDAO dao;
	
	@Mock
	private OrderItemsDAO orderItemsDAO;

	@InjectMocks
	private OrderController controller;
	
	
	@Test
	public void testCreate() {
		final Long fkCustomerId = 1L;
		final Order created = new Order(fkCustomerId);

		Mockito.when(utils.getLong()).thenReturn(fkCustomerId);
		Mockito.when(dao.create(created)).thenReturn(created);

		assertEquals(created, controller.create()); 
  
		Mockito.verify(utils, Mockito.times(1)).getLong(); 
		Mockito.verify(dao, Mockito.times(1)).create(created);
	}
	
	@Test
	public void testAddItem() {
		OrderItems updated = new OrderItems(1L, 1L, 2L);
		final Long fkOrderId = 1L;
		final Long fkItemId = 1L;
		final Long quantity = 2L;
		
		Mockito.when(utils.getLong()).thenReturn(fkOrderId);
		Mockito.when(utils.getLong()).thenReturn(fkItemId);
		Mockito.when(utils.getLong()).thenReturn(quantity);
		Mockito.when(orderItemsDAO.addItem(updated)).thenReturn(updated);
		
		
		assertEquals(null, controller.addItem());
		
		Mockito.verify(this.utils, Mockito.times(3)).getLong();
		
	}
	
	@Test
	public void testDelete() {
		final long ID = 1L;

		Mockito.when(utils.getLong()).thenReturn(ID);
		Mockito.when(dao.delete(ID)).thenReturn(1);

		assertEquals(1L, this.controller.delete());

		Mockito.verify(utils, Mockito.times(1)).getLong();  
		Mockito.verify(dao, Mockito.times(1)).delete(ID);
	}
	
	@Test
	public void testReadAll() {
		List<Order> orders = new ArrayList<>();
		orders.add(new Order(1L, 1L));

		Mockito.when(dao.readAll()).thenReturn(orders);

		assertEquals(orders, controller.readAll());

		Mockito.verify(dao, Mockito.times(1)).readAll(); 
	}
	
//	public void testUpdate() {
//		Mockito.when(this.utils.getString()).thenReturn("Add");
//		Mockito.when(controller.addItem()).thenReturn(null);
//		assertEquals(null, controller.update());
//		Mockito.when(this.utils.getString()).thenReturn("Remove"); 
//		
//		assertEquals(null, this.controller.update());
//		
//		Mockito.verify(this.utils, Mockito.times(2)).getString();
//	}
	

}

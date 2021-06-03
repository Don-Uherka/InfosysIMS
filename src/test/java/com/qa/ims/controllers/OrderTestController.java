package com.qa.ims.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.ims.controller.OrderController;
import com.qa.ims.persistence.dao.OrderDAO;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.utils.Utils;
@RunWith(MockitoJUnitRunner.class)
public class OrderTestController {
	@Mock
	private Utils utils;

	@Mock
	private OrderDAO dao;

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
	

}

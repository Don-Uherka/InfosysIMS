package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.OrderDAO;
import com.qa.ims.persistence.dao.OrderItemsDAO;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.persistence.domain.OrderItems;
import com.qa.ims.utils.Utils;

public class OrderController implements CrudController<Order> {
	
	public static final Logger LOGGER = LogManager.getLogger();
	
	private OrderDAO orderDAO;
	private OrderItemsDAO orderItemsDAO = new OrderItemsDAO();
	private Utils utils;
	
	public OrderController(OrderDAO orderDAO, Utils utils) {
		super();
		this.orderDAO = orderDAO;
		this.utils = utils; 
	}

	@Override
	public List<Order> readAll() {
		List<Order> orders = orderDAO.readAll();
		for (Order order : orders) {
			LOGGER.info(order);
		}
		return orders;
	}

	@Override
	public Order create() {
		LOGGER.info("Please enter a customer id for the order");
		Long fkCustomerId = utils.getLong();
		Order order = orderDAO.create(new Order(fkCustomerId));
		LOGGER.info("Order created");
		return order;
	}

	@Override
	public Order update() {
		LOGGER.info("Do you want to add or remove an item?");
		String choice = utils.getString();
		switch(choice) {
		case "Add":
			addItem();
			break;
		case "Remove":
			break;
		}
				
		return null;
	}

	private OrderItems addItem() {
		LOGGER.info("Please enter the id of the order you would like to update");
		Long fkOrderId = utils.getLong();
		LOGGER.info("Please enter the id of the item you would like to add");
		Long fkItemId = utils.getLong();
		LOGGER.info("Please enter a quantity");
		Long quantity = utils.getLong();
		OrderItems orderItems = orderItemsDAO.addItem(new OrderItems(fkItemId, fkOrderId, quantity));
		return orderItems;
		
	}

	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the order you would like to delete");
		Long orderId = utils.getLong();
		return orderDAO.delete(orderId);
	}
	

}

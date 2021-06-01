package com.qa.ims.persistence.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.DBUtils;

public class ItemDAOTest {
	
	private final ItemDAO DAO = new ItemDAO();
	
	@Before
	public void setup() {
		DBUtils.connect();
		DBUtils.getInstance().init("src/test/resources/sql-schema.sql", "src/test/resources/sql-data.sql");
	}
	
	@Test
	public void testCreate() {
		final Item created = new Item(1L, "playstation", (double) 600);
		assertEquals(created, DAO.create(created));
	}
	
	@Test
	public void testReadAll() {
		List<Item> expected = new ArrayList<>();
		expected.add(new Item(1L, "xbox", (double) 600));
		assertEquals(expected, DAO.readAll()); 
	}  
	
	public void testReadLatest() {
		assertEquals(new Item(1L, "xbox", (double) 600), DAO.readLatest());
	}
	
	@Test
	public void testRead() {
		final long ID = 1L;
		assertEquals(new Item(ID, "xbox", (double) 600), DAO.read(ID));
	}
	
	@Test
	public void testUpdate() {
		final Item updated = new Item(1L, "xbox", (double) 600);
		assertEquals(updated, DAO.update(updated));

	} 
	
	@Test
	public void testDelete() {
		assertEquals(1, DAO.delete(1));
	}
	
	@Test
	public void testCreateException() {
		final Item created = new Item(2L, "xboxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", (double) 600);
		assertNull(DAO.create(created));
	}
	
	@Test
	public void testUpdateException() {
		final Item updated = new Item(1L, "xboxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", (double) 600);
		assertNull(DAO.update(updated));
	}
	
	@Test
	public void testReadException() {
		final long ID = 0;
		assertNull(DAO.read(ID));
	} 

}

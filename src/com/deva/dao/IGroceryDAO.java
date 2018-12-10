package com.deva.dao;

import java.util.ArrayList;

import com.deva.pojo.BookTable;
import com.deva.pojo.ElectronicsTable;
import com.deva.pojo.FashionTable;
import com.deva.pojo.GroceryTable;

public interface IGroceryDAO {
	
	
	public ArrayList<GroceryTable> getGrocery();
	public ArrayList<ElectronicsTable> getElectronics();
	public ArrayList<FashionTable> getFashionItems();
	public ArrayList<BookTable> getBooks();
	
	}
package com.deva.utility;

import com.deva.dao.GroceryDAO;
import com.deva.dao.IGroceryDAO;



public class DAOUtility {
	public static IGroceryDAO getGroceryDAO(){
		return  new GroceryDAO();
		
	}
}

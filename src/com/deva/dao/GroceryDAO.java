package com.deva.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import java.sql.SQLException;
import java.util.ArrayList;

import com.deva.pojo.BookTable;
import com.deva.pojo.ElectronicsTable;
import com.deva.pojo.FashionTable;
import com.deva.pojo.GroceryTable;

public class GroceryDAO implements IGroceryDAO  {

	public ArrayList<GroceryTable> getGrocery() {
		ArrayList<GroceryTable> arrayList=new ArrayList<GroceryTable>();
		Connection connection=ConnectionFactory.getConnection();
		try{
		PreparedStatement stmt=connection.prepareStatement("select * from grocery" );
		ResultSet set=stmt.executeQuery();
		while(set.next()){
			String name=set.getString("Name");
			double price=set.getDouble("price");
			arrayList.add(new GroceryTable (name,price));}
		
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return arrayList; 
	}

	@Override
	public ArrayList<ElectronicsTable> getElectronics() {
		ArrayList<ElectronicsTable> arrayList=new ArrayList<ElectronicsTable>();
		Connection connection=ConnectionFactory.getConnection();
		try{
		PreparedStatement stmt=connection.prepareStatement("select * from electronics" );
		ResultSet set=stmt.executeQuery();
		while(set.next()){
			String name=set.getString("Name");
			double price=set.getDouble("price");
			arrayList.add(new ElectronicsTable (name,price));}
		
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return arrayList; 
	}

	@Override
	public ArrayList<FashionTable> getFashionItems() {
		ArrayList<FashionTable> arrayList=new ArrayList<FashionTable>();
		Connection connection=ConnectionFactory.getConnection();
		try{
		PreparedStatement stmt=connection.prepareStatement("select * from fashion" );
		ResultSet set=stmt.executeQuery();
		while(set.next()){
			String name=set.getString("Name");
			double price=set.getDouble("price");
			arrayList.add(new FashionTable (name,price));}
		
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return arrayList; 
	}

	@Override
	public ArrayList<BookTable> getBooks() {
		ArrayList<BookTable> arrayList=new ArrayList<BookTable>();
		Connection connection=ConnectionFactory.getConnection();
		try{
		PreparedStatement stmt=connection.prepareStatement("select * from Books" );
		ResultSet set=stmt.executeQuery();
		while(set.next()){
			String name=set.getString("Name");
			double price=set.getDouble("price");
			arrayList.add(new BookTable (name,price));}
		
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return arrayList;
	}
	public static void main(String[] args) {
		System.out.println(new GroceryDAO().getBooks());
	}
}
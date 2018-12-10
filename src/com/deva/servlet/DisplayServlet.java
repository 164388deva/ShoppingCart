package com.deva.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deva.dao.IGroceryDAO;
import com.deva.pojo.BookTable;
import com.deva.pojo.ElectronicsTable;
import com.deva.pojo.FashionTable;
import com.deva.pojo.GroceryTable;
import com.deva.utility.DAOUtility;

/**
 * Servlet implementation class DisplayServlet
 */
@WebServlet("/display")
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher requestDispatcher=null;
		/*
		ArrayList<GroceryTable> arrayList= getGrocery();

		 request.setAttribute("arrayList", arrayList);
	requestDispatcher=request.getRequestDispatcher("/jsp/Grocery.jsp");
	   
		requestDispatcher.forward(request, response);
  */
 
		/*
		ArrayList<ElectronicsTable> arrayList= getElectronics();
		 request.setAttribute("arrayList", arrayList);
	requestDispatcher=request.getRequestDispatcher("/jsp/Electronics.jsp");
	   
		requestDispatcher.forward(request, response);
		*/
		
	ArrayList<BookTable> arrayList= getBooks();
		 request.setAttribute("arrayList", arrayList);
	requestDispatcher=request.getRequestDispatcher("/jsp/Books.jsp");
	 
		requestDispatcher.forward(request, response);  
		
		/*
		ArrayList<FashionTable> arrayList= getFashion();
		 request.setAttribute("arrayList", arrayList);
	requestDispatcher=request.getRequestDispatcher("/jsp/Fashion.jsp");
	   
		requestDispatcher.forward(request, response);
		*/
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	private ArrayList<GroceryTable> getGrocery() {
		IGroceryDAO ad= DAOUtility.getGroceryDAO();
		return ad.getGrocery();
	}
	private ArrayList<ElectronicsTable> getElectronics() {
		IGroceryDAO ad= DAOUtility.getGroceryDAO();
		return ad.getElectronics();
	}
	private ArrayList<BookTable> getBooks() {
		IGroceryDAO ad= DAOUtility.getGroceryDAO();
		return ad.getBooks();
	}
	private ArrayList<FashionTable> getFashion() {
		IGroceryDAO ad= DAOUtility.getGroceryDAO();
		return ad.getFashionItems();
	}

}

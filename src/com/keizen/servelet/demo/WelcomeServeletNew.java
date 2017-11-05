package com.keizen.servelet.demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.keizen.service.demo.welcomeService;

/**
 * Servlet implementation class WelcomeServelet
 */
@WebServlet("/WelcomeServeletNew")
public class WelcomeServeletNew extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServeletNew() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// 1. Create the data (model) and add it to the request object. 
		
				
		List<String> myMessage = new ArrayList<>();
		
		welcomeService myService = new welcomeService();
		myService.getMessage("Sangeet");
		
		request.setAttribute("myWelcomeMessageNew", myMessage);
		
		
		//2. retrieve the request dispatcher
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("WelcomeNew.jsp");
		
		//forward teh request dispatcher
		
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

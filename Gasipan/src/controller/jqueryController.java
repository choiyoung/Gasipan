package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class jqueryController
 */
@WebServlet({"/jquery/example01_01.do","/jquery/example01_02.do","/jquery/example01_03.do",
		"/jquery/example02_02.do", "/jquery/example02_03.do", "/jquery/example02_04.do",
		"/jquery/example02_05.do", "/jquery/example02_06.do", "/jquery/example02_07.do","/jquery/example02_08.do"
		,"/jquery/example02_09.do","/jquery/example02_10.do","/jquery/example02_11.do","/jquery/example02_12.do",
		"/jquery/example02_13.do","/jquery/example02_14.do","/jquery/example02_15.do","/jquery/example02_16.do"})
public class jqueryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		process(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			    request.setCharacterEncoding("UTF-8");
			    String path = request.getServletPath().substring(+1);
			    	
			    String url = "";
			    switch (path) {
			    case "jquery/example01_01.do": url="ch01/example01_01";break;
			    case "jquery/example01_02.do": url="ch01/example01_02";break; 
			    case "jquery/example01_03.do": url="ch01/example01_03";break;
			    
			    case "jquery/example02_02.do": url="ch02/example02_02";break; 
			    case "jquery/example02_03.do": url="ch02/example02_03";break;
			    case "jquery/example02_04.do": url="ch02/example02_04";break;
			    case "jquery/example02_05.do": url="ch02/example02_05";break;
			    case "jquery/example02_06.do": url="ch02/example02_06";break;
			    case "jquery/example02_07.do": url="ch02/example02_07";break;
			    case "jquery/example02_08.do": url="ch02/example02_08";break;
			    case "jquery/example02_09.do": url="ch02/example02_09";break;
			    case "jquery/example02_10.do": url="ch02/example02_10";break;
			    case "jquery/example02_11.do": url="ch02/example02_11";break;
			    case "jquery/example02_12.do": url="ch02/example02_12";break;
			    case "jquery/example02_13.do": url="ch02/example02_13";break;
			    case "jquery/example02_14.do": url="ch02/example02_14";break;
			    case "jquery/example02_15.do": url="ch02/example02_15";break;
			    case "jquery/example02_16.do": url="ch02/example02_16";break;
			   
			    
			    default : break;
			    }
			    if(path.substring(0,5).equals("jquer")){
			        RequestDispatcher dispatcher 
			            = request.getRequestDispatcher("/jquery/"+url+".html");
			        dispatcher.forward(request, response);
			    }else{
			    	 RequestDispatcher dispatcher 
			            = request.getRequestDispatcher(url);
			        dispatcher.forward(request, response);
			    }
	}

}

package edu.global.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.global.ex.shape.Circle;
import edu.global.ex.shape.Rectangle;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/rectangleArea")
public class ShapeServelet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShapeServelet2() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().append("메롱");


		response.setContentType("text/html; charset=UTF-8");

		PrintWriter writer = response.getWriter();

		writer.println("<html>");
		writer.println("<head>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("<h1>포스트방식입니다.</h1>");
		writer.println("</body>");
		writer.println("</html>");

		writer.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String width = request.getParameter("width");
		String height = request.getParameter("height");
		Rectangle rectangle = new Rectangle(Double.valueOf(width), Double.valueOf(height));
		//double area = Double.valueOf(radius) * Double.valueOf(radius) * Math.PI;
		
		System.out.println("가로:" + width);
		System.out.println("세로:" + height);
		
		response.setContentType("text/html; charset=UTF-8");

		PrintWriter writer = response.getWriter();

		writer.println("<html>");
		writer.println("<head>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("<h1> 넓이는 : " + rectangle.getArea() + "</h1>");
		writer.println("</body>");
		writer.println("</html>");

		writer.close();
	}

}

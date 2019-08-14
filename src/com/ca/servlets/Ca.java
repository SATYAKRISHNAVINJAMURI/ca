package com.ca.servlets;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ca.classes.StudentImplementationDao;
import com.ca.classes.User;
import com.ca.interfaces.StudentDaoI;



/**
 * Servlet implementation class Ca
 */
@WebServlet("/Ca")
public class Ca extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static Connection connection = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ca() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		try {
			Properties properties = new Properties();
			properties.load(getServletContext().getResourceAsStream("/WEB-INF/db.properties"));
			String dbDriver = properties.getProperty("dbDriver");
			String dbUrl = properties.getProperty("dbUrl");
			String dbPass = properties.getProperty("dbPass");
			String dbUser = properties.getProperty("dbUser");
			Class.forName(dbDriver);
			connection = DriverManager.getConnection(dbUrl, dbUser, dbPass);
			if(connection != null){
				System.out.println("Success");
			}
			
		} catch (IOException | SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String str = request.getParameter("action");
		switch(str){
			case "login":
				login(request, response);
				
				break;
			default:
				break;
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	
	protected void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		/*
		 *login validation and redirect to the student_index or faculty_index pages. 
	 	*/
		int user_id = Integer.parseInt(request.getParameter("user_id"));
		String password = request.getParameter("password");
		User user  = new StudentImplementationDao().getCredentials(connection, user_id, password);
		if(user == null){
			request.getRequestDispatcher("studentindex.jsp").forward(request,response);
		}else if(user.getRole() == "faculty"){
			try {
				request.getRequestDispatcher("facultyindex.jsp").forward(request,response);
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(user.getRole() == "student"){
			try {
				request.getRequestDispatcher("studentindex.jsp").forward(request, response);
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}	
	}
	
	protected void submitApplication(){
		/*
		 *update applications table and redirect to index page.
		 */
		
	}
	protected void viewDepartments(){
		/*
		 * 
		 */
	}
	

	
	protected void displayAlumni(){
		/*
		 * go to the alumni page where all the alumni were displayed and one can search for a alumni,
		 */
	}
	
	protected void searchAlumni(String name){
		/*
		 * search alumni and display his complete details.
		 */
		
	}
	
	protected void viewSchedule(){
		/*
		 * go to the schedule page and display the schedule depending on the department.
		 */
		
	}
	
	protected void viewEvents(){
		/*
		 * go to events page and display all the events,
		 */
	}
	
	protected void viewExamResults(){
		/*
		 * go to results page and display all the results.
		 */
		
	}
	
	protected void placementDetails(){
		/*
		 * placements page and display placement information.
		 */
	}

	protected void uploadAssign(){
		/*
		 * upload some file  to a directory
		 */
		
	}
	
	protected void downloadAssign(){
		/*
		 * download some file to a directory
		 */
	}
	
	protected void findOnlineExams(){
		/*
		 * display online exams in onlineexams page
		 */
	}
	
	protected void ApplicationStatus(int id){
		/*
		 * application page and display the status and details of application.
		 */
	}
	
	protected void classesSchedule(){
		/*
		 * classesschedule page and display all the classes.
		 */
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

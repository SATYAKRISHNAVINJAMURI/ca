package com.ca.servlets;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ca.classes.*;



/**
 * Servlet implementation class Ca
 */
@WebServlet("/Ca")
public class Ca extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection connection = null;
       
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
		System.out.println(str);
		if(str == null){
			welcome(request,response);
		}
		
		switch(str){
			case "login":
//				login();
				break;
			case "register":
				try {
					submitApplication(request,response);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			default: 
				request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	protected void welcome(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		List<Branches> branchList=new ArrayList<>();
		String query="select * from branches";
		try(PreparedStatement ptmt=connection.prepareStatement(query)){
			ResultSet r1=ptmt.executeQuery();
			while(r1.next()){
				branchList.add(new Branches(r1.getString(1),r1.getString(2)));
			}
			request.setAttribute("branchList",branchList);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}catch(SQLException e){
			e.printStackTrace();
			
		}
	}
	
	protected void login(
			Connection connection,HttpServletRequest request,HttpServletResponse response,String username, String password){
		/*
		 *login validation and redirect to the student_index or faculty_index pages. 
	 	*/
	}
	
	protected void submitApplication(HttpServletRequest request,HttpServletResponse response) throws SQLException{
        ApplicantDao applicant=new ApplicantDao();
        if(applicant.pushApplicantsToDatabase(connection, request, response) == 0){
        	
        }else{
        	try {
				request.getRequestDispatcher("index.jsp").forward(request, response);
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        
	
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

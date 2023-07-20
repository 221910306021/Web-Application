

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest a_req, HttpServletResponse a_res) throws ServletException, IOException
	{
		doPost(a_req, a_res);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res)	throws ServletException, IOException
	{
		System.out.println("##########post.....");
		
		String uname=req.getParameter("username");
		String pwd=req.getParameter("pwd");
		String action=req.getParameter("action");
		System.out.println("action="+action);
		PreparedStatement st=null;
		ResultSet rs = null;
		String sql="select * from users where user_name=? and password=?";
		Connection con = null;
		
		try {
			con=getConnection();
			
			if(action.equals("signup")){ 
			String uname1=req.getParameter("username"); 
			String pwd1=req.getParameter("pwd"); 
			String sql1="insert into users values (?,?)"; 
			st=con.prepareStatement(sql1);
			st.setString(1, uname1);
			st.setString(2, pwd1);
			st.executeUpdate();
			RequestDispatcher rdDispatcher = getServletContext().getRequestDispatcher("/registersuccess.jsp");
			rdDispatcher.forward(req,res);
			} 
			else{
			st=con.prepareStatement(sql);
			st.setString(1, uname);
			st.setString(2, pwd);
			rs=st.executeQuery();
			if(rs.next()){
				System.out.println("11111111");
				RequestDispatcher rdDispatcher = getServletContext().getRequestDispatcher("/loginsuccess.jsp");
				rdDispatcher.forward(req,res);
			}else{
				System.out.println("222222222");
				RequestDispatcher rdDispatcher = getServletContext().getRequestDispatcher("/loginfail.jsp");
				rdDispatcher.forward(req,res);
			}
				
			
			System.out.println("33333333");
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	
	
	public  Connection getConnection()throws Exception{
        Connection con=null;      
        try{      		
        	System.out.println("get con........");
      	  Class.forName("oracle.jdbc.driver.OracleDriver");	
  			
      	  	String url="jdbc:oracle:thin:@localhost:1521:orcl";
      	  	
			String uname="system";
			String pass="password11";	
  			con=DriverManager.getConnection(url, uname, pass);
  			System.out.println("@@@@con:"+con);
      	
      	  
        } catch(SQLException e){
        	e.printStackTrace();
        	
        } catch(Exception e){
        	e.printStackTrace();
      	
        }
        return con;
      }
}

package action;

import java.sql.*;
import java.util.*;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class BookEdit {
	private String editName;
	
	private String editAuthor;
	private String editPublisher;
	private String editPublishDate;
	private String editPrice;
	
	private String finishAuthor;
	private String finishPublisher;
	private String finishDate;
	private String finishPrice;
	
	public static String Title;
	
	public String edit(){
		try {
		      Class.forName("com.mysql.jdbc.Driver");     //加载MYSQL JDBC驱动程序   
		     System.out.println("Success loading Mysql Driver!");
		    }
		    catch (Exception e) {
		      System.out.print("Error loading Mysql Driver!");
		      e.printStackTrace();
		    }
		try {
		      Connection connect = DriverManager.getConnection(
		          //"jdbc:mysql://localhost:3306/BookDB","root","wcp19970221");
		    	 "jdbc:mysql://dgvhyxhewwad.rds.sae.sina.com.cn:10581/lab2","wcp","wcp19970221");
		      System.out.println("Success connect Mysql server!");
		      Statement stmt = connect.createStatement();
		      	{
		      		stmt.executeUpdate("update Book set AuthorID='"+finishAuthor+"' where Title='"+Title+"'");
		      		stmt.executeUpdate("update Book set Publisher='"+finishPublisher+"' where Title='"+Title+"'");
		      		stmt.executeUpdate("update Book set PublishDate='"+finishDate+"' where Title='"+Title+"'");
		      		stmt.executeUpdate("update Book set Price='"+finishPrice+"' where Title='"+Title+"'");
		      	}
		}
		catch (Exception e) {
	      System.out.print("get data error!");
	      e.printStackTrace();
	    }
		return "SUCCESS";
	}
	
	public String editPre() throws Exception{
		try {
		      Class.forName("com.mysql.jdbc.Driver");     //加载MYSQL JDBC驱动程序   
		     System.out.println("Success loading Mysql Driver!");
		    }
		    catch (Exception e) {
		      System.out.print("Error loading Mysql Driver!");
		      e.printStackTrace();
		    }
		try {
		      Connection connect = DriverManager.getConnection(
		          //"jdbc:mysql://localhost:3306/BookDB","root","wcp19970221");
		    	 "jdbc:mysql://dgvhyxhewwad.rds.sae.sina.com.cn:10581/lab2","wcp","wcp19970221");
		      System.out.println("Success connect Mysql server!");
		      Statement stmt = connect.createStatement();
		      ResultSet rs = stmt.executeQuery("select * from Book where Title='"+editName+"'");
		      Title=editName;
		      while (rs.next()) {
		    	editAuthor=rs.getString("AuthorID");
		    	editPublisher=rs.getString("Publisher");
		    	editPublishDate=rs.getString("PublishDate");
		    	editPrice=rs.getString("Price");
		      }
		}
		catch (Exception e) {
	      System.out.print("get data error!");
	      e.printStackTrace();
	    }
		return "SUCCESS";
	}
	
	
	public String getEditName() {
		return editName;
	}
	public void setEditName(String editName) {
		this.editName = editName;
	}
	public String getEditAuthor() {
		return editAuthor;
	}
	public void setEditAuthor(String editAuthor) {
		this.editAuthor = editAuthor;
	}
	public String getEditPublisher() {
		return editPublisher;
	}
	public void setEditPublisher(String editPublisher) {
		this.editPublisher = editPublisher;
	}
	public String getEditPublishDate() {
		return editPublishDate;
	}
	public void setEditPublishDate(String editPublishDate) {
		this.editPublishDate = editPublishDate;
	}
	public String getEditPrice() {
		return editPrice;
	}
	public void setEditPrice(String editPrice) {
		this.editPrice = editPrice;
	}
	public String getFinishAuthor() {
		return finishAuthor;
	}
	public void setFinishAuthor(String finishAuthor) {
		this.finishAuthor = finishAuthor;
	}
	public String getFinishPublisher() {
		return finishPublisher;
	}
	public void setFinishPublisher(String finishPublisher) {
		this.finishPublisher = finishPublisher;
	}
	public String getFinishDate() {
		return finishDate;
	}
	public void setFinishDate(String finishDate) {
		this.finishDate = finishDate;
	}
	public String getFinishPrice() {
		return finishPrice;
	}
	public void setFinishPrice(String finishPrice) {
		this.finishPrice = finishPrice;
	}
	
	
}

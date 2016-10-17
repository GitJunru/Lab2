package action;

import java.sql.*;
import java.util.*;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class AddNew {
	private String inputISBN;
	private String inputTitle;
	private String inputAuthorID;
	private String inputPublisher;
	private int inputPublishDate;
	private int inputPrice;
	
	private String inputName;
	private String inputAge;
	private String inputCountry;
	
	public static String Name="";
	public static String ID="";
	public String addnew(){
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
		      int num=stmt.executeUpdate("insert into Book values('"+inputISBN+"','"+inputTitle+"','"+inputAuthorID+"','"+inputPublisher+"',"+inputPublishDate+","+inputPrice+")");
		      if(num>=1)	System.out.print("success add "+num+" records");
		      else	System.out.print("Add data error!");
		      ID=inputAuthorID;
		      ResultSet rs = stmt.executeQuery("select * from Author where AuthorID='"+inputAuthorID+"'");
		      if(rs.next()) ;
		      else{
		    	  return "EMPTY";
		      }
		} 
		catch (Exception e) {
		      System.out.print("get data error!");
		      e.printStackTrace();
		    }
		return "SUCCESS";
	}
	
	public String addAuthor(){
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
		      int num=stmt.executeUpdate("insert into Author values('"+ID+"','"+inputName+"',"+inputAge+",'"+inputCountry+"')");
		      if(num>=1)	System.out.print("success add "+num+" records");
		      else	System.out.print("Add data error!");
		      
		} 
		catch (Exception e) {
		      System.out.print("get data error!");
		      e.printStackTrace();
		    }
		return "SUCCESS";
	}

	public String getInputISBN() {
		return inputISBN;
	}

	public void setInputISBN(String inputISBN) {
		this.inputISBN = inputISBN;
	}

	public String getInputTitle() {
		return inputTitle;
	}

	public void setInputTitle(String inputTitle) {
		this.inputTitle = inputTitle;
	}

	public String getInputAuthorID() {
		return inputAuthorID;
	}

	public void setInputAuthorID(String inputAuthorID) {
		this.inputAuthorID = inputAuthorID;
	}

	public String getInputPublisher() {
		return inputPublisher;
	}

	public void setInputPublisher(String inputPublisher) {
		this.inputPublisher = inputPublisher;
	}

	public int getInputPublishDate() {
		return inputPublishDate;
	}

	public void setInputPublishDate(int inputPublishDate) {
		this.inputPublishDate = inputPublishDate;
	}

	public int getInputPrice() {
		return inputPrice;
	}

	public void setInputPrice(int inputPrice) {
		this.inputPrice = inputPrice;
	}

	public String getInputAge() {
		return inputAge;
	}

	public void setInputAge(String inputAge) {
		this.inputAge = inputAge;
	}

	public String getInputCountry() {
		return inputCountry;
	}

	public void setInputCountry(String inputCountry) {
		this.inputCountry = inputCountry;
	}

	public String getInputName() {
		return inputName;
	}

	public void setInputName(String inputName) {
		this.inputName = inputName;
	}
	
	
}

package action;

import java.sql.*;
import java.util.*;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

public class BookDB extends ActionSupport{
	private String AuthorName;
	private String Book;
	private String deleteName;
	private List bookname= new ArrayList();
	private List bookDetail= new ArrayList();
	private List authorDetail= new ArrayList();
	public String getBook() {
		return Book;
	}

	public void setBook(String book) {
		Book = book;
	}

	public List getBookname() {
		return bookname;
	}

	public void setBookname(List bookname) {
		this.bookname = bookname;
	}

	public String getAuthorName() {
		return AuthorName;
	}

	public void setAuthorName(String AuthorName) {
		this.AuthorName = AuthorName;
	}
	
	public String getDeleteName() {
		return deleteName;
	}

	public void setDeleteName(String deleteName) {
		this.deleteName = deleteName;
	}

	public List getBookDetail() {
		return bookDetail;
	}

	public void setBookDetail(List bookDetail) {
		this.bookDetail = bookDetail;
	}
	
	public List getAuthorDetail() {
		return authorDetail;
	}

	public void setAuthorDetail(List authorDetail) {
		this.authorDetail = authorDetail;
	}
	
	public String find() throws Exception{
		HashSet hashSet=new HashSet<String>();
		String ID="";
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
		      ResultSet rs = stmt.executeQuery("select * from Author where Name='"+AuthorName+"'");
		      if(rs.next()){
		    	  hashSet.add(rs.getString("AuthorID"));
		      }
		      else {
		    	  return "NOPERSON";
		      }
		      while(rs.next()){
		    	  hashSet.add(rs.getString("AuthorID"));
		      }
		      Iterator it = hashSet.iterator();
		      while(it.hasNext()){
		    	  Object obj = it.next();
		    	  rs =stmt.executeQuery("select * from Book where AuthorID='"+(String)obj+"'");
			      while (rs.next()) {
					//System.out.print(rs.getString("ISBN")+" ");
			        //System.out.print(rs.getString("Title")+" ");
			    	bookname.add(rs.getString("Title"));
			        //System.out.print(rs.getString("AuthorID")+" ");
			        //System.out.print(rs.getString("Publisher")+" ");
			        //System.out.println("");
			      }
		      }
		    }
		    catch (Exception e) {
		      System.out.print("get data error!");
		      e.printStackTrace();
		    }
		return "SUCCESS";
	}

	public String detail() throws Exception{
		String name="";
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
		      ResultSet rs = stmt.executeQuery("select * from Book where Title='"+Book+"'");
		      while (rs.next()) {
		    	name=rs.getString("AuthorID");
		        bookDetail.add(rs.getString("ISBN"));
		        bookDetail.add(rs.getString("Title"));
		        bookDetail.add(rs.getString("AuthorID"));
		        bookDetail.add(rs.getString("Publisher"));
		        bookDetail.add(rs.getString("PublishDate"));
		        bookDetail.add(rs.getString("Price"));
		        //System.out.print(rs.getString("ISBN")+" ");
		      }
		      //ActionContext.getContext().put("bookDetail",bookDetail);
		      
		      ResultSet rs2 = stmt.executeQuery("select * from Author where AuthorID='"+name+"'");
		      while (rs2.next()) {
		    	  authorDetail.add(rs2.getString("AuthorID"));
		    	  authorDetail.add(rs2.getString("Name"));
		    	  authorDetail.add(rs2.getString("Age"));
		    	  authorDetail.add(rs2.getString("Country"));
		      }
		      //ActionContext.getContext().put("authorDetail",authorDetail);
		    }
		    catch (Exception e) {
		      System.out.print("get data error!");
		      e.printStackTrace();
		    }
		return "SUCCESS";
	}
	
	public String delete() throws Exception{
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
		      int num=stmt.executeUpdate("delete from Book where Title='"+deleteName+"'");
		      if(num>=1)	System.out.print("success delete "+num+" records");
		      else	System.out.print("No record or Delete data error!");
		} 
		catch (Exception e) {
		      System.out.print("get data error!");
		      e.printStackTrace();
		    }
		return "SUCCESS";
	}
	
}

//Lab3测试git

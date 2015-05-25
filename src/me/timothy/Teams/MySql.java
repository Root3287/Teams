package me.timothy.Teams;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySql {
	private Connection conn;
	private String host, port, user, password, db, prefix;
	private ResultSet result;
	private int count;
	private boolean errors;
	//private static MySql instance = new MySql();

	public MySql(){
		
	}
	public MySql(String host, String user, String Password, String DB, String prefix){
		this.host = host;
		this.user = user;
		this.password = Password;
		this.db = DB;
		this.prefix = prefix;
	}
	
	public void connect(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc://"+this.host+":"+this.port+"/"+this.db+"?user="+this.user+"&password="+this.password);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public MySql query(String q){
		try{
			PreparedStatement ps = conn.prepareStatement(q);
			ps.executeQuery();
			this.result = ps.getResultSet();
			this.count = ps.getMaxRows();
			this.errors = false;
		}catch(SQLException e){
			e.printStackTrace();
			this.errors = true;
		}
		return this;
	}
	
	public MySql query(String q, String[] fields) throws SQLException{
		try{
			PreparedStatement ps = conn.prepareStatement(q);
			
			if(fields.length>0){
				int i = 1;
				for(String field : fields){
					ps.setString(i, field);
					i++;
				}
			}
			ps.executeQuery();
			this.result = ps.getResultSet();
			this.count = ps.getMaxRows();
			this.errors = false;
		}catch(SQLException e){
			e.printStackTrace();
			this.errors = true;
		}
		return this;
	}

	public void create(String Table, String fields) throws SQLException{
		query("CREATE TABLE "+Table+"("+fields+")");
	}
	
	public ResultSet result(){
		return this.result;
	}
	public boolean errors(){
		return this.errors;
	}
	public int count(){
		return this.count;
	}
}

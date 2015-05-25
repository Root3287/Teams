package me.timothy.Teams;

import java.sql.Connection;

public class MySql {
	private Teams instance;
	public Connection conn;
	private String host, port, user, password, db;

	
	public MySql(String host, String user, String Password, String DB, Teams p){
		this.host = host;
		this.user = user;
		this.password = Password;
		this.db = DB;
		instance = p;
	}
	
	public void connect(){
		
	}
}

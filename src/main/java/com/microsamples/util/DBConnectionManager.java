package com.microsamples.util;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.SQLException;

public class DBConnectionManager {

	private MysqlDataSource dataSource;
	
	public DBConnectionManager(String dbURL, String user, String pwd) throws ClassNotFoundException, SQLException{
		dataSource = new MysqlDataSource();
		dataSource.setURL(dbURL);
		dataSource.setUser(user);
		dataSource.setPassword(pwd);
	}
	
	public DataSource getDatasource(){
		return dataSource;
	}
}

package com.niharku.designPatterns.Structural.Facade;

import java.sql.Connection;

public class HelperFacade {
	
	Connection conn;
	
	public void generateReport(DBType dbType, ReportType reportType, String tableName){
		
		switch(dbType) {
		
		case MYSQL:
			conn = MySQLHelper.getDBConnection();
			switch(reportType) {
			case PDF:
				MySQLHelper.generatePDFReport(tableName, conn);
				break;
			
			case HTML:
				MySQLHelper.generateHTMLReport(tableName, conn);
				break;
			
			}
			
		case ORACLE:
			conn = OracleHelper.getDBConnection();
			switch(reportType) {
			case PDF:
				OracleHelper.generatePDFReport(tableName, conn);
				break;
			
			case HTML:
				OracleHelper.generateHTMLReport(tableName, conn);
				break;
			
			}
		}
		
		
	}
	
	public static enum DBType {
		MYSQL,
		ORACLE
	}
	
	public static enum ReportType {
		PDF,
		HTML
	}


}

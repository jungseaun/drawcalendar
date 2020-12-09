package com.project.draw.brand.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.project.draw.brand.BrandVO;


public class BrandDAO {
	
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	
	public void insert_brand(BrandVO vo) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@drawcalendar.cyeadvl5x6ht.ap-northeast-2.rds.amazonaws.com:1521:ORCL", "jung", "jung12!#");
			ps = con.prepareStatement("insert into brand values(?,?)");
			ps.setString(1, vo.getBrand_code());
			ps.setString(2, vo.getBrand_name());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if( ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if( con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

	
	
}

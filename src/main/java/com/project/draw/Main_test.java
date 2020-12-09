package com.project.draw;

import java.util.List;

import javax.activation.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.project.draw.draw_plan.Draw_planDAO;
import com.project.draw.draw_plan.Draw_planVO;

public class Main_test {

	public static void main(String[] args) {
		
		Draw_planDAO dao = new Draw_planDAO();
		List<Draw_planVO> list = dao.select_draw_plan();
	
		System.out.println(list.get(0));
	}
		
}

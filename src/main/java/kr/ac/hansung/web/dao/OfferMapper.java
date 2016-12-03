package kr.ac.hansung.web.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import kr.ac.hansung.web.model.Offer;

public class OfferMapper implements RowMapper<Offer> {

	public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Offer myclass = new Offer();
		myclass.setSemester(rs.getInt("semester"));
		myclass.setCode(rs.getString("code"));
		myclass.setTitle(rs.getString("title"));
		myclass.setGrades(rs.getInt("grades"));
		myclass.setType(rs.getString("type"));
		myclass.setYear(rs.getInt("year"));		
		return myclass;
	}

}

package kr.ac.hansung.web.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.ac.hansung.web.model.Offer;


@Repository
public class OfferDAO {
	private JdbcTemplate jdbcTemplateObject;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public int getRowCount(){
		String sqlStatement = "select count(*) from offers";
		return jdbcTemplateObject.queryForObject(sqlStatement,Integer.class);		
	}
	public int getsemesterGrade(int x,int y){
		String sqlStatement = "select sum(grades) from class where year = ? and semester = ?";
		return jdbcTemplateObject.queryForObject(sqlStatement,new Object[]{x,y},Integer.class);		
	}
	public int gettypeGrade(String type){
		String sqlStatement = "select sum(grades) from class where type=?";
		return jdbcTemplateObject.queryForObject(sqlStatement,new Object[]{type},Integer.class);		
	}
	public int getGrade(int x,int y){
		String sqlStatement = "select sum(grades) from class";
		return jdbcTemplateObject.queryForObject(sqlStatement,new Object[]{x,y},Integer.class);		
	}
	//querying and returning a single object
	public Offer getOffer(String name){
		String sqlStatement = "select * from offers where name=?";
		return jdbcTemplateObject.queryForObject(sqlStatement,new Object[]{ name } ,new OfferMapper());
		
		
	}
	public List<Offer> getOffers(){
		String sqlStatement = "select * from class ";
		return jdbcTemplateObject.query(sqlStatement,new OfferMapper());
	}
	//querying and returning a multiple object
	public List<Offer> getsemesterOffers(int s,int n){
		String sqlStatement = "select * from class where year=?  in where semester =?";
		return jdbcTemplateObject.query(sqlStatement,new Object[]{s,n},new OfferMapper());
	}
	/*public boolean insert(Offer offer){
		String name = offer.getName();
		String email = offer.getEmail();
		String text = offer.getText();
		String sqlStatement = "insert into offers (name,email,text) values (?,?,?)";
		return (jdbcTemplateObject.update(sqlStatement, new Object[]{name,email,text})==1);
	}
	public boolean update(Offer offer){
		int id = offer.getId();
		String name = offer.getName();
		String email = offer.getEmail();
		String text = offer.getText();
		
		String sqlStatement = "update offers set name=?, email=?,text=? where id=?";
		return (jdbcTemplateObject.update(sqlStatement, new Object[]{name,email,text,id})==1);
	}
	public boolean delete(int id){
		String sqlStatement = "delete from offers where id=?";
		return (jdbcTemplateObject.update(sqlStatement, new Object[]{id})==1);
		
	}*/
}

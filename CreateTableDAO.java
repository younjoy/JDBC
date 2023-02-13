package day0209.work;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import kr.co.sist.dao.conn.DbConnection;

public class CreateTableDAO {

	private static CreateTableDAO ctDAO;
	
	
	/**
	 * 클래스 내부에서만 객체화될 수 있도록 접근지정자를 private으로 설정.
	 */
	public CreateTableDAO() {
		
	}//CreateTableDAO
	
	/**
	 * 객체를 하나로 유지하고 하나의 객체를 반환하는일.
	 * @return
	 */
	public static CreateTableDAO getInstance() {
		if(ctDAO == null){
			ctDAO = new CreateTableDAO();
		}//end if
		return ctDAO;
	}//getInstance
	
	
	//sql문 실행할곳
	public void create() throws SQLException {
		String sql ="";
//		boolean flag = 
		
		//1.드라이버로딩
		Connection con=null;
		Statement stmt=null;
		
		DbConnection db = DbConnection.getInstance();
		
		//2.로딩되니 드라이버를 사용하여 "Connetion"얻기
		try {
		con=db.getConn();
		//3.쿼리문을 생성하고 실행할 수 있는 "쿼리문 생성객체얻기"
		String createSql ="";
		
		//4.바인드변수에 값 설정
		//5.쿼리문 실행 후 결과 받기
		}finally {
		//6.연결끊기
			db.dbClose(null, stmt, con);
		}//end finally
		
	}//create
	
	
}//class

package day0209.work;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import kr.co.sist.dao.conn.DbConnection;

public class CreateTableDAO {

	private static CreateTableDAO ctDAO;
	
	
	/**
	 * Ŭ���� ���ο����� ��üȭ�� �� �ֵ��� ���������ڸ� private���� ����.
	 */
	public CreateTableDAO() {
		
	}//CreateTableDAO
	
	/**
	 * ��ü�� �ϳ��� �����ϰ� �ϳ��� ��ü�� ��ȯ�ϴ���.
	 * @return
	 */
	public static CreateTableDAO getInstance() {
		if(ctDAO == null){
			ctDAO = new CreateTableDAO();
		}//end if
		return ctDAO;
	}//getInstance
	
	
	//sql�� �����Ұ�
	public void create() throws SQLException {
		String sql ="";
//		boolean flag = 
		
		//1.����̹��ε�
		Connection con=null;
		Statement stmt=null;
		
		DbConnection db = DbConnection.getInstance();
		
		//2.�ε��Ǵ� ����̹��� ����Ͽ� "Connetion"���
		try {
		con=db.getConn();
		//3.�������� �����ϰ� ������ �� �ִ� "������ ������ü���"
		String createSql ="";
		
		//4.���ε庯���� �� ����
		//5.������ ���� �� ��� �ޱ�
		}finally {
		//6.�������
			db.dbClose(null, stmt, con);
		}//end finally
		
	}//create
	
	
}//class

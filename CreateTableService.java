package day0209.work;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//1. Window Component상속, 이벤트 리스너를 구현
@SuppressWarnings("serial")
public class CreateTableService extends JFrame {
	
	private JTextField jtfTable;
	private JTextField jtfCol;
	private JTextField jtfSize;
	private JComboBox<String> jcbDataType;
	private JCheckBox cbpk;
	private JTextArea jtaprint;
	
	private JButton btTable;
	private JButton btCol;
	private JButton btCreate;

	public CreateTableService() {
		super("create table");
		
		//2.사용할컴포넌트 생성
		JLabel jlTable = new JLabel("테이블명");
		JLabel jlCol = new JLabel("컬럼명");
		JLabel jlDataType = new JLabel("데이터형");
		JLabel jlSize = new JLabel("크기");
		JLabel jlpk = new JLabel("Primary key");
		
		 jtfTable = new JTextField();
		 jtfCol = new JTextField();
		 jtfSize = new JTextField();
		
		 jtaprint = new JTextArea();
		
		 jcbDataType = new JComboBox<String>("number,varchar2,char,date".split(","));
		
		 cbpk = new JCheckBox();
		
		 btTable = new JButton("추가");
		 btCol = new JButton("추가");
		 btCreate = new JButton("생성");
		
		//3.컴포넌트를 윈도우 컴포넌트에 배치
		//수동배치
		setLayout(null);
		
		add(jlTable);
		add(jlCol);
		add(jlDataType);
		add(jlSize);
		add(jlpk);

		add(jtfTable);
		add(jtfCol);
		add(jtfSize);
		
		add(jtaprint);
		
		add(jcbDataType);
		add(cbpk);
		
		add(btTable);
		add(btCol);
		add(btCreate);
		
		
		jlTable.setBounds(30, 30, 50, 30);
		jlCol.setBounds(30, 100, 50, 30);
		jlDataType.setBounds(300, 100, 50, 30);
		jlSize.setBounds(500, 100, 50, 30);
		jlpk.setBounds(650, 100, 100, 30);

		jtfTable.setBounds(100, 30, 150, 30);
		jtfCol.setBounds(100, 100, 150, 30);
		jtfSize.setBounds(550, 100, 70, 30);

		jtaprint.setBounds(30, 180, 900, 300);
		
		jcbDataType.setBounds(370, 100, 100, 30);
		cbpk.setBounds(720, 100, 30, 30);
		
		btTable.setBounds(280, 30, 70, 30);
		btCol.setBounds(770, 100, 70, 30);
		btCreate.setBounds(850, 520, 70, 30);
		
		
		//4.이벤트 등록
		CreateTableEvt cte = new CreateTableEvt(this);
		
		btTable.addActionListener(cte);
		btCol.addActionListener(cte);
		btCreate.addActionListener(cte);
		
		//5.윈도우 컴포넌트의 크기설정
		setBounds(100, 100, 1000, 600);
		
		//6.사용자에게 윈도우 컴포넌트 보여주기
		setVisible(true);
		//7.윈도우 종료처리
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				super.windowClosing(e);
			}

			@Override
			public void windowClosed(WindowEvent e) {
				super.windowClosed(e);
			}
		
		});
		
		
	}//CreateTableService
	
	
	
	




	public JTextField getJtfTable() {
		return jtfTable;
	}








	public void setJtfTable(JTextField jtfTable) {
		this.jtfTable = jtfTable;
	}








	public JTextField getJtfCol() {
		return jtfCol;
	}








	public void setJtfCol(JTextField jtfCol) {
		this.jtfCol = jtfCol;
	}








	public JTextField getJtfSize() {
		return jtfSize;
	}








	public void setJtfSize(JTextField jtfSize) {
		this.jtfSize = jtfSize;
	}








	public JComboBox<String> getJcbDataType() {
		return jcbDataType;
	}








	public void setJcbDataType(JComboBox<String> jcbDataType) {
		this.jcbDataType = jcbDataType;
	}








	public JCheckBox getCbpk() {
		return cbpk;
	}








	public void setCbpk(JCheckBox cbpk) {
		this.cbpk = cbpk;
	}








	public JTextArea getJtaprint() {
		return jtaprint;
	}








	public void setJtaprint(JTextArea jtaprint) {
		this.jtaprint = jtaprint;
	}








	public JButton getBtTable() {
		return btTable;
	}








	public void setBtTable(JButton btTable) {
		this.btTable = btTable;
	}








	public JButton getBtCol() {
		return btCol;
	}








	public void setBtCol(JButton btCol) {
		this.btCol = btCol;
	}








	public JButton getBtCreate() {
		return btCreate;
	}








	public void setBtCreate(JButton btCreate) {
		this.btCreate = btCreate;
	}








	public static void main(String[] args) {
		new CreateTableService();
	}//main

}//class

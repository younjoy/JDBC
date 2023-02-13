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

//1. Window Component���, �̺�Ʈ �����ʸ� ����
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
		
		//2.�����������Ʈ ����
		JLabel jlTable = new JLabel("���̺��");
		JLabel jlCol = new JLabel("�÷���");
		JLabel jlDataType = new JLabel("��������");
		JLabel jlSize = new JLabel("ũ��");
		JLabel jlpk = new JLabel("Primary key");
		
		 jtfTable = new JTextField();
		 jtfCol = new JTextField();
		 jtfSize = new JTextField();
		
		 jtaprint = new JTextArea();
		
		 jcbDataType = new JComboBox<String>("number,varchar2,char,date".split(","));
		
		 cbpk = new JCheckBox();
		
		 btTable = new JButton("�߰�");
		 btCol = new JButton("�߰�");
		 btCreate = new JButton("����");
		
		//3.������Ʈ�� ������ ������Ʈ�� ��ġ
		//������ġ
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
		
		
		//4.�̺�Ʈ ���
		CreateTableEvt cte = new CreateTableEvt(this);
		
		btTable.addActionListener(cte);
		btCol.addActionListener(cte);
		btCreate.addActionListener(cte);
		
		//5.������ ������Ʈ�� ũ�⼳��
		setBounds(100, 100, 1000, 600);
		
		//6.����ڿ��� ������ ������Ʈ �����ֱ�
		setVisible(true);
		//7.������ ����ó��
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

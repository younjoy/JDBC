package day0209.work;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class CreateTableEvt  implements ActionListener{

	private CreateTableService cts;
	
	private String resultPk;
	
	public CreateTableEvt(CreateTableService cts) {
		this.cts=cts;
	}//CreateTableEvt
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == cts.getBtTable() && cts.getJtfTable() != null) { //���̺� �Է��� �߰���ư ������ ����
			addTable();
		}else if(ae.getSource() == cts.getBtCol()) {//�÷� ���� �Է��� �߰���ư ������ ����
			if(cts.getJtfCol() != null && cts.getJtfSize() != null && 
				cts.getJtaprint() != null) {
				System.out.println("�÷����");
				colInfo();
				setJtf();
				
			}else {
				JOptionPane.showMessageDialog(null, "�÷���, ��������, ũ��� �ʼ��Դϴ�");
			}
		}else if(ae.getSource() == cts.getBtCreate()) {
			colAdd();
			return;
			
		}else {
		JOptionPane.showMessageDialog(null, "���̺��, �������� �Է����ּ���");
		}
	}//actionPerformed
	
	
	public String addTable() {
		String result="";
		String tableName = cts.getJtfTable().getText();
		result = "create table "+tableName+" (\n";
		cts.getJtaprint().setText(result);
		
		System.out.println("addTable()�Ϸ�");
		
		return tableName;
	}//addTable
	
	//�ϼ��� creat �������� ������','��  )�κ������ִ��۾�.
	public void colAdd() {
		StringBuilder result = new StringBuilder();
		result.append(cts.getJtaprint().getText()).append("\n");//�ϼ��� �������� �ٹٲ�
		result.setCharAt(result.lastIndexOf(","), ')');//������ ,�� )�� ����
		
		//jtextarea�� �ٽ� result �Ѹ���
		cts.getJtaprint().setText("");
		cts.getJtaprint().append(result.toString());
		System.out.println(result);
		
	}//colAdd
	
	
	public void colInfo() {
		StringBuilder result = new StringBuilder();
		
		String col=cts.getJtfCol().getText();
		//jcombobox �����
		String dataType=cts.getJcbDataType().getSelectedItem().toString();///
		String sizeSet="";
		System.out.println("colInfo����");
		if(cts.getCbpk().isSelected()) {
			resultPk=" constraint pk_"+ cts.getJtfTable().getText()+" primary key";
		}else {
			resultPk="";
		}
		if(!dataType.equals("date")) {
			sizeSet = "("+cts.getJtfSize().getText()+")";
		}
		result
		.append(col).append(" ").append(dataType).append(sizeSet)
		.append(resultPk).append(",\n");
		
		cts.getJtaprint().append(result.toString());//jta�� ���߰�
		System.out.println(result.toString());
//		return result;
	}//colInfo
	
	
	public void setJtf() {
		cts.getCbpk().setSelected(false);;
		cts.getJtfCol().setText("");
		cts.getJtfSize().setText("");
		
	}//setJtf
	

	
	

}//class

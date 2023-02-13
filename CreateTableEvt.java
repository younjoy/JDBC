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
		if(ae.getSource() == cts.getBtTable() && cts.getJtfTable() != null) { //테이블 입력후 추가버튼 누르면 실행
			addTable();
		}else if(ae.getSource() == cts.getBtCol()) {//컬럼 정보 입력후 추가버튼 누르면 실행
			if(cts.getJtfCol() != null && cts.getJtfSize() != null && 
				cts.getJtaprint() != null) {
				System.out.println("컬럼출력");
				colInfo();
				setJtf();
				
			}else {
				JOptionPane.showMessageDialog(null, "컬럼명, 데이터형, 크기는 필수입니다");
			}
		}else if(ae.getSource() == cts.getBtCreate()) {
			colAdd();
			return;
			
		}else {
		JOptionPane.showMessageDialog(null, "테이블명, 쿼리문을 입력해주세요");
		}
	}//actionPerformed
	
	
	public String addTable() {
		String result="";
		String tableName = cts.getJtfTable().getText();
		result = "create table "+tableName+" (\n";
		cts.getJtaprint().setText(result);
		
		System.out.println("addTable()완료");
		
		return tableName;
	}//addTable
	
	//완성된 creat 쿼리문에 마지막','를  )로변경해주는작업.
	public void colAdd() {
		StringBuilder result = new StringBuilder();
		result.append(cts.getJtaprint().getText()).append("\n");//완성된 쿼리문에 줄바꿈
		result.setCharAt(result.lastIndexOf(","), ')');//마지막 ,를 )로 변경
		
		//jtextarea에 다시 result 뿌리기
		cts.getJtaprint().setText("");
		cts.getJtaprint().append(result.toString());
		System.out.println(result);
		
	}//colAdd
	
	
	public void colInfo() {
		StringBuilder result = new StringBuilder();
		
		String col=cts.getJtfCol().getText();
		//jcombobox 값얻기
		String dataType=cts.getJcbDataType().getSelectedItem().toString();///
		String sizeSet="";
		System.out.println("colInfo시작");
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
		
		cts.getJtaprint().append(result.toString());//jta에 값추가
		System.out.println(result.toString());
//		return result;
	}//colInfo
	
	
	public void setJtf() {
		cts.getCbpk().setSelected(false);;
		cts.getJtfCol().setText("");
		cts.getJtfSize().setText("");
		
	}//setJtf
	

	
	

}//class

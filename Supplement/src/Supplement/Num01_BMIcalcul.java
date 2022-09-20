package Supplement;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class BClass extends Frame implements ActionListener {
		Label laHigh = new Label("����� Ű��");				
		Label laWeight = new Label("����� �����Դ�");
		
		TextField tfHigh = new TextField(); // Ű ���� �� ����
		TextField tfWeight = new TextField(); // ������ ���� �� ����		
		
		Button btnBMI = new Button("BMI���"); // ��� ��ư
		TextField tfResul = new TextField(); // ����� ���� �� ����
		
		// ������ : ����� ���� ���� ã�ƿ��� ��.
		BClass () {
			this.setLayout(null); // �������� ������ �������.
			
			laHigh.setSize(90,30); //(���� , ����) pixel = �׸�ĭ ũ��
			laHigh.setLocation(20,70); // �� ������ġ
			this.add(laHigh); //�� �߰�
			
			laWeight.setSize(90,30);
			laWeight.setLocation(20,100);
			this.add(laWeight);				
			
			tfHigh.setSize(90,30); 
			tfHigh.setLocation(laHigh.getLocation().x+laHigh.getSize().width,70); 
			this.add(tfHigh);
			
			tfWeight.setSize(90,30); 
			tfWeight.setLocation(laWeight.getLocation().x+laWeight.getSize().width,100); 
			this.add(tfWeight);
			
			btnBMI.setSize(70,30);
			btnBMI.setLocation(200,300);
			this.add(btnBMI);			
			btnBMI.addActionListener(this);	//�̺�Ʈ ���
			
			tfResul.setSize(400,50);
			tfResul.setLocation(20,400);
			this.add(tfResul);
			
			this.setSize(500, 500);
			this.setBackground(Color.DARK_GRAY);
			this.setVisible(true);
			
			
			addWindowListener(new WindowAdapter() {	///// WindowListener �갡 ������ �ִ� ���ǰ� 5�� �׷��� WindowAdapter�� ������ 4���� �� Ŀ�� ����.
				public void windowClosing(WindowEvent el) {
					dispose();
					System.exit (0); // �������� // C��� : exit()	// C# : Environment.Exit ()
				}
			} ) ;
		}
		
	@Override
	public void actionPerformed(ActionEvent e) { // actionPerformed �̺�Ʈ ó���Լ�
		// TODO Auto-generated method stub
		// event ó���� �κ��� ���⿡ ������ ��.
		if(e.getSource () == btnBMI) {
			int High = Integer.parseInt (tfHigh.getText()) ;
			int Weight = Integer.parseInt (tfWeight.getText()) ;
			
			double MHigh = High / 100.0 ;
			double BMI =  Weight / Math.pow(MHigh , 2) ;
			
			String result ;
			
			if (BMI >= 30.0)
				result = "��";
			else if ( BMI >= 25.0)
				result = "������";
			else if ( BMI >= 20.0)
				result = "����";
			else
				result = "��ü��";
			
			tfResul.setText("����� BMI������" + BMI + "�̸�" + result + "�̱���!") ;
		}
		
		
	}
	
	
}


public class Num01_BMIcalcul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// GUI : Graphic User Interface
		
		BClass b1 = new BClass();
		
	}

}


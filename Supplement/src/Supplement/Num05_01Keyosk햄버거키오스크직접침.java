package Supplement;

import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class JButtonClass extends JFrame
						implements ActionListener , ListSelectionListener {
			JLabel jl1 = new JLabel("**�¹��� �ܹ��� �Դϴ�**");
			JLabel jl2 = new JLabel("��� �޴��� �����ϼ���");
			// combobox	, listbox
			String[] wichi={"����", "���ο�"};
			JList jlist1=new JList(wichi);
			JButton jb1 = new JButton("�����̳� ���� ����  : 5000");
			JButton jb2 = new JButton("���� ġ�� ������ ����  : 7000");
			JButton jb3 = new JButton("������ ���� ����    : 4500");
			JButton jb4 = new JButton("���� �����̳� ���� ���� :  5500");
			JButton jb5 = new JButton("�ֹ��մϴ�");
			JButton jb6 = new JButton("����մϴ�");
			
			
			
			String joomoon1 = " " ;
			int hap = 0 ;
			int cnt = 0;
			
			public JButtonClass () {// ������ - start
				setLayout(new GridLayout(0 , 2 , 50 , 50)) ;
																	// �� ��
				jl1.setFont(new Font ("����" , Font.BOLD,25));
				jl2.setFont(new Font ("����" , Font.BOLD,25));
				jb1.setFont(new Font ("����" , Font.BOLD,15));
				jb2.setFont(new Font ("����" , Font.BOLD,15));
				jb3.setFont(new Font ("����" , Font.BOLD,15));
				jb4.setFont(new Font ("����" , Font.BOLD,15));
				jb5.setFont(new Font ("����" , Font.BOLD,15));
				jb6.setFont(new Font ("����" , Font.BOLD,15));
				
				jb5.setBackground(Color.orange);
				jb6.setBackground(Color.yellow); 
				
				jb1.addActionListener(this) ;
				jb2.addActionListener(this) ;
				jb3.addActionListener(this) ;
				jb4.addActionListener(this) ;
				jb5.addActionListener(this) ;
				jb6.addActionListener(this) ;
				jlist1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION) ;
				
				jlist1.addListSelectionListener(this) ;
				add(jl1) ;
				add(jl2) ;
				add(jb1) ;
				add(jb2) ;
				add(jb3) ;
				add(jb4) ;
				add(jb5) ;
				add(jb6) ;
				add(jlist1) ;
					
				setTitle("������� �¹��� �Դϴ�.");
				setSize(700, 700) ;
				setVisible(true);
				
			}//������ - end

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// ������ ��ư��
		// ��ư 6�� + listbox = �� 7��
		
		if (e.getSource() == jb1) {  // �����̳� ���� ����  : 5000
			joomoon1 += jb1.getText() + "\n" ;
			hap = hap + 5000;
			cnt++ ;
		}
		if (e.getSource() == jb2) {
			joomoon1 += jb2.getText() + "\n" ;
			hap = hap + 7000;
			cnt++ ;
		}
		if (e.getSource() == jb3) {
			joomoon1 += jb3.getText() + "\n" ;
			hap = hap + 4500;
			cnt++ ;
		}
		if (e.getSource() == jb4) {
			joomoon1 += jb4.getText() + "\n" ;
			hap = hap + 5500;
			cnt++ ;
		}
//--------------------- ������� �ܹ��� �ֹ���ư	 --------------------//
		
//--------------------- ������� �ֹ� Ȯ�� ��ư	 --------------------//
		
		if (e.getSource() == jb5 ) {
		String msg1 = joomoon1 + "�ѱݾ� :" + String.valueOf(hap) + "��" + "\n" 
									+ "�� �ֹ����� :" + String.valueOf(cnt) + "��" ;
		JOptionPane.showConfirmDialog
											(jb5 , msg1 , "Ȯ���ϼ���" , JOptionPane.YES_NO_OPTION) ;
											// Ŭ���� ��ư ��ó�� �޼����ڽ��� ��
		
											joomoon1 = " " ;  // �ʱ�ȭ
											hap = 0 ;
											cnt = 0 ;
		}
//--------------------- ������� �ֹ� �ʱ�ȭ ��ư	 --------------------//
		
		if (e.getSource() == jb6) {// ��ҹ�ư
				joomoon1 = " " ; // �ٷ� �ʱ�ȭ
				hap = 0 ;
				cnt = 0 ;
			JOptionPane.showMessageDialog(jb6 , "��ҵǾ����ϴ�.") ;
																				// ��ҹ�ư ��ó
		}
	

	}
	
//------------------------------------------------------------------------------
	
	@Override
		public void valueChanged(ListSelectionEvent e) {
		
		if (e.getSource() == jlist1) {
			int index1 = jlist1.getSelectedIndex()	;	
			String indexElement1
			= (String) jlist1.getModel().getElementAt(index1);
			JOptionPane.showMessageDialog(null , indexElement1 + "�����ϼ̱���") ;
																	// ��½� ȭ�� ����� ���
			
			hap = hap - 1000 ;
			}
		
		
	}
	
}

public class Num05_01Keyosk�ܹ���Ű����ũ����ħ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		new JButtonClass();
	}

}

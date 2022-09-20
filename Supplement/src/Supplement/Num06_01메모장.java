package Supplement;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.util.*;

class FileGUI2 extends Frame implements ActionListener {
	
	private Button b2 = new Button ("����READ") ;
	private Button b3 = new Button ("����SAVE") ;
	private TextArea ta1 = new TextArea( ) ;
	
	public FileGUI2(){	// ������ ����
        
        this.setLayout(null);
        
    b2.setSize(100,70);//��ư ũ��
    b2.setForeground(new Color(0,0,0));
    b2.setBackground(new Color(0,255,255));
    b2.setFont(new Font("����",Font.BOLD,20));
    b2.setLocation(350,200); //��ư ������ġ 
        this.add(b2);//��ư �߰� 
    b2.addActionListener(this); ////////////////// 

    b3.setSize(100,70);//��ư ũ��
    b3.setForeground(new Color(0,0,0));
    b3.setBackground(new Color(0,255,255));
    b3.setFont(new Font("����",Font.BOLD,20));
    b3.setLocation(350,300); //��ư ������ġ 
        this.add(b3);//��ư �߰� 
    b3.addActionListener(this); ////////////////// 

    ta1.setSize(300,340);// ũ��
    ta1.setForeground(new Color(0,0,255));
    ta1.setBackground(new Color(255,255,153));
    ta1.setFont(new Font("����",Font.BOLD,20));
    ta1.setLocation(20,40); // ������ġ 
        this.add(ta1);// �߰� 
    
        this.setBackground(new Color(051,153,255)); 
        this.setTitle("�ڹٴ� FUN FUN FUN !!!!!!");
        this.setSize(460, 400); //������ ũ�� 
        this.setVisible(true);
        
      
        addWindowListener(new WindowAdapter(){ //////////////////
                 public void windowClosing(WindowEvent e1){
                         dispose();
                         System.exit(0);
                         
                 }
        });
	
	}

@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource() == b2) {	// �б��ư ����? 
		String fileData = null ;
		FileDialog fd1 = new FileDialog(this , "����READ" , FileDialog.LOAD) ;
					
						// aa.txt
		
		  fd1.setVisible(true) ;
		String dirfile1 = fd1.getDirectory( ) + fd1.getFile( ) ;
			try { /*******************************************/
				FileReader fr = new FileReader(dirfile1) ; // aa.txt
				BufferedReader br = new BufferedReader(fr) ;
				String s;
				while ( ( s = br. readLine ( ) ) != null ) {
					fileData += s + "\n" ;
				}
				ta1.setText(fileData) ; //���
				br.close ( ) ; fr.close ( ) ;
				/************************************************/
			} catch(Exception e1) {
				
				System.out.println("error") ;
				
			}
	}else if (e.getSource() == b3) {
		FileDialog fd2 = new FileDialog (this , "����SAVE" , FileDialog.SAVE) ;
		
			fd2.setVisible(true) ;
			
		String dirfile2 = fd2.getDirectory( ) + fd2.getFile ( ) ;
			String fileData2 = ta1.getText( ) ;
			
			try {
					/*********************************************/
			FileWriter fw = new FileWriter(dirfile2) ;
			PrintWriter pw = new PrintWriter (fw) ;
			pw.println ( fileData2 ) ;
			pw.close ( ) ;
			fw.close ( ) ;
			/*********************************************/
			} catch (Exception e1) {
				System.out.println("error") ;
				}
			}
	
	
	}
}

	
	
public class Num06_01�޸��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileGUI2 bb = new FileGUI2 () ; // �̰Ŵ� �Ȱ��� �������.
		
		
	} // main - end

} // class Num06_01 �޸��� - End

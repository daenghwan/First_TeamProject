package Supplement;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Timer;
import java.util.TimerTask;

class EDisplay extends Frame implements ActionListener{/////////////
    
    static int sw=0;////
 /////////////
    static String s1="              I LOVE YOU";///////////////
    Timer t1=new Timer();////////////////
 //////////////////
// GUI
    private Button b1=new Button("��~��~");
    private Button b2=new Button("��~��~");
    private TextField tf1 =new TextField();

    public EDisplay(){
        
        this.setLayout(null);
        
    b1.setSize(200,70);//��ư ũ��
    b1.setForeground(new Color(0,0,255));
    b1.setBackground(new Color(255,180,100));
    b1.setFont(new Font("����",Font.BOLD,20));
    b1.setLocation(150,200); //��ư ������ġ 
        this.add(b1);//��ư �߰� 
    b1.addActionListener(this); ////////////////// 
    
    b2.setSize(200,70);//��ư ũ��
    b2.setForeground(new Color(0,0,255));
    b2.setBackground(new Color(255,180,100));
    b2.setFont(new Font("����",Font.BOLD,20));
    b2.setLocation(150,300); //��ư ������ġ 
        this.add(b2);//��ư �߰� 
    b2.addActionListener(this); ///��ư �̺�Ʈ�� ���Ͽ�/ 

        tf1.setSize(400,50);
        tf1.setForeground(new Color(0,0,255));
        tf1.setBackground(new Color(255,255,0));
    tf1.setFont(new Font("����",Font.BOLD,35));
        tf1.setLocation(30, 70);//�ؽ�Ʈ ������ġ 
        this.add(tf1); 
    
        this.setBackground(new Color(0,200,0)); 
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

public void actionPerformed(ActionEvent e1){
        if(e1.getSource() == b1 && sw == 0) {
        	//b1.setVisible(false) ; 
        	b1.setEnabled(false) ;	//�������� ����������
        	
            t1.schedule (new TimerTask()  {
        		// t1.scheduleAtFixedRate (new TimeTask() { }
        		public void run() {	//thread
        			try {
        				s1 = s1.substring(1,  s1.length()) + s1.substring(0 ,  1) ;
        				
        				tf1.setText(s1);
        				//////////////////////////////////////////////////
        			}	
        			catch (Exception e ) {
        				e.printStackTrace();
        			}
        		} // run - end
        	} , 0 , 250 ) ;//schdule-end // 1�� = 1000ms
        } // if-end
      sw=1 ; // ���۹�ư�� �ѹ��� �۵��ǰ�
      
      if(e1.getSource() == b2) {	//�� ��ư�� ���������� (�̺�Ʈ)
    	  t1.cancel();
      }
	}
}

public class Num03_ILoveyou���������� {
    
    public static void main(String[] args) {
            
  EDisplay ed1=new EDisplay();
    }

}
package Supplement;

import java.util.Arrays;
import java.util.Scanner;

public class Num02_HangmanGame��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			// ��� ���� ���� ó�� ȭ���� ������ ����
			// _ _ _ _ _
			
			// String str1 = "apple";
			// String jool = "_____";
			
			// char [] ch1 = {'a', 'p', 'p', 'l', 'e'}; // ���ڻ���迭
			// char [] jool = {'_', '_', '_', '_', '_'};
			
			String [] moonja = {"a", "p", "p", "l", "e"}; // ���ڿ��迭
			String [] jool = {"_", "_", "_", "_", "_"};
			
			
			
			// �ʱ�ġ �۾��ε� ��� ���α׷� �ۼ��ÿ��� ���� ���� ����
			String ip;
			// int cnt = 0;
			int sw = 0;
			// count�� flag���
			
					
			
			
			// ó���� jool(����) ���-//nested ���
			for(int i = 0; i<jool.length; i++) {
				System.out.print(jool[i]);
			}
			System.out.println();
			
			
			
			
			Scanner scan1 = new Scanner(System.in);
			
			for(int i = 1; i<=13; i++) { // 13-for-start
				// cnt = 0;
				System.out.println("��������Է�:");
				ip = scan1.next(); // nextLine() // i love you
				for(int j = 0; j<5; j++) { // ���߾����� ��������� ��� �ش� ���ڸ� �Ʒ���
					if(ip.equals(moonja[j])) // �����
						jool[j] = moonja[j]; // �����ڸ� ����� ��������
				}
				/* a  p  p  l  e  ==> moonja�迭
				
				   a  p  p  _  _  ==> jool�迭    */
				
				
				
				/*	  apple
					  _pp__    */
				
				for(int j = 0; j<5; j++) {
					System.out.print(jool[j]); // �������ڸ��� p�� �Է��ϰ� ���߾����� _pp__
				}
				
				System.out.println("\t"+i+"���õ�"); // 1���õ�
				
				
				// �迭 ��ä�� ��
					// if(aa>3) {
				if(Arrays.equals(moonja, jool)) { // true?
					System.out.println("�����߾��.");
					sw = 1; // 13������ ��� ���� �� �� �������
					break; // �ݺ����� ���� ������ ������ 13-for-end �������� exit				
				}
				
			} ///////////////////// 13-for-end
			
			
			// 13�� �õ� �� ������ ��, for�� �������� ����
			if(sw == 0) {
				System.out.print("������ȸ��");
			}
			
			
		} // main-end

	} // class-end

package Supplement;

public class Num03_ILoveYou������2 {

	public static void main (String  [ ] args) {
	
		
/*
		LOVE �ܾ 123��° ������ OVE�� ���� ����ϰ�
		�ٷ� �̾ L�� ����ϴ� ������ ���α׷��� �ۼ��Ͻÿ�.
		�� , �̷������� ����� 200�� �ݺ� ����ϰ� �������δ�
		substring () �� ����Ͻÿ�.
		�����δ� I Love You�� ����Ͻÿ�.
*/
		String s1 = "          I LOVE YOU" ;
		//string s1 = "LOVE"
		kajaDisplay(s1) ; //�޼ҵ� 2����
		
		
	}

	private static void kajaDisplay(String s1) {
		
		for(int i = 0 ; i < 500 ; i++) {
		//s1 = s1.substring(1, 20) + s1.substring(0 , 1);
			s1 = s1.substring(1, s1.length()) + s1.substring(0 , 1);
			System.out.println(s1);
			// LOVE ==> OVE �ڿ� L�� ���̰� ==> VEL �ڿ� O�� ���̰� ....20�� �ݺ�
		}
		
		
	}
}

package SQL;

public class SQLprocedure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println("����������?");
		
		// jdk : run 15 & edit 11
		
		// duehae.exe   30   80 (String[] args) �갡 �˾Ƽ� ����
		
		// ��� �޴��� RUN - Run Configurations... Ŭ�� ->
		// Project & Main Class �̸� ��ġ�ϴ��� Ȯ�� -> Name �ؿ� (x) = Argument Ŭ��
		// -> Program arguments �� 30 80 �Է� -> Apply -> Run
		
		// ������ ���� �ٶ��� Run Configurations... ���� ������. �׷��� �̷��� �����ֱ�
		if(args.length != 2 ) { 
			System.out.println("���� 2�� �Է� ���������!!!!");
			System.out.println("������ ���� 2�� �Է��ؾ���.");
			System.exit(1);
			//return ;
		}
		
			
		
		System.out.println(Integer.parseInt(args[0])
		+ Integer.parseInt(args[1]));
		
	}

}

// �޸��� : ������ -> �޸���������� Ŭ�� - �������ΰ� notepad.exe - �޸��� ��.
// java --> exe --> �����Ǽ� �޸𸮿� ��.
// copy aa bb aa�� �纻�� bb �� ����.
// copy.exe aa bb  ��ǻ� �̰� �ƴ�����, �̰Ŷ� ����ϴٰ� ��.
// �׷��� ��Ŭ�������� ������ �⺻������ �ȵ�.
// ����� ����  (commandline argument)
// 30 + 80 ���α׷��� �ۼ�
// duehae.exe   30   80       
// [��������] 30 80 �ϸ� 110�� ������ ���α׷��� ����� ����. �⺻������X
// ������
// ---------
//wc 30+80 �ϸ� 110 ����.
// �ڹ�
// ----------
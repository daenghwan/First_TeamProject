package Supplement;

import java.util.*;
import java.util.Arrays;

public class Num04_Lotto�ζǹ�ȣ�̱�2 {

	public static void main(String[] args) {
		
		int [ ] arr = new int [6] ;
		
		for(int i = 0 ; i < 6 ; i++) {	// �ߺ�����
			arr[i] = (int) (Math.ceil(Math.random() * 45));
				for(int j = 0 ; j < i ; j++) {
					if(arr[i] == arr[j])
						i-- ;
				}	//j - end
					
		}	// i - end

		Arrays .sort (arr) ;
		
		for(int i = 0 ; i < 6 ; i++) {	//��Ʈ
			for(int j = 1 ; j < 6 ; j++) {
				if(arr [i] > arr [j]) {
					int temp = arr [i] ;
					arr [i] = arr [j] ;
					arr [j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
//     System.out.print((int)Math.ceil(45*Math.random())+"\t");
		
	}

}

package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T_11720 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		String str = br.readLine();
		
		int result = 0;
		
		for(int i=0;i<num;i++) {
			result += (int) str.charAt(i) - '0';
		}
		
		System.out.println(result);
	}
}

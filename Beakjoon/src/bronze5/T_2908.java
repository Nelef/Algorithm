package bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T_2908 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		String num1 = st.nextToken();
		String num2 = st.nextToken();

		String new_num1 = "";
		String new_num2 = "";

		for (int i = 0; i < num1.length(); i++) {
			new_num1 += num1.charAt(num1.length()-i-1);
			new_num2 += num2.charAt(num2.length()-i-1);
		}
		if (Integer.parseInt(new_num1) > Integer.parseInt(new_num2)) {
			System.out.println(new_num1);
		} else {
			System.out.println(new_num2);
		}
	}
}

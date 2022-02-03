package bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T_10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String t = br.readLine();

		for (int i = 97; i <= 122; i++) {
			int result = -1;
			for (int j = 0; j < t.length(); j++) {
				if (t.charAt(j) == i) {
					result = j;
					break;
				}
			}
			System.out.print(result);
			if(i == 122) {
				break;
			}
			System.out.print(" ");
		}
	}
}

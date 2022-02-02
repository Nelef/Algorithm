package bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T_8958 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int problem_num = Integer.parseInt(br.readLine());

		for (int i = 0; i < problem_num; i++) {
			String problem = br.readLine();

			int result = 0;
			int count = 0;
			for (int j = 0; j < problem.length(); j++) {
				if(Character.toString(problem.charAt(j)).equals("O")) {
					count++;
				} else {
					count = 0;
				}
				result += count;
			}
			System.out.println(result);
		}
	}
}

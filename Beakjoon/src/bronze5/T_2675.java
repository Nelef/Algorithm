package bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T_2675 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int test_size = Integer.parseInt(br.readLine());
		for (int i = 0; i < test_size; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int num = Integer.parseInt(st.nextToken());
			String dic = st.nextToken();

			for (int j = 0; j < dic.length(); j++) {
				for (int k = 0; k < num; k++) {
					System.out.print(dic.charAt(j));
				}
			}
			System.out.println();
		}
	}
}

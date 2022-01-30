package bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T_2920 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		String first = st.nextToken();
		if (first.equals("1")) {
			boolean isCo = true;
			for (int i = 2; i <= 8; i++) {
				if (Integer.parseInt(st.nextToken()) == i) {
				} else {
					isCo = false;
					break;
				}
			}
			if (isCo) {
				System.out.println("ascending");
			} else {
				System.out.println("mixed");
			}
		} else if (first.equals("8")) {
			boolean isCo = true;
			for (int i = 7; i >= 1; i--) {
				if (Integer.parseInt(st.nextToken()) == i) {
				} else {
					isCo = false;
					break;
				}
			}
			if (isCo) {
				System.out.println("descending");
			} else {
				System.out.println("mixed");
			}
		} else {
			System.out.println("mixed");
		}
	}
}

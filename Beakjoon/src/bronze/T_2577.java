package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class T_2577 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int product_result = 1;
		for (int i = 0; i < 3; i++) {
			product_result *= Integer.parseInt(br.readLine());
		}

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			list.add(0); // 0부터 10까지 0 집어 넣기
		}

		String string_result = String.valueOf(product_result);
		for (int i = 0; i < string_result.length(); i++) {
			int temp_char = Character.getNumericValue(string_result.charAt(i));
			list.set(temp_char, list.get(temp_char) + 1);
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(list.get(i));
		}
	}
}

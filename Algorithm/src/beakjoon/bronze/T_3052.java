package beakjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class T_3052 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<Integer> list = new ArrayList<Integer>();

		int result = 0;

		for (int i = 0; i < 10; i++) {
			int temp = Integer.parseInt(br.readLine()) % 42;

			boolean isExist = false;
			for (int j = 0; j < list.size(); j++) {
				if (list.get(j) == temp) {
					isExist = true;
					break;
				}
			}
			if (isExist == false) {
				list.add(temp);
				result++;
			}
		}
		System.out.println(result);
	}
}
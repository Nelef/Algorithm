package beakjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class T_1546 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(bf.readLine());

		StringTokenizer st = new StringTokenizer(bf.readLine());

		ArrayList<Double> list = new ArrayList<Double>();

		double max = 0;
		for (int i = 0; i < num; i++) {
			double temp = Double.parseDouble(st.nextToken());
			if (temp > max) {
				max = temp;
			}
			list.add(temp);
		}

		double result = 0;
		for (int i = 0; i < num; i++) {
			result += list.get(i) / max * 100;
		}

		System.out.println((double)result/num);
	}
}

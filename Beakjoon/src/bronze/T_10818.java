package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T_10818 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int cn = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());

		int temp = Integer.parseInt(st.nextToken());
		int max = temp;
		int min = temp;
		
		for (int i = 1; i < cn; i++) {
			temp = Integer.parseInt(st.nextToken());
			if(temp>max) {
				max = temp;
			}
			if(temp<min) {
				min = temp;
			}
		}
		System.out.println(min+" "+max);
	}
}

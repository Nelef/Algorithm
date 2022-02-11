package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T_1000 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
				
		int i = Integer.parseInt(st.nextToken());
		int j = Integer.parseInt(st.nextToken());
		
		System.out.println(i+j);
	}
}
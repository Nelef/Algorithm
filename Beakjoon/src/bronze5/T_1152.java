package bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T_1152 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String str = bf.readLine();
		String[] array = str.split(" ");

		if (array.length == 0) {
			System.out.println("0");
			return;
		}

		if (array[0].equals(""))
			System.out.println(array.length - 1);
		else
			System.out.println(array.length);
	}
}

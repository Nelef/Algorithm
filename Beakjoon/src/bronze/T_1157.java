package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Alphabet {
	int a;
	int num;

	public Alphabet(int a, int num) {
		super();
		this.a = a;
		this.num = num;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}

public class T_1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Alphabet> list = new ArrayList<Alphabet>();
		String str = bf.readLine();

		for (int i = 0; i < str.length(); i++) {
			int temp_char = (int) str.charAt(i);

			// 소문자라면 대문자로 변경.
			if (97 <= temp_char && temp_char <= 122) {
				temp_char -= 32;
			}

			boolean test = false;

			// 리스트에 똑같은 거 있으면 +1
			for (int j = 0; j < list.size(); j++) {
				if (list.get(j).getA() == temp_char) {
					list.get(j).setNum(list.get(j).getNum() + 1);
					test = true;
					break;
				}
			}

			// 리스트에 똑같은 거 없으면 새로 만듬.
			if (test == false) {
				Alphabet alpha = new Alphabet(temp_char, 1);
				list.add(alpha);
			}
		}
		int big = 0;
		char answer = (char) 0;
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNum() > big) {
				big = list.get(i).getNum();
				answer = (char)list.get(i).getA();
			} else if (list.get(i).getNum() == big) {
				answer = '?';
			}
		}
		System.out.println(answer);
	}
}
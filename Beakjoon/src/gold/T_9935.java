package gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class T_9935 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		String bomb = br.readLine();

		Stack<Character> stack1 = new Stack<Character>();
		Stack<Character> stack2 = new Stack<Character>();

		for (int i = 0; i < str.length(); i++) {
			stack1.push(str.charAt(i));
		}
		int idx = 0;
		while (!stack1.isEmpty()) {
			stack2.push(stack1.pop());
			if (stack2.peek() == bomb.charAt(bomb.length() - (idx + 1))) { // 폭발문자열과 문자가같으면
				idx++;
			} else {
				idx = 0;
				if (stack2.peek() == bomb.charAt(bomb.length() - (idx + 1))) { // 하나라도 다르면 초기화
					idx++;
				}
			}
			if (idx == bomb.length()) { // 폭발문자열이 나오면
				for (int i = 0; i < bomb.length(); i++) {
					stack2.pop(); // 길이만큼 빼주고
				}
				for (int i = 0; i < bomb.length(); i++) {
					if (!stack2.isEmpty()) {
						stack1.push(stack2.pop()); // 재검사를 위해 폭발문자열길이만큼 stack1에 다시푸쉬
					} else {
						break;
					}
				}
				idx = 0;
			}
		}
		if (stack2.isEmpty()) {
			System.out.println("FRULA");
		} else {
			StringBuilder sb = new StringBuilder();
			while (!stack2.isEmpty()) {
				sb.append(stack2.pop());
			}
			System.out.println(sb.toString());
		}
	}
}

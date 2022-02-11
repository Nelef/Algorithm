package gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class T_16940_F {
	static int N;
	static int[][] arr;
	static int[] arr_visited;
	static ArrayList<Integer> queue = new ArrayList<Integer>();
	static ArrayList<Integer> result = new ArrayList<Integer>();

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		arr_visited = new int[N];

		for (int i = 0; i < N - 1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			arr[a - 1][b - 1] = 1;
			arr[b - 1][a - 1] = 1;
		}

		bfs(0);

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			if (result.get(i) + 1 != Integer.parseInt(st.nextToken())) {
				System.out.println(0);
				return;
			}
		}
		System.out.println(1);
	}

	public static void bfs(int x) {
		queue.add(x);
		result.add(x);
		arr_visited[x] = 1;

		while (queue.size() != 0) {
			int cur_x = queue.get(0);
			queue.remove(0);

			for (int y = 0; y < N; y++) {
				if (arr[cur_x][y] == 1 && arr_visited[y] == 0) {
					queue.add(y);
					result.add(y);
					arr_visited[y] = 1;
				}
			}
		}
	}
}
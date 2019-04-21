package hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RepeatedString {

	// Complete the repeatedString function below.
	static long repeatedString(String s, long n) {
		int numberOfRepeat = (int) n / s.length();
		int acount = 0;
		for (int i = 1, j = 1; j <= n; i++, j++) {
			if (s.charAt(i - 1) == 'a') {
				acount++;
			}
			if (i == s.length()) {
				i = 0;
			}
		}
		return acount;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scanner.nextLine();

		long n = scanner.nextLong();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		long result = repeatedString(s, n);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}

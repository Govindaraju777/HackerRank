package hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion {

	/*
	 * Complete the timeConversion function below.
	 */
	static String timeConversion(String s) {
		DateFormat inputFormat = new SimpleDateFormat("hh:mm:ss aa");
        DateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
        try{
            Date inputDate = inputFormat.parse(s);
            s = outputFormat.format(inputDate);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return s;
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException, ParseException {
		//BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		//String s = scan.nextLine();

		String result = timeConversion(null);

		//bw.write(result);
		//bw.newLine();

		//bw.close();
	}
}

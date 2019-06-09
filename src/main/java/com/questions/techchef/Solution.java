package com.questions.techchef;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/*
 Solution 
 
  
 */
class Result {

    /*
     * Complete the 'compareFriends' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY frndsList as parameter.
     */

    public static List<String> compareFriends(List<String> frndsList) {
    	SortedSet<String> uniquefriends = new TreeSet<>();
    	frndsList.forEach(friendship -> {
    		String[] f1 = friendship.split(",");
    		Arrays.sort(f1);
    		uniquefriends.add(f1[0].trim()+","+f1[1].trim());
    	} );
    	List<String> list =new ArrayList(uniquefriends);
    	Collections.sort(list);
		return list;
    }
}

public class Solution {
	
	public static void main(String[] args) {
		Result r = new Result();
		List<String> frndsList = new  ArrayList<>();
		frndsList.add("U2,U1");
		frndsList.add("U3,U4");
		frndsList.add("U2,U1");
		frndsList.add("U1,U5");
		r.compareFriends(frndsList);

	}
	
	/*
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int frndsListCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> frndsList = IntStream.range(0, frndsListCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<String> result = Result.compareFriends(frndsList);

        bufferedWriter.write(
            result.stream()
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
*/
	}

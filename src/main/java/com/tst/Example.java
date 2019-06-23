package com.tst;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Example {
	public static void main(String[] args) {
		// Passing Hyphen(-) as delimiter
		StringJoiner mystring = new StringJoiner("-");

		// Joining multiple strings by using add() method
		mystring.add("Logan");
		mystring.add("Magneto");
		mystring.add("Rogue");
		mystring.add("Storm");

		// Displaying the output String
		System.out.println(mystring);
		
		
		//Join String by a delimiter and starting with a supplied prefix and ending with a supplied suffix.
		StringJoiner sj = new StringJoiner("/", "prefix-", "-suffix");
        sj.add("2016");
        sj.add("02");
        sj.add("26");
        String result = sj.toString(); //prefix-2016/02/26-suffix
        System.out.println("result = " +result);

      //2015-10-31
    	String result2 = String.join("-", "2015", "10", "31" );
    	System.out.println("result2 = " +result2);
    	
    	
    	//Two Stream and Collectors.joining examples.
    	List<String> list = Arrays.asList("java", "python", "nodejs", "ruby");

    	//java | python | nodejs | ruby
    	String result3 = list.stream().map(x -> x).collect(Collectors.joining(" | "));
    	System.out.println("result3 = " +result3);

	}
	
}
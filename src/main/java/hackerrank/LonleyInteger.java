package hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class LonleyInteger {
	public static void main(String[] args) {
			int[] numbers = {0,0,1,2,1};
//			int unique = traditionalWay(numbers);
//			System.out.println("unique="+unique);
			
			int unique = hashMapApproach(numbers);
			System.out.println("unique="+unique);
	}
	
	
	static int hashMapApproach(int[] numbers) {
	    HashMap<Integer,Integer> map = new HashMap<>(numbers.length);
	    for(int num:numbers) {
	    	boolean contains = map.containsKey(num) ;
	    	map.put(num, (contains ? map.get(num) +1: 1) );
	    }
	    System.out.println(map);
	    for(Entry<Integer, Integer> m :map.entrySet()) {
	    	if(m.getValue()==1) {
	    		return m.getKey();
	    	}
	    }
		return -1;
	}
	static private int traditionalWay(int[] numbers) {
		Arrays.sort(numbers);
		int i=0;
		while(i<numbers.length-1) {
			if(numbers[i] != numbers[i+1] ) {
				return numbers[i];
			}
			i=i+2;
		}
		return -1;
	}
}

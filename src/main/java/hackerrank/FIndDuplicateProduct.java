package hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FIndDuplicateProduct {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("ball","box","ball","ball","box");
		List<Integer> prices = Arrays.asList(2,2,2,2,2);
		List<Integer> weights = Arrays.asList(1,2,1,1,3);
		
		System.out.println(findTotalDuplicates(names, prices, weights));
	}

	static int findTotalDuplicates(List<String> names,List<Integer> prices,List<Integer> weights) {
		int numberOfDuplicates=0;
		Map<String,Integer> duplicateNamesCount = new HashMap<>();
		for(int i=0;i<prices.size()-1;i++) {
			if(duplicateNamesCount.containsKey(names.get(i)))
				continue;
			for(int j=i+1;j<prices.size();j++) {
				if( names.get(i).equals(names.get(j))  && prices.get(i).equals(prices.get(j)) && weights.get(i).equals(weights.get(j))    ) {
					duplicateNamesCount.put(names.get(i),0);
					numberOfDuplicates++;
				}
			}
		}
		return numberOfDuplicates;
	}
	
}

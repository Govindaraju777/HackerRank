package wipro;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GetUniqueArrayElements {
	public static void main(String[] args) {
		int[] nums = { 1, 1 , 4, 5, 6, 7,7};
		
		//Solution-1 using traditional for loop complexity O(n^2)
		int[] dists = findAndReturnUniqueIntArray(nums);
		System.out.println(dists);
		for (int i = 0; i < dists.length; i++) {
			System.out.print(" " + dists[i]);
		}
		
		
		
		//find using java-8 stream
		findDuplicatesUsingArray(nums);
		
	}

	public static int[] findAndReturnUniqueIntArray(int[] arr) {
		int[] distinctElements = {};
		int newArrLength = distinctElements.length;
		for (int i = 0; i < arr.length; i++) {
			boolean exists = false;
			if (distinctElements.length == 0) {
				distinctElements = new int[1];
				distinctElements[newArrLength] = arr[i];
				newArrLength++;
			}

			else {
				for (int j = 0; j < distinctElements.length; j++) {
					if (arr[i] == distinctElements[j]) {
						exists = true;
						break;
					}
				}
				if (exists == false) {
					distinctElements = Arrays.copyOf(distinctElements, distinctElements.length+1);
					distinctElements[distinctElements.length-1] = arr[i];
					newArrLength++;
					exists = false;
				}
			}
		}
		return distinctElements;
	}
	
	
	
	public static int[]  findDuplicatesUsingArray(int[] nums) {
		List<Integer> test = new ArrayList<>(nums.length);
		
		List<Integer> numList = Arrays.stream(nums).boxed().collect(Collectors.toList());
		//or IntStream.of
		//List<Integer> numList2 = IntStream.of(nums).boxed().collect(Collectors.toList());

		Set<Integer> intNumsSet = new HashSet<>(nums.length);
		intNumsSet.addAll(numList);
		

		int[] retUniqueyArray = new int[intNumsSet.size()];
		intNumsSet.forEach(num->System.out.println(num));
		
		
		return retUniqueyArray;
	}
}

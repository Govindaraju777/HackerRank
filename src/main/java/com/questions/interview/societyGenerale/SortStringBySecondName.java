package com.questions.interview.societyGenerale;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class SortStringBySecondName {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Govindaraju Venugopal");
		names.add("Goutham Ramakrishnan");
		names.add("Rajendran ChinnaSwamy");
		names.add("Naveen Kumar");
		names.add("Rajashekar BV");
		
		
		
		//old style
		/*Comparator<String> nameComparator = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.split(" ")[1].compareTo(o2.split(" ")[1]);
			}
		};
		Collections.sort(names,nameComparator);
		*/
		
		//java 8 lambda
		Collections.sort(names, (o1,o2)->o1.split(" ")[1].compareTo(o2.split(" ")[1]));
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}
}

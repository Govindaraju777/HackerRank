package com.questions.interview.capco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

final class Test {
	private String id;
	private List<String> names;
	private Hashtable<String, char[]> userPassword;

	Test(String id, List<String> names,Hashtable<String, char[]> userPassword) {
		this.id = id;
		this.names = names;
		this.userPassword=userPassword;
	}
	
	public String getId() {
		return id;
	}
	public List<String> getNames() {
		return Collections.unmodifiableList(names);  // 
	}
	public Map<String, char[]> getuserPassword() {
		//return userPassword;
		return Collections.unmodifiableMap(userPassword);
	}
	
}

public class ImmutableClassWithCollectionMember {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		Hashtable<String, char[]> usrPasswords = new Hashtable<>();
		usrPasswords.put("Govind", "passwords".toCharArray());
		
		names.add("A");
		names.add("B");
		Test t1 = new Test("1", names,usrPasswords);
		
		List<String> namesReturn = t1.getNames();
		//namesReturn.add("C");  // Collections$UnmodifiableCollection.add
		for(String name:t1.getNames()) {
			System.out.println(name);
		}
		
		Map<String, char[]> usrPasswords1 = t1.getuserPassword();
		usrPasswords1.put("Raj", "passwords".toCharArray());  //ollections$UnmodifiableMap.put(Collections.java:1457)
	}

}

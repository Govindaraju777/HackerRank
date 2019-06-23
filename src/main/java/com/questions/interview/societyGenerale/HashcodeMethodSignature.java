package com.questions.interview.societyGenerale;

public class HashcodeMethodSignature {

	private String name;
	private int id;
	
	
	//https://www.baeldung.com/java-hashcode
	//And Eclipse/STS produces this one
	/*
	 * 
	 In addition to the above IDE-based hashCode() implementations, it’s also possible to automatically generate an efficient implementation, for example using Lombok. In this case, the lombok-maven dependency must be added to pom.xml:
	 
	<dependency>
	    <groupId>org.projectlombok</groupId>
	    <artifactId>lombok-maven</artifactId>
	    <version>1.16.18.0</version>
	    <type>pom</type>
	</dependency> 
	
	It’s now enough to annotate the User class with @EqualsAndHashCode:
	 
	@EqualsAndHashCode
	public class User {
	    // fields and methods here
	}
	
	Similarly, if we want Apache Commons Lang’s HashCodeBuilder class to generate a hashCode() implementation for us, the commons-lang Maven dependency must be included in the pom file:
	<dependency>
    <groupId>commons-lang</groupId>
    <artifactId>commons-lang</artifactId>
    <version>2.6</version>
	</dependency>
	
	And hashCode() can be implemented like this:

	public class User {
    public int hashCode() {
        return new HashCodeBuilder(17, 37).
        append(id).
        append(name).
        append(email).
        toHashCode();
    }
    
    7. Handling Hash Collisions
	The intrinsic behavior of hash tables raises up a relevant aspect of these data structures: even with an efficient hashing algorithm, two or more objects might have the same hash code, even if they’re unequal. So, their hash codes would point to the same bucket, even though they would have different hash table keys.
	
	This situation is commonly known as a hash collision, and various methodologies exist for handling it, with each one having their pros and cons. Java’s HashMap uses the separate chaining method for handling collisions:
	    
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashcodeMethodSignature other = (HashcodeMethodSignature) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}

package Collections;

import java.util.Objects;

public class HashcodeParameters{
	int aadhar;
	String name;
	public HashcodeParameters(int aadhar, String name) {
		this.aadhar = aadhar;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(aadhar, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashcodeParameters other = (HashcodeParameters) obj;
		return aadhar == other.aadhar && Objects.equals(name, other.name);
	}
	
	/*public int hashCode() {
		return aadhar;
	}
	
	public boolean equals(Object obj) {
		
		System.out.println("This is the equals method of HashcodeParameters");
		
		if(this == obj) {
			return true;
		}else if (obj == null) {
			return false;
		}else if(this.getClass() != obj.getClass()) {
			return false;
		}
		
		HashcodeParameters hp = (HashcodeParameters) obj;
		
		if(this.aadhar == hp.aadhar) {
			System.out.println("Adhar are same");
			if(this.name == hp.name) {
				System.out.println("name are same");
				return true;
			}
		}
		
		
		return false;
	}*/
	
	

}

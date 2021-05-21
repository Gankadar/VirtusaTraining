import java.util.*;

class Set{
	Static Set<Integer> s = new HashSet();
	
	public static Set countryname(){
		Set<String> s1 = new HashSet();
		s1.add("India");
		s1.add("Japan");
		s1.add("china");
		s1.add(Sri lanka");
	return s1;
	}

	public static Set number(){
		for(int i = 1; i <= 10; i++)
			s.add(i);
		return s;
	}

	public static Set newNumber(){
		for(int i = 11; i <= 15; i++)
			s.add(i);
		return s;
	}

	public static void main(String args[]){
		System.out.println(countryname());
		System.out.println(number());
		System.out.println(newNumber());
      }
}

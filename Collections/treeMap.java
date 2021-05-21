import java.util.*;

public class treeMap{
	public static void main(String args[]){
		Map<Integer, String> map = new TreeMap<>();
		map.add(1, "hi");
		map.add(2, "hello");
		map.add(3, "virtusa");
	for(Integer i: map.KeySet())
		System.out.println(i + " " + map.get(i));
	}
}

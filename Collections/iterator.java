import java.util.*;
class Iterators{
public static void main(String args[]){
  List <Integer> lst = Arrays.asList(1, 2, 3, 4, 5);

  Iterator<Integer> i = lst.iterator();
  while(i.hasNext())
    System.out.println(i.next());
}
}

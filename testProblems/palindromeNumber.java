import java.util.*;
public class Main{
static List<Integer> l1=new ArrayList<Integer>();
	public static boolean isPalindrome(int num){
	int rem,sum=0;
	int temp = num;
  while(temp>0){
    rem=temp%10;
    sum=(sum*10)+rem;
    temp=temp/10;
}
if(sum==num)
return true;
 return false;
}
public static void main(String[] args){    
	Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int Nsum=0;
    for(int i=a;i<b;i++){
     if(isPalindrome(i)){
           l1.add(i);
          Nsum=Nsum+i;
     }
    }   

    System.out.println(l1);
    System.out.println(Nsum);
}
}

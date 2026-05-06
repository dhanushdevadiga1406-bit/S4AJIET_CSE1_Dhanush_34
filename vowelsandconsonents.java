import java.util.Scanner;
public class Main
{
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	     int v=0;
	     int c=0;
	    System.out.println("Enter the string:");
	    String s = sc.nextLine().toLowerCase();
	    for(int i=0;i<s.length();i++){
	        char ch = s.charAt(i);
	    if(ch>= 'a' && ch<='z'){
	    if(ch == 'a'||ch == 'i'||ch == 'o'||ch == 'u'){
	        v++;
	    }else{
	        c++;
	    }
	    }
	    }
	    System.out.println("vowels:"+v);
	    System.out.println("Consonants:"+c);
	}
}

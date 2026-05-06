import java.util.Collections;
import java.util.LinkedList;
public class Main
{
	public static void main(String[] args){
	   LinkedList<Integer>cse=new LinkedList<>();
	   cse.add(10);
	   cse.add(20);
	   cse.addFirst(5);
	   cse.addLast(30);
	   System.out.println("Normal order:"+cse);
	   Collections.sort(cse);
	   System.out.println("Asending order:"+cse);
	   Collections.sort(cse,Collections.reverseOrder());
	   System.out.println("Descending order:"+cse);
	}
}

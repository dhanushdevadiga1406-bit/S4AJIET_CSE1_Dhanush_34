public class Main
{
	public static void main(String[] args) {
		int a;
		int n=20;
		int k=2;
		int j=3;
		int m=12;
		int p=12;
		if(k!=0 && j!=0){
		    a = (m/k)+(p/j);
		    n = n-a;
		}
		else{
		System.out.println("Invalid input");
		System.exit(0);
	}
	if(m%k!=0||p%j!=0){
	    n = n-1;
	}
	System.out.println("Number of monkey on the tree="+n);
}
}
		

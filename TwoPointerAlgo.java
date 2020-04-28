import java.util.*;
public class TwoPointerAlgo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		TwoPointerAlgo g=new TwoPointerAlgo();
		if(g.findtriplet(a,n)){
			System.out.println("1");
		}
		else{
			System.out.println("0");
		}
		
	}
	public boolean findtriplet(int a[],int n){
		Arrays.sort(a);
		for(int i=0;i<n-2;i++){
			if(twosum(a,-a[i],i+1)) return true;
		}
		return false;
	}
	public boolean twosum(int a[],int x,int i){
		int j=a.length-1;
		while(i<j){
			if(a[i]+a[j]>x){
				j--;
			}
			else if(a[i]+a[j]<x){
				i++;
			}
			else{
				return true;
			}
		}
		return false;
	}
}

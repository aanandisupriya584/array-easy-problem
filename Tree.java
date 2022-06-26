/*There are N trees in Terry's front yard. He is supposed to measures the height of each tree and find the average height of trees in his yard. What is the average height of a tree in Terry's front yard?

Note:- Print your answer as floor value (average height)
Input
The first line contains N: numbers of tree.
Then follows N lines represents the height of each tree.

Constraint:-
1 <= n <= 100000
1 <= a[i] <= 100000
Output
Print the average height of all the trees in the yard
Example
Input
5
6
8
34
9
3

Output
12

Explanation:-
Sum of heights =60
Average of heights =60/5

Sample Input:
3
1
2
3*/

package arrayPrc;
import java.io.*;
import java.util.*;
public class Tree {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n= sc.nextInt();
		int arr[]=new int[n];
		long sum=0;
		for(int i=0;i<=n-1;i++) {
			arr[i]=sc.nextInt();
	    sum=sum+arr[ i];
    
	}
		System.out.println(sum/n);

}
}

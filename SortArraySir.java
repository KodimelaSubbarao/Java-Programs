import java.util.Scanner;
public class SortArraySir {
public int[] sortArrayInGivenOrder(int[] arr,int n) {
int temp=0;
for(int i=1;i<n;i=i+2) {
temp=arr[n-1];
for(int j=n-1;j>i;j--) {
arr[j]=arr[j-1];
}
arr[i]=temp;
}
return arr;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Array Size: ");
int n = sc.nextInt();
int[] arr = new int[n];
System.out.println("Enter Array Element: ");
for(int i=0;i<n;i++) {
arr[i]=sc.nextInt();
}
int[] ans=new SortArraySir().sortArrayInGivenOrder(arr,n);
for(int i:ans) {
System.out.print(i+" ");
}
sc.close();
}
}
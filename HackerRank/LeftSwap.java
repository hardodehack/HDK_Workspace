import java.util.Scanner;
class LeftSwap{
public static void main(String[] s){

Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int d = scan.nextInt();
int arr[] = new int[n];
for(int i=0;i<n;i++){

arr[(i+n-d)%n]=scan.nextInt();
}
for(int i=0;i<n;i++){
	System.out.println(arr[i]);
}

}

}
import java.util.Scanner;
class SortingCharacters{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a word : ");
String s = sc.nextLine();
char arr[]=s.toCharArray();
char temp;
for(int i=0;i<arr.length;i++){
for(int j=i=1+1;i<arr.length;j++){
if(arr[i]>arr[j]){
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
System.out.print(new String(arr));
}
}
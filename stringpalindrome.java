import java.util.Scanner;
class PalindromeString{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a word : ");
String s = sc.nextLine();
String orginal=s;
String rev="";
for(int i=s.length()-1;i>=0;i--){
rev=rev+s.charAt(i);
}
if(orginal==rev){
System.out.print("Given string is a palindrome ");
}
else{
System.out.print("Given string is not a palindrome ");
}  
}
}
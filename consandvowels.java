import java.util.Scanner;
class ConsAndVowels{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter a word : ");
String s = sc.nextLine();
s = s.toLowerCase();
int vowels=0,con=0;
for(int i=0;i<s.length();i++){
if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
vowels++; 
}
else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
con++;
}
}
System.out.println("consonants are : "+con);
System.out.println("vowels are : "+vowels);
}
}
import java.util.Scanner;
class Sorting{
public static void main(String args[]){
String names[]=new String[5];
Scanner sc = new Scanner(System.in);
String temp;
for(int i=0;i<=5;i++){
System.out.println("Enter a word : ");
names[i]=sc.nextLine();
}
for(int i=0;i<=5;i++){
for(int j=i+1;j<5;j++){
if(names[i].compareTo(names[j]>0){
temp[i]=names[i];
names[i]=names[j];
names[j]=temp;
}
}
}
for(String name:names){
System.out.println(name);
}
}
}
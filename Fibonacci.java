import java.util.*;
class prime {
 public static void main(String []args){
   Scanner sc= new Scanner(System.in);
  int n =sc.nextInt();
  int count=0,i;
   for(i=2;i<n;i++){
    if(i%n==0){
    count++;
}

if(count==0){
  System.out.println("prime number);
}
wl
else{
System.out.println("not a prime number);
}
}
{
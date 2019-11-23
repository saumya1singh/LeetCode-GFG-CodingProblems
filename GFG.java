
import java.util.*;
import java.lang.*;
import java.io.*;

/*Given a String of length S, reverse the whole string without reversing the individual words in it. Words are separated by dots.
Example:
Input:
2
i.like.this.program.very.much
pqr.mno

Output:
much.very.program.this.like.i
mno.pqr
*/


class GFG
 {  public static void reverse(String s){
     
     s=s.replace("."," ");
     String[] arr=s.split(" ");
     for(int i=arr.length-1;i>=1;i--)
    { System.out.print(arr[i]+"."); }
     System.out.print(arr[0]);
     System.out.println();
 
 }
public static void main (String[] args) throws IOException
{
Scanner scan = new Scanner(System.in);
int T;
T = scan.nextInt();
scan.nextLine();
String[] s = new String[T];
for(int i=0;i<T;i++)
     s[i]=scan.nextLine();
           

for(int y=0;y<T;y++)
   reverse(s[y]);        

}

}


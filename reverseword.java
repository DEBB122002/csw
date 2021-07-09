package array;
import java.util.*;
public class reverseword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "main hoon  gian  ";
		 int i =str.length()-1;
		 String s="";
		 System.out.println(i);
		 while(i>=0)
		 {while(i>=0&&str.charAt(i)==' ') {
			 i--;
		 }int j=i;
		 while(i>=0&&str.charAt(i)!=' ') {
			 i--;
			 
		 }
		if(s.isEmpty()) {
	s=		s.concat(str.substring(i+1,j+1));
		}else {
		s=	s.concat(" "+str.substring(i+1,j+1));
		}
		 }
		 s=s.trim();
		System.out.println(s);}
	}

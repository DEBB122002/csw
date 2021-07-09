package array;
import java.util.*;
class Node{
	Node left,right;
 int data;
 public Node(int data)
{this.data=data;
 this.left=null;
 this.right=null;
	
}

}
public class Tree {public static Node compute()	
{ Node root=null;
System.out.println("enter the data");
Scanner sc=new Scanner(System.in);
int data=sc.nextInt();
if (data==-1)
{return null;}
root =new Node(data);
System.out.println("enter data for left "+data);

root.left=compute();
System.out.println("enter data for the right " +data);
root.right=compute();
	return root;
	

}
public static int level(Node n1,int x,int l1){
	if(n1==null)
	{return 0;
		
		
	}
	
	if(n1.data==x)
	{return l1;}
	int l2=level(n1.left, x,l1+1);
	if(l2!=0) {
		return l2;
		
	}
	l2=level(n1.right, x,l1+1);
	return l2;
}

public static boolean issib(Node n1,int x,int y) {
	if(n1==null)
	{
		return false;
		
	}
	boolean a ;
	
	return(n1.left.data==x&&n1.right.data==y)||(n1.left.data==y&&n1.right.data==x)||(issib(n1.left,x,y))||issib(n1.right,x,y);
}
static void printPreorder(Node node)
{
    if (node == null)
        return;

    /* first print data of node */
    System.out.print(node.data + " ");

    /* then recur on left sutree */
    printPreorder(node.left);

    /* now recur on right subtree */
    printPreorder(node.right);
}
public static void main(String [] args)

{Node root=compute();
printPreorder(root);}}
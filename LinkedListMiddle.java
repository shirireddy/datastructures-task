import java.util.*;
class LinkedListMiddle
{
	 Node head;
    class Node 
    { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
	public void push(int x)
	{
		Node n2=head;
		Node n1=new Node(x);
		if(head==null)
		{
			head=n1;
			n1.next=null;
			return;
		}
		while(n2.next!=null)
		{
			n2=n2.next;
		}
		n2.next=n1;
		n1.next=null;
	}
	public void print() 
	{ 
		Node tnode = head; 
		while (tnode != null) 
		{ 
			System.out.print(tnode.data+"->"); 
			tnode = tnode.next; 
		} 
		System.out.println("NULL"); 
	} 
	public void findMiddle()
	{
		Node n1=head;
		Node n2=head;
		if(head!=null)
		{
			while(n2!=null && n2.next!=null)
			{
				n2=n2.next.next;
				n1=n1.next;
			}
			System.out.println(n1.data);
		}
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		LinkedListMiddle l=new LinkedListMiddle();
		for(int i=1;i<=n;i++)
		{
			int x=sc.nextInt();
			l.push(x);
		}
		l.print();
		System.out.println();
		l.findMiddle();
	}
}
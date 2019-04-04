import java.io.*;
import java.util.*;

public class QueueWithStacks {

    public static void enQueue(int x,Stack<Integer> s1,Stack<Integer> s2)
    {
        s1.push(x);
    }
    public static void deQueue(Stack<Integer> s1,Stack<Integer> s2)
    {
        if(s2.isEmpty())
        {
            while(!s1.isEmpty())
            {
                s2.push(s1.pop());
            }
        }
        s2.pop();
    }
    public void print(Stack<Integer> s1,Stack<Integer> s2)
    {
        if(s2.isEmpty())
        {
            while(!s1.isEmpty())
            {
                s2.push(s1.pop());
            }
        }
        System.out.println(s2.peek());

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        Stack<Integer> s1=new Stack<Integer>();
        Stack<Integer> s2=new Stack<Integer>();
        Solution s=new Solution();
        for(int i=1;i<=q;i++)
        {
            int n=sc.nextInt();
            if(n==1)
            {
                int x=sc.nextInt();
                s.enQueue(x,s1,s2);
            }
            else if(n==2)
                s.deQueue(s1,s2);
            else
                s.print(s1,s2);
        }
    }
}


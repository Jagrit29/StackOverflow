package Codes;

import java.util.*;
import java.io.*;
import java.lang.*;


class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class Code1
{
    static Node insertNode(Node head, int x)
    {
        Node node = new Node(x);
        if(head == null)
            return new Node(x);

        Node temp = head;
        while(temp.next != null)
            temp = temp.next;

        temp.next = node;

        return head;
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());

            String str[] = read.readLine().trim().split(" ");
            Node head = null;
            for(int i = 0; i < n; i++)
                head = insertNode(head, Integer.parseInt(str[i]));

            int node = Integer.parseInt(read.readLine());

            System.out.println(search(head, node) ? "1" : "0");
        }
    }
	
    //Here it is.
      public static boolean search(Node head,int x)
		{
			//Empty LinkedList
			if(head==null)
			{
				return false;
			}
			
			//Only single Node;
			if(head.next==null)
			{
				if(head.data==x)
				{
					return true;
				}
				return false;
			}
			
			//More than 1.
			//1->2->3->4 //even  //search 4
			//1->2->3    //odd   //search 2;
			Node first=head;
			Node second=head.next;
			
			while(first!=null)
			{
				if(first.data==x)
				{
					return true;
				}
				if(second!=null && second.data==x)
				{
					return true;
				}
				
				if(second!=null)
				{
					//One more term for first;
					first=second.next;
					if(first!=null)
					{
						//One more term for second;
						second=first.next;
					}
				}
				else
				{
					//No more terms left;
					return false;
				}
				
			}
			return false;
			
			
		}

	}

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

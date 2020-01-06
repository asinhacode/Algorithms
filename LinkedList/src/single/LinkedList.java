/*
 * INSERTION is very easy!
 * 
 * Create a node, takes an integer and a pointer
 * 
 * 	0 -> 1 -> 2
 * 
 * 0.next = 1
 * 1.next = 2
 * 2.next = null
 * 
 */



package single;

class Node
{
	int i;
	Node next;
}

class Linked
{
	public Node insert(int i, Node node)
	{
		if(node == null)
		{
			return getNewNode(i);
		}
		
		else {
			node.next = insert(i, node.next);
		}
		return node;
	}

	private Node getNewNode(int i) {

		Node n = new Node();
		n.i = i;
		n.next = null;
		
		return n;
	}
	
	public void printList(Node node) {
		if(node == null)
		{
			return;
		}
		
		System.out.println(node.i);
		printList(node.next);
	}
}
public class LinkedList 
{

	public static void main(String[] args) 
	{
		Node root = null; // first node
		
		Linked a = new Linked();
		
		root = a.insert(0, root); // root node created
		root = a.insert(1, root);
		root = a.insert(2, root);
		
		a.printList(root);
		
	}

}



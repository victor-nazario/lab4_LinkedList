package linkedLists;
/**
 * Singly linked list with references to its first and its
 * last node. 
 * 
 * @author pirvos
 *
 */

import java.util.NoSuchElementException;

import linkedLists.LinkedList;

public class SLFLList<E> extends SLList<E>
{
	private SNode<E> first, last;   // reference to the first node and to the last node
	int length; 
	
	public SLFLList() {       // to create an empty list instance
		first = last = null; 
		length = 0; 
	}
	
	
	public void addFirstNode(Node<E> nuevo) {															//D - Adds the first node to the SLL
		Node <E> newNode = new SNode<E>();
		newNode = nuevo;
		first = (linkedLists.AbstractSLList.SNode<E>) newNode; 
		length++; 	
	}

	public void addNodeAfter(Node<E> target, Node<E> nuevo) {
		// TODO Auto-generated method stub
		
	}

	public void addNodeBefore(Node<E> target, Node<E> nuevo) {												//donzo
		SNode<E> ts = (SNode<E>) target;
		SNode<E> ns = (SNode<E>) nuevo; 
		ns.setNext(ts);
		if(ts == first) {
			first = ns;
		}
		
		else {
			SNode<E> prev = first;
			while(prev.getNext() != ts) {
				prev = prev.getNext();
				prev.setNext(ns);
			}
		}
		length++;
	}

	public Node<E> getFirstNode() throws NoSuchElementException {            											 //Donzo
		if (first == null) {throw new NoSuchElementException("The specified element does not exist");}
		return first;
	}

	public Node<E> getLastNode() throws NoSuchElementException {
		if (last == null) {throw new NoSuchElementException("The specified element does not exist");}					//Seems donzo 
		return last;
	}

	public Node<E> getNodeAfter(Node<E> target) throws NoSuchElementException {
		// TODO Auto-generated method stub
		return null;
	}

	public Node<E> getNodeBefore(Node<E> target) throws NoSuchElementException {										 //seems donzo 
		if (first == null || target == first) {throw new NoSuchElementException("The specified element does not exist");}
		SNode<E> c = (linkedLists.AbstractSLList.SNode<E>) this.getFirstNode();
		while(c != target) {
			c = c.getNext(); 
		}
		return c;
	}

	public int length() {																	//donzo
		
		return length();
	}

	public void removeNode(Node<E> target) {
		// TODO Auto-generated method stub
		
	}
	
	public Node<E> createNewNode() {
		return new SNode<E>();
	}

}

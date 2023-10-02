import java.util.Arrays;

class ArrayQueue {

	Node head;
	Node tail;

	Node[] arr;
	int start, end;



	private class Node {

		Integer item;

		private Node (Integer i) {
			item = i;
		}

	}



	ArrayQueue() {
		head = null;
		arr = new Node[4];
		start = 0;
		end = -1;
	}



	/**
	 * Print the queue for debugging.
	 * 
	 * @return string displaying queue.
	 */
	public String toString() {
		String s = "[";
		for (Node n: arr)
			if (n == null)
				s += "null, ";
			else
				s += n.item + ", ";
		s = s.substring(0, s.length() - 2) + "]";
		return s;
	}



	/**
	 * Add Node to the queue.
	 * 
	 * Big-O complecity is O(n) since we need to iterate torught the whole queue.
	 * 
	 * @param item for the node to hold.
	 */
	public void add(Integer item) {
		if (end + 1 == arr.length) // Increase size of array.
			resizeArr(true);
		Node n = new Node(item);
		arr[++end] = n;
	}



	/**
	 * Remove the first element of the list and return its value.
	 * 
	 * Big-O complexity is O(1) since we don't perform any loops.
	 * 
	 * @return value of removed element.
	 */
	public Integer remove() {
		if (start > end) // Empty queue.
			return null;
		if (end - start - 1 <= arr.length / 4 && arr.length > 4) {
			resizeArr(false);
		}
		return arr[start++].item;
	}



	/**
	 * Adjust array size.
	 */
	private void resizeArr(boolean grow) {
		int len;
		if (grow)
			len = arr.length * 2;
		else
			len = arr.length / 2;
		Node[] newArr = new Node[len];
		int newEnd = -1;
		while (start <= end) {
			newArr[++newEnd] = arr[start++];
		}
		arr = newArr;
		start = 0;
		end = newEnd;
		if (grow)
			System.out.println("# Increased arr size from " + arr.length / 2 + " to " + arr.length);
		else 
			System.out.println("# Decreased arr size from " + arr.length * 2 + " to " + arr.length);
	}

}
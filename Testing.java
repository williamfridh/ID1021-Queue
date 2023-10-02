class Testing {

	public static void main(String[] args) {

		/*
		Queue q = new Queue();

		q.add(1);
		q.add(3);
		q.add(5);
		q.add(7);
		q.add(9);

		System.out.println(q.toString());
		System.out.println(q.remove());
		System.out.println(q.toString());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.toString());
		System.out.println(q.remove());
		System.out.println(q.remove());
		*/

		/*
		BinaryTree tree = new BinaryTree();

		tree.add(6);
		tree.add(8);
		tree.add(2);
		tree.add(4);
		tree.add(10);

		tree.print();

		for (Integer i : tree)
			System.out.println(i);
		*/

		ArrayQueue q = new ArrayQueue();

		System.out.println(q.toString());

		q.add(2);
		q.add(4);
		q.add(6);
		q.add(8);
		q.add(10);

		System.out.println(q.toString());

		System.out.println(q.remove());
		System.out.println(q.toString());
		System.out.println(q.remove());
		System.out.println(q.toString());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		q.add(12);
		System.out.println(q.toString());
		System.out.println(q.remove());
		q.add(13);
		q.add(14);
		System.out.println(q.toString());
		q.add(15);
		System.out.println(q.toString());
		q.add(16);
		System.out.println(q.toString());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.toString());
		q.add(100);
		System.out.println(q.toString());

	}
	
}


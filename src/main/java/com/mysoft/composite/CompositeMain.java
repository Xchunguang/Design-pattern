package com.mysoft.composite;

public class CompositeMain {

	public static void main(String[] args) {
		Composite root = new Composite("root");
		root.add(new Leaf("One"));
		root.add(new Leaf("Two"));
		
		Composite treeNode = new Composite("treeNode");
		treeNode.add(new Leaf("Three"));
		treeNode.add(new Leaf("Four"));
		
		root.add(treeNode);
		
		Composite treeNode1 = new Composite("treeNode1");
		treeNode1.add(new Leaf("Five"));
		treeNode1.add(new Leaf("Six"));
		
		treeNode.add(treeNode1);
		root.display(1);
	}
}

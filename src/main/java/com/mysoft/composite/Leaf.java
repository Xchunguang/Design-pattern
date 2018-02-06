package com.mysoft.composite;

public class Leaf extends Component{

	public Leaf(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Component c) {
		// TODO Auto-generated method stub
		System.out.println("叶子节点无法添加节点");
	}

	@Override
	public void remove(Component c) {
		// TODO Auto-generated method stub
		System.out.println("叶子节点无法删除节点");
	}

	@Override
	public void display(int depth) {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder();
		for(int i=0;i<depth;i++){
			str.append('-');
		}
 		System.out.println(str+" "+name);
	}

}

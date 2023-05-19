package Test;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

///Simple tree structure with function to add and delete a node based on path
//- -   Design a basic tree data structure with functions for 
// adding and deleting a node based on its path. 
//For example, you should be able to add the value "L" to the path "P\Q\A".

public class CustomTree <E>{
	
	TreeNode<E> root = null;
	

	
	public void addNodeToPath(E value, String path, int index) {
		
		String nodeValue = path.substring(0, 0);
		
		
		//List<Integer> list = 
		//Stream.of(Arrays.asList(1,2,3,4,5)).filter(e-> e > 1).collect(Collectors.toList());
		
		
				
		
	}
	
	
	private TreeNode addChild(TreeNode parent, E value) {
		
		if(root == null) {
			root = new TreeNode();
			root.value = value;
			return root;
		}else {
			TreeNode childNode = new TreeNode();
			childNode.value = value;
			parent.childrenMap.put(value, childNode);
			return childNode;
		}
	}

}

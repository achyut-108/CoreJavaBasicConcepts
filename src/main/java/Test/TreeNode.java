package Test;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TreeNode<E> {
	
	
	Map<E, TreeNode> childrenMap;
	
	E value;

	
	public TreeNode() {
		childrenMap = new HashMap<>();
	}

}

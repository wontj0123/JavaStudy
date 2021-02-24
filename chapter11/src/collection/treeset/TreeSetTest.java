package collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("hong");
		treeSet.add("kim");
		treeSet.add("lee");
		
		for( String str : treeSet) {
			System.out.println(str);
		}
	}

}
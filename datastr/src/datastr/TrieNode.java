package datastr;

import java.util.HashMap;
import java.util.Map;

class Trie{
	Map<Character,TrieNode> children;
	boolean endofstring;
	Trie(){
		children=new HashMap<>();
		endofstring=false;
	}
}
class triee{
	public Trie root;
	triee(){
		root=new Trie();
		System.out.println("trie has been created");
	}
	
}
public class TrieNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        triee a=new triee();
        
	}

}

package org.eclipse.cmf.occi.core.gen.connector.services;

import java.util.ArrayList;
import java.util.Stack;
import java.util.StringJoiner;

import org.eclipse.cmf.occi.core.Annotation;

public class MainTree {

	public void test() {
//		String connectorString = "[(p.1)`-(p.2)]`-(p.3)-[(p.4)`-[(p.5)`-(p.6)]]";
//		String connectorString1 = "[(p.1)`-(p.2)]-(p.3)-[(p.4)-[(p.5)-(p.6)]]";
//		String connectorString2 = "[(p.1)-(p.2)]-(p.3)-[(p.4)-(p.5)]";
//		String connectorString = "[(p.1)-(p.2)]-(p.3)`-[(p.4)-(p.5)]";
		String connectorString = "[(p.1)-(p.1)]`-(p.3)";
		String connectorString1 = "[(p.1)-(p.2)]-[(p.3)-(p.4)]";
		String connectorString21 = "(p.1)-(p.2)-(p.3)-(p.4)";
		String connectorString22 = "[(p.1)-(p.2)]-(p.3)-(p.4)";
		String connectorString2 = "[(p.1)-(p.2)]`-(p.3)`-[(p.4)-(p.5)]";
		String connectorString3 = "[(p.1)-(p.2)]`-(p.3)-(p.4)";
		String connectorString4 = "(p.1)`-(p.2)-[(p.3)-(p.4)]";
		String connectorString5 = "[(p.1)`-(p.2)]-(p.3)-[(p.4)`-[(p.5)`-(p.6)]]";
		String connectorString6 = "[(p.1)`-(p.2)]-[(p.3)`-(p.4)`-(p.5)]-(p.6)";
		String connectorString7 = "[(p.1)`-(p.2)]`-(p.3)-[(p.4)-(p.5)]";
		String connectorString8 = "(p.1)`-(p.2)-[(p.3)`-(p.4)`]";
		String connectorString9 = "(p.1)-[(p.2)`-(p.3)`]";
		String connectorString10 = "(p.1)`-[[(p.2)`-(p.21)`-[(p.2a)-(p.2b]]-[(p.3)`-(p.31)`-(p.3a)]]";
		String connectorString11 = "(p.1)`-(p.2)`-(p.3)";
		String connectorString12 = "[(p.1a)`-(p.1b)`-(p.1c)]-(p.2)-[(p.3a)`-[(p.3b)-(p.3c)]`-[(p.3d)-(p.3e)]]"
				+ "-[(p.3a1)`-[(p.3b1)-(p.3c1)]`-[(p.3d1)-(p.3e1)]]";//[1a'-1b'-1c]-2-[3a'-[3b-3c]'-3d]
		String connectorString13 = "[(p.1a)`-(p.1b)`-(p.1c)]-(p.2)-[(p.3a)`-[(p.3b)`-[(p.3c1)-(p.3c2)]`-(p.3e)]`-(p.3d)]";//[1a'-1b'-1c]-2-[3a'-[3b-3c]'-3d]
		String connectorString14 = "[(p.1a)`-[(p.1b)-(p.1c)]`]`-[(p.3a)`-[(p.3b)-(p.3c)]`-(p.3d)]";
		String connectorString15 = "[(p.1a)`-(p.1b)`-(p.1c)]-(p.2)-[(p.3a)`-[(p.3b)-(p.3c)]`-(p.3d)]";
		String connectorString16 = "(MySQL.start)`-[(Tomcat.start)`-(Apache.start)]";
		String connectorString17 = "[(MySQL.running)-(MySQL.running)-(Tomcat.running)-(MySQL.fail)]`-(Tomcat.start)";//[1a'-1b'-1c]-2-[3a'-[3b-3c]'-3d]
		String connectorString18 = "(Monitor.add)-(Route.on)";//[1a'-1b'-1c]-2-[3a'-[3b-3c]'-3d]

		
		System.out.println("--- String 1: " + connectorString);
		System.out.println(genMacroCode(connectorString));
		
		System.out.println("--- String 2: " + connectorString1);
		System.out.println(genMacroCode(connectorString1));
		
		System.out.println("--- String 21: " + connectorString21);
		System.out.println(genMacroCode(connectorString21));
		
		System.out.println("--- String 22: " + connectorString22);
		System.out.println(genMacroCode(connectorString22));
		
		System.out.println("--- String 3: " + connectorString2);
		System.out.println(genMacroCode(connectorString2));
		
		System.out.println("--- String 4: " + connectorString3);
		System.out.println(genMacroCode(connectorString3));
//		
		System.out.println("--- String 5: " + connectorString4);
		System.out.println(genMacroCode(connectorString4));
//		
		System.out.println("--- String 6: " + connectorString5);
		System.out.println(genMacroCode(connectorString5));
//		
		System.out.println("--- String 7: " + connectorString6);
		System.out.println(genMacroCode(connectorString6));
//		
		System.out.println("--- String 8: " + connectorString7);
		System.out.println(genMacroCode(connectorString7));
//		
		System.out.println("--- String 9: " + connectorString8);
		System.out.println(genMacroCode(connectorString8));
//		
		System.out.println("--- String 10: " + connectorString9);
		System.out.println(genMacroCode(connectorString9));
//		
		System.out.println("--- String 11: " + connectorString10);
		System.out.println(genMacroCode(connectorString10));
//		
		System.out.println("--- String 12: " + connectorString11);
		System.out.println(genMacroCode(connectorString11));
//		
		System.out.println("--- String 13: " + connectorString12);
		System.out.println(genMacroCode(connectorString12));
//		
		System.out.println("--- String 14: " + connectorString13);
		System.out.println(genMacroCode(connectorString13));
//		
		System.out.println("--- String 15: " + connectorString14);
		System.out.println(genMacroCode(connectorString14));
//		
		System.out.println("--- String 16: " + connectorString15);
		System.out.println(genMacroCode(connectorString15));
//		
		System.out.println("--- String 17: " + connectorString16);
		System.out.println(genMacroCode(connectorString16));
		
		System.out.println("--- String 18: " + connectorString17);
		System.out.println(genMacroCode(connectorString17));
		
		System.out.println("--- String 18r: " + connectorString18);
		System.out.println(genMacroCode(connectorString18));
	}
	
	public static void main(String[] args) {
		MainTree testMT = new MainTree();
		testMT.test();
	}
	
	public String generatingMacroCodeAnno(Annotation anno) {
		return genMacroCode(anno.getValue());
	}
	/**
	 * Generate requires + accepts functions for Glue Builder
	 * */
	public String genMacroCode(String connectorString) {
		TreeNode root = new TreeNode("root.null", false, null);
		
		createTree(root, connectorString, 0);
		root.addExportedPort();
		System.out.println("----Added Export list----");
		root.traversal();
		System.out.println("--------");
		//--- Gen Accepts code
		ArrayList<TreeNode> listLeaves = new ArrayList<TreeNode>();
		tree2List(root, listLeaves);
//		System.out.println("list Leave: " + listLeaves.size() + "\t" + listLeaves);
//		TreeNode reducedTree = renewTree(root);
//		reducedTree.traversal();
//		return genAcceptsCode(listLeaves);
		return root.genRequiresCode("") + "\n" + genAcceptsCode(listLeaves);
	}
	
	public String generatingDataTransfer(Annotation annotation) {
		//data: int x: Tracker-Peer
		String input = annotation.getValue().trim();
		String rs = "";
		String[] parts = input.split(":");
		String[] varInfor = parts[1].trim().split(" ");
		String[] dataClasses = parts[2].trim().split("-");
		rs += "\t\tdata(" + dataClasses[0].trim() + "Connector.class, \"" + varInfor[1] + "\").to(" + dataClasses[1].trim() + "Connector.class, \"" + varInfor[1] + "\");\n";
		System.out.println(rs);
		return rs;
	}
	
	/**
	 * Gen ACCEPTS Code
	 * */
	public String genAcceptsCode(ArrayList<TreeNode> input) {
		String rs = "";
		for (int i=0 ; i<input.size() ; i++) {
			rs += "\t\tport(" + input.get(i).getComponentTypeName() + "Connector.class, \"" + input.get(i).getPortTypeName() + "\")"
					+ ".accepts(";
			StringJoiner joiner = new StringJoiner(", ");
			for (int j=0 ; j<input.size() ; j++) {
				if (i != j) {
					String s = input.get(j).getComponentTypeName() + "Connector.class, \"" + input.get(j).getPortTypeName() + "\"";
					joiner.add(s);
				}
			}
			rs += joiner.toString() + ");\n";
		}
		
		return rs;
	}
	
	public void createTree(TreeNode root, String connectorString, int index){
		
		if (connectorString.length() == 0)
			return ;

		int pos = connectorString.indexOf('[');
		//if it's flat
		if (pos == -1) {
			String[] elems = connectorString.split("-");
			//for all elements
			for(String e : elems) {
				String content = e.trim();
				boolean isTrigger = false;
				
				if (content.contains("`")) {
					isTrigger = true;
				}
				
				TreeNode elem = new TreeNode(content, isTrigger, root);
				root.getChildren().add(elem);
			}
			return ;
		} else {
			Stack<Character> stack = new Stack<>();
			stack.push(connectorString.charAt(pos));
			int q = pos + 1;
			while (q < connectorString.length()) {
				if (connectorString.charAt(q) == ']') {
					if (!stack.empty())
						stack.pop();
				} else if (connectorString.charAt(q) == '[') {
					stack.push(connectorString.charAt(q));
				}
				q++;
				if (stack.empty())
					break;
			}
			
			//before compound
			String baseLevelConnector = connectorString.substring(0, pos);
			createTree(root, baseLevelConnector, index);
			
			//the compound
			String nextLevelConnector = connectorString.substring(pos + 1, q-1);
//			System.out.println("nextLevelConnector: " + connectorString);
//			System.out.println(connectorString.indexOf("]"));
			
			
			boolean isTrigger = false;
//			System.out.println("test substr: " + connectorString);
			if (q + 1 <= connectorString.length()) {
				String temp = connectorString.substring(pos, q+1);
				if (temp.charAt(temp.length()-1) == '`')
					isTrigger = true;
			}
			
			TreeNode compound = new TreeNode("c" + pos + index + ".null", isTrigger, root);
			root.getChildren().add(compound);
//			System.out.println("nextLevelConnector: " + nextLevelConnector);
			createTree(compound, nextLevelConnector, index+1);
			
			//after compound
			if (q + 1 < connectorString.length()) {
				index = index+10;
				String remainStr = connectorString.substring(q + 1, connectorString.length());
				if (remainStr.indexOf("-") == 0) {
					remainStr = remainStr.substring(1);
				}
//				System.out.println("After: " + remainStr);
				createTree(root, remainStr, index+1);
			}
		}
	}
	
	public void tree2List(TreeNode root, ArrayList<TreeNode> listNodes) {
		
		if (root.getChildren().size() == 0) {
			listNodes.add(root);
			return ;
		}
		for (TreeNode child : root.getChildren()) {
			tree2List(child, listNodes);
		}
		
	}
}

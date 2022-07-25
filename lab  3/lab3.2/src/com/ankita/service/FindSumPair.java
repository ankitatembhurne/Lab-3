package com.ankita.service;
import java.util.*;
public class FindSumPair {
public Node insert(Node root, int key) {
if (root == null)
	return new Node(key);
if (key < root.nodeData) {
	root.leftNode = insert(root.leftNode, key);

} else {
	root.rightNode = insert(root.rightNode, key);
}
return root;
}

public boolean findPair(Node root, int sum, Set<Integer> set) {
	if (root == null) {
		return false;

	}

	if (findPair(root.leftNode, sum, set)) {
		return true;
	}

	if (set.contains(sum - root.nodeData)) {
		System.out.println(" Pair is found: (" + (sum - root.nodeData) + "," + root.nodeData + ")");
		return true;
	} else {
		set.add(root.nodeData);
	}
	return findPair(root.rightNode, sum, set);
}

public void findPairWithGivenSum(Node root, int sum) {
Set<Integer> objHashSet = new HashSet<Integer>();

	if (!findPair(root, sum, objHashSet)) {
		System.out.println("Pair Doesnot Exist");

	}
}
}
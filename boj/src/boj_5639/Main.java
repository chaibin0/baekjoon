package boj_5639;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			String line = "";
			Tree tree = new Tree(Integer.parseInt(br.readLine()), null, null);

			while ((line = br.readLine()) != null) {
				int value = Integer.parseInt(line);
				Tree iterator = tree;
				while (true) {
					if (iterator.getValue() > value) {
						if (iterator.getLeftNode() == null) {
							iterator.setLeftNode(new Tree(value, null, null));
							break;
						} else
							iterator = iterator.getLeftNode();
					}

					if (iterator.getValue() < value) {
						if (iterator.getRightNode() == null) {
							iterator.setRightNode(new Tree(value, null, null));
							break;
						} else
							iterator = iterator.getRightNode();
					}
				}
			}

			postCircuit(tree);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void postCircuit(Tree tree) {
		if (tree.getLeftNode() != null) {
			postCircuit(tree.getLeftNode());
		}

		if (tree.getRightNode() != null) {
			postCircuit(tree.getRightNode());
		}
		System.out.println(tree.getValue());

	}

}

class Tree {
	int value;
	Tree leftNode;
	Tree rightNode;

	public Tree(int value, Tree leftNode, Tree rightNode) {
		this.value = value;
		this.leftNode = leftNode;
		this.rightNode = rightNode;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Tree getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(Tree leftNode) {
		this.leftNode = leftNode;
	}

	public Tree getRightNode() {
		return rightNode;
	}

	public void setRightNode(Tree rightNode) {
		this.rightNode = rightNode;
	}

}
package boj_2263;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			int n = Integer.parseInt(br.readLine());
			int[] inOrder = new int[n];
			int[] postOrder = new int[n];
			int[] indexInOrder = new int[n + 1];

			Tree tree = new Tree();
			String in = br.readLine();
			StringTokenizer st = new StringTokenizer(in);
			for (int i = 0; i < n; i++) {
				inOrder[i] = Integer.parseInt(st.nextToken());
				indexInOrder[inOrder[i]] = i;
			}

			String post = br.readLine();
			st = new StringTokenizer(post);
			for (int i = 0; i < n; i++) {
				postOrder[i] = Integer.parseInt(st.nextToken());
			}

			// 부모 찾기
			for (int j = 0; j < n; j++) {
				if (postOrder[n - 1] == inOrder[j]) {
					tree.setValue(inOrder[j]);
					tree.setIndex(j);
					break;
				}
			}

			// 트리 완성
			for (int i = n - 2; i >= 0; i--) {
				int j = indexInOrder[postOrder[i]];
				Tree iterator = tree;
				while (iterator != null) {
					if (iterator.getIndex() < j) {
						if (iterator.getRight() == null) {
							Tree newTree = new Tree(inOrder[j], j);
							iterator.setRight(newTree);
							break;
						}
						iterator = iterator.getRight();
					}

					if (iterator.getIndex() > j) {
						if (iterator.getLeft() == null) {
							Tree newTree = new Tree(inOrder[j], j);
							iterator.setLeft(newTree);
							break;
						}
						iterator = iterator.getLeft();
					}
				}
			}

			preOrderCircuit(tree, bw);
			bw.write("\n");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void preOrderCircuit(Tree tree, BufferedWriter bw) throws IOException {
		bw.write(tree.getValue() + " ");
		if (tree.getLeft() != null)
			preOrderCircuit(tree.getLeft(), bw);
		if (tree.getRight() != null)
			preOrderCircuit(tree.getRight(), bw);
	}

}

class Tree {
	int value; // 값
	int index; // 중위
	Tree right;
	Tree left;

	public Tree() {
	}

	public Tree(int value, int index) {
		this.value = value;
		this.index = index;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Tree getRight() {
		return right;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public void setRight(Tree right) {
		this.right = right;
	}

	public Tree getLeft() {
		return left;
	}

	public void setLeft(Tree left) {
		this.left = left;
	}

}

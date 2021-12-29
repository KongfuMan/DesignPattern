package Behavioral.Iterator;


import lombok.Getter;
import lombok.Setter;

import java.util.Iterator;
import java.util.Stack;

public class BinaryTree<T> implements Iterable {

    private class TreeNode {
        private T val;
        private TreeNode left;
        private TreeNode right;

        TreeNode(T val){
            this.val = val;
        }
    }

    @Setter
    @Getter
    private TreeNode root;

    // In-order iterator
    private class InOrderIterator implements Iterator<T> {

        private Stack<TreeNode> stack;

        private InOrderIterator() {
            stack = new Stack<>();
            TreeNode node = root;
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
        }

        @Override
        public T next() {
            if (hasNext()) {
                return null;
            }
            TreeNode res = stack.pop();
            TreeNode node = res;
            node = node.right;
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            return res.val;
        }

        @Override
        public boolean hasNext() {
            return !stack.isEmpty();
        }
    }

    private class PreOrderIterator implements Iterator<T> {

        private Stack<TreeNode> stack;

        private PreOrderIterator() {
            stack = new Stack<>();
            stack.push(root);
        }

        @Override
        public T next() {
            return null;
        }

        @Override
        public boolean hasNext() {
            return false;
        }
    }

    private class PostOrderIterator implements Iterator<T> {

        private Stack<TreeNode> stack;

        private PostOrderIterator() {
            stack = new Stack<>();
            stack.push(root);
        }

        @Override
        public T next() {
            return null;
        }

        @Override
        public boolean hasNext() {
            return false;
        }
    }

    @Override
    public Iterator iterator() {
        return getInOrderIterator();
    }

    public Iterator getInOrderIterator() {
        return new InOrderIterator();
    }

    public Iterator getPreOrderIterator() {
        return new PreOrderIterator();
    }

    public Iterator getPostOrderIterator() {
        return new PostOrderIterator();
    }
}

package Behavioral.Iterator;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

// binary tree implement MyIterable
public class BinaryTree<T> implements MyIterable {

    class TreeNode<T>{
        T val;
        TreeNode left;
        TreeNode right;
    }

    private TreeNode root;

    private class MyIteratorImpl implements MyIterator{

        private Stack<TreeNode> stack;

        private MyIteratorImpl() {
            stack = new Stack<>();
            TreeNode node = root;
            while(node != null){
                stack.push(node);
                node = node.left;
            }
        }

        @Override
        public Object next() {
            if (hasNext()){
                return null;
            }
            TreeNode res = stack.pop();
            TreeNode node = res;
            node = node.right;
            while(node != null){
                stack.push(node);
                node = node.left;
            }
            return res;
        }

        @Override
        public boolean hasNext() {
            return !stack.isEmpty();
        }
    }

    @Override
    public MyIterator getIterator() {
        return new MyIteratorImpl();
    }

    public static void main(String[] args) {
        ArrayList<Integer> bt1 = new ArrayList<>();
        Iterator<Integer> it1 = bt1.iterator();
        Iterator<Integer> it2 = bt1.iterator();
    }
}

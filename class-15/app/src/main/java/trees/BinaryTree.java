package trees;
import java.util.ArrayList;
import java.util.List;
class BinaryTree {
    Node root;
    public BinaryTree() {
        root = null;
    }
    public List<Integer> preOrder() {
        List<Integer> result = new ArrayList<>();
        preOrderTraversal(root, result);
        return result;
    }
    private void preOrderTraversal(Node node, List<Integer> result) {
        if (node == null) {
            return;
        }
        result.add(node.value);
        preOrderTraversal(node.left, result);
        preOrderTraversal(node.right, result);
    }

    public List<Integer> inOrder() {
        List<Integer> result = new ArrayList<>();
        inOrderTraversal(root, result);
        return result;
    }
    private void inOrderTraversal(Node node, List<Integer> result) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left, result);
        result.add(node.value);
        inOrderTraversal(node.right, result);
    }
    public List<Integer> postOrder() {
        List<Integer> result = new ArrayList<>();
        postOrderTraversal(root, result);
        return result;
    }
    private void postOrderTraversal(Node node, List<Integer> result) {
        if (node == null) {
            return;
        }
        postOrderTraversal(node.left, result);
        postOrderTraversal(node.right, result);
        result.add(node.value);
    }
}

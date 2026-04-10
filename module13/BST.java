package module13;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BST {
    Node root;

    Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        } 
        else if (root.data < key) {
            root.right = insert(root.right, key);
        } 
        else {
            root.left = insert(root.left, key);
        }
        return root;
    }

    boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

        Node findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    Node delete(Node root, int key) {
        if (root == null) {
            return null;
        } 
        else if (key < root.data) {
            root.left = delete(root.left, key);
        } 
        else if (key > root.data) {
            root.right = delete(root.right, key);
        } 
        else {
            // Case 1: Leaf
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: One child
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }

            // Case 3: Two children
            Node minNode = findMin(root.right);
            root.data = minNode.data;
            root.right = delete(root.right, minNode.data);
        }
        return root;
    }

    public static void main(String[] args) {

        BST ob = new BST();

        int[] values = {10, 5, 15, 2, 7, 20};

        for (int i : values) {
            ob.root = ob.insert(ob.root, i);
        }

        for (int i : values) {
            System.out.print(i + " ");
        }

        boolean found = ob.search(ob.root, 7);
        System.out.println("\n" + found);

        ob.root = ob.delete(ob.root, 5);

        System.out.print("After delete: ");
        ob.inorder(ob.root);
    }
}

// Build Tree Preorder Code

package Binary_Trees;

public class Binary_Trees_Basics {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        // 1. Preorder Traversal function

        public static void preOrderTraversal(Node root) {
            if(root == null) {
                return;
            }

            System.out.print(root.data + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }

        // 2. Inorder Traversal function

        public static void inOrderTraversal(Node root) {
            if(root == null) {
                return;
            }

            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }

        // 3. Postorder Traversal function

        public static void postOrderTraversal(Node root) {
            if(root == null) {
                return;
            }

            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,-1,5,-1,-1,3,-1,6,-1,-1};

        // Build Tree Preorder function

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.print(root.data + " ");  
        
        System.out.println(" ");
        
        // 1. Preorder Traversal function

        tree.preOrderTraversal(root);

        System.out.println(" ");

        // 2. Inorder Traversal function

        tree.inOrderTraversal(root);

        System.out.println(" ");

        // 3. Postorder Traversal function

        tree.postOrderTraversal(root);

        System.out.println(" ");
    }
}

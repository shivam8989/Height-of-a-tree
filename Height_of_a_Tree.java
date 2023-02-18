package Binary_Tree;

public class Height_of_a_Tree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree {
        static int index = -1;

        public static Node buildtree(int nodes[]) {
            index++;
            Node newnode = new Node(nodes[index]);
            newnode.left = buildtree(nodes);
            newnode.right = buildtree(nodes);

            return newnode;
        }
    }
        public static int Height(Node root){
            if(root == null){
                return 0;
            }
            int lh = Height(root.left);
            int rh = Height(root.right);

            return Math.max(lh,rh)+1;
        }

    public static void main(String [] args){
        /*
                   1
                  / \
                 2   3
               /  \ / \
              4   5 6  7
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right=new Node(3);
        root.left.left = new Node(4);
        root.left.right=new Node(5);
        root.right.left = new Node(6);
        root.right.right=new Node(7);

        System.out.println(Height(root));

    }
}

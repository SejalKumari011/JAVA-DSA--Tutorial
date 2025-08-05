import java.util.Queue;
import java.util.LinkedList;

public class BinaryTree {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

        static class binaryTree{
            static int idx=-1;
            public static Node buildBT(int nodes[]){
                idx++;
                if(nodes[idx]==-1){
                    return null;
                }
                Node newnode=new Node(nodes[idx]);
                newnode.left=buildBT(nodes);
                newnode.right=buildBT(nodes);

                return newnode;
            }

            public static void preorder(Node root){
                if(root==null){
                    return;
                }

                System.out.print(root.data+" ");
                preorder(root.left);
                preorder(root.right);

            }

            public static void inorder(Node root){
                if(root==null){
                    return;
                }
                inorder(root.left); 
                System.out.print(root.data+" ");
                inorder(root.right);
            }

            public static void postorder(Node root){
                if(root==null){
                    return;
                }
                postorder(root.left);
                postorder(root.right);
                System.out.print(root.data+" ");
            }

            public static void levelOrder(Node root){
                if(root==null){
                    return;
                }

                Queue<Node> q=new LinkedList<>();
                q.add(root);
                q.add(null);

                while(!q.isEmpty()){
                    Node currNode=q.remove();
                    if(currNode==null){
                        System.out.println();
                        if(q.isEmpty()){
                            break;
                        }else{
                            q.add(null);
                        }
                    }else{
                        System.out.print(currNode.data+" ");
                        if(currNode.left!=null){
                            q.add(currNode.left);
                        }

                        if(currNode.right!=null){
                            q.add(currNode.right);
                        }
                    }
                }
            }
    }
    public static void main(String [] args){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1  };
        binaryTree tree = new binaryTree();
        Node root= tree.buildBT(nodes);
        
        //binaryTree.preorder(root);
        //binaryTree.inorder(root);
        //binaryTree.postorder(root);

        binaryTree.levelOrder(root);
    
}

}
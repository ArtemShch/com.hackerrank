package Day23BSTLevelOrderTraversal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/*
тест
Sample Input

6
3
5
4
7
2
1

Sample Output

3 2 5 1 4 7

 */
class Solution{
    //выводим в консоль дерево по уровням
    static void levelOrder(Node root){
        Queue<Node> queue = new LinkedList();
        queue.add(root);

        while(!queue.isEmpty()){
            Node current = queue.remove();
            System.out.print(current.data+" ");
            if (current.left!=null) queue.add(current.left);
            if (current.right!=null) queue.add(current.right);
        }

    }
    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}
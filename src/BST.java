/**
 * Created by Bob on 2/8/2018.
 */
public class BST
{
    Node root;
    int size;
    String inorder;

    public void insertValue(double k)
    {
        size++;

        if(root == null)
        {
            root = new Node(k);
            return;
        }

        Node parent = findParent(k, root);
        if(k <= parent.value)
            parent.left = new Node(k);
        else
            parent.right = new Node(k);
    }

    public Node findParent(double k, Node v)
    {
        if(k <= v.value && v.left == null)
            return v;
        else if(k > v.value && v.right == null)
            return v;
        else
        {
            if(k <= v.value)
                return findParent(k, v.left);
            else
                return findParent(k, v.right);
        }
    }


    public String toStringInorder()
    {
        visit(root);
        inorder = inorder.substring(0, inorder.length()-2);
        return inorder;
    }

    public void visit(Node parent)
    {
        leftNode(parent);
        inorder += parent.value + ", ";
        rightNode(parent);
    }

    public void leftNode(Node parent)
    {
        if(parent.left == null)
            return;
        visit(parent.left);
    }

    public void rightNode(Node parent)
    {
        if(parent.right == null)
            return;
        visit(parent.right);
    }


    public String toStringPretty()
    {
        return "urmom";
    }

    class Node
    {
        double value;
        Node left, right;

        public Node(double value)
        {
            this.value = value;
        }
    }
}

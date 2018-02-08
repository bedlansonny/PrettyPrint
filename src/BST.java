/**
 * Created by Bob on 2/8/2018.
 */
public class BST
{
    Node root;
    int size;

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


    public void printInorder()
    {
        visit(root);
    }

    public void visit(Node parent)
    {
        leftNode(parent);
        System.out.print(parent.value + " ");
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

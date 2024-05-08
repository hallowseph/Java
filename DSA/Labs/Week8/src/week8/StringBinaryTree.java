package week8;

/**
 *
 * @author xxg8089
 */
public class StringBinaryTree {
    BTreeNode root;
    
    public StringBinaryTree()
    {
        
    }
    
    public StringBinaryTree(String[] list)
    {
        for(int i = 0; i < list.length; i++)
        {
            add(list[i]);
        }
    }
    
    public void add(String data)
    {
        if(root == null)
        {
            root = new BTreeNode();
            root.data = data;
        }
        else
        {
            BTreeNode newNode = new BTreeNode();
            newNode.data = data;
            add(root, newNode);
        }
    }
    
    private void add(BTreeNode root, BTreeNode newNode)
{
    if(newNode.compareTo(root) <= 0)
    {
        if(root.left == null)
        {
            root.left = newNode;
            newNode.parent = root;
        }
        else
        {
            add(root.left, newNode);
        }
    }
    else
    {
        if(root.right == null)
        {
            root.right = newNode;
            newNode.parent = root;
        }
        else
        {
            add(root.right, newNode);
        }
    }
}
    public void linkParent()
{
    linkParent(root);
}

private BTreeNode linkParent(BTreeNode root)
{
    if (root == null) {
        return null;
    }
    
    BTreeNode leftResult = linkParent(root.left);
    BTreeNode rightResult = linkParent(root.right);

    if (root.left != null) {
        root.left.parent = root;
    }

    if (root.right != null) {
        root.right.parent = root;
    }

    return root;
}
    
    public void traverse()
    {
        traverse(root);
    }
    
    private void traverse(BTreeNode root)
    {
        if(root.left != null)
        {
            traverse(root.left);
        }
        System.out.println(root);
        if(root.right != null)
        {
            traverse(root.right);
        }
    }
}

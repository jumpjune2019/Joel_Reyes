
import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
public class TreeExample extends JFrame
{
    private JTree tree;
    public TreeExample()
    {
        //create the root node
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Food");
        //create the child nodes
        DefaultMutableTreeNode fruitNode = new DefaultMutableTreeNode("Fruits");
        DefaultMutableTreeNode vegetableNode = new DefaultMutableTreeNode("Vegetables");
        DefaultMutableTreeNode nutsNode = new DefaultMutableTreeNode("Nuts");
        //add the child nodes to the root node
        root.add(vegetableNode);
        root.add(fruitNode);
        root.add(nutsNode);
        fruitNode.add(new DefaultMutableTreeNode("Banana"));
        fruitNode.add(new DefaultMutableTreeNode("Mango"));
        fruitNode.add(new DefaultMutableTreeNode("Apple"));
        fruitNode.add(new DefaultMutableTreeNode("Grapes"));

        fruitNode.add(new DefaultMutableTreeNode("Orange"));
        vegetableNode.add(new DefaultMutableTreeNode("Corn"));
        vegetableNode.add(new DefaultMutableTreeNode("Peas"));
        vegetableNode.add(new DefaultMutableTreeNode("Broccoli"));
        vegetableNode.add(new DefaultMutableTreeNode("Torchy's tacos"));

        nutsNode.add(new DefaultMutableTreeNode("Walnuts"));
        nutsNode.add(new DefaultMutableTreeNode("Almonds"));
        nutsNode.add(new DefaultMutableTreeNode("Pistachios"));
        nutsNode.add(new DefaultMutableTreeNode("Cashews"));

        //create the tree by passing in the root node
        tree = new JTree(root);
        add(tree);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JTree Example");
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TreeExample();
            }
        });
    }
}

import java.util.LinkedList;


public class Tree {

    TreeNode root;
    LinkedList<TreeNode>nodes = new LinkedList<>();

    Tree() {

    }
    public void display() {
        displayHelper(root);
    }

    public void displayHelper(TreeNode node){

        if (node!=null){
            nodes.add(node);
            displayHelper(node.getLeftNode());
            displayHelper(node.getRightNode());
        }
    }

    public void foodDisplay() {
        foodDisplayHelper(root);
        System.out.println();
    }

    public void foodDisplayHelper(TreeNode node){

        if (node!=null){
            if (node.getJenis().equals("Makanan")){
                nodes.add(node);
            }
            foodDisplayHelper(node.getLeftNode());
            foodDisplayHelper(node.getRightNode());
        }
    }
    public void drinkDisplay() {
        drinkDisplayHelper(root);

    }

    public void drinkDisplayHelper(TreeNode node){

        if (node!=null){
            if (node.getJenis().equals("Minuman")){
                nodes.add(node);

            }
            drinkDisplayHelper(node.getLeftNode());
            drinkDisplayHelper(node.getRightNode());
        }
    }
    public void snacksDisplay() {
        snacksDisplayHelper(root);

    }

    public void snacksDisplayHelper(TreeNode node){

        if (node!=null){
            if (node.getJenis().equals("Snack")){
                nodes.add(node);

            }
            snacksDisplayHelper(node.getLeftNode());
            snacksDisplayHelper(node.getRightNode());
        }
    }

    public void add(TreeNode x) {

        if (root == null){
            root = x;
        } else {
            TreeNode bantu = root;

            while (true) {
                if (x.getHarga() < bantu.getHarga()){
                    if (bantu.getLeftNode() == null){
                        bantu.setLeftNode(x);
                        break;
                    } else {
                        bantu = bantu.getLeftNode();
                    }
                } else {
                    if (bantu.getRightNode() == null){
                        bantu.setRightNode(x);
                        break;
                    } else {
                        bantu = bantu.getRightNode();
                    }
                }
            }
        }


    }

    public TreeNode getNode(TreeNode targetValue) {

        return getNodeHelper(root, targetValue);
    }

    private TreeNode getNodeHelper(TreeNode currentNode, TreeNode targetValue) {
        if (currentNode == null) {
            return null;
        }

        if (currentNode.getNamaItem().equals(targetValue.getNamaItem())) {
            return currentNode;
        } else if (targetValue.getHarga() < currentNode.getHarga()) {
            return getNodeHelper(currentNode.getLeftNode(), targetValue);
        } else {
            return getNodeHelper(currentNode.getRightNode(), targetValue);
        }
    }

    public TreeNode getParent(TreeNode node) {

        TreeNode bantu = root;


        if (node.getNamaItem().equals(bantu.getNamaItem())){
            return null;
        }

        else {
            TreeNode simpan;

            while (bantu != null) {

                if (node.getHarga() <= bantu.getHarga()) {
                    simpan = bantu;
                    bantu = bantu.getLeftNode();

                } else {
                    simpan = bantu;
                    bantu = bantu.getRightNode();

                }
                if (bantu.getNamaItem().equals(node.getNamaItem())) {
                    return simpan;
                }
            }
        }
        return null;
    }

    public TreeNode getPredecessor(TreeNode remove){
        TreeNode bantu = getNode(remove);

        if (bantu.getLeftNode() !=null){
            bantu = bantu.getLeftNode();
            if (bantu.getRightNode() !=null){
                bantu = bantu.getRightNode();
                while (bantu.getRightNode() !=null){
                    bantu = bantu.getRightNode();
                }
                return bantu;
            } else {
                return bantu;
            }
        } else {
            return null;
        }
    }

    public Boolean remove(TreeNode key) {

        TreeNode bantu = getNode(key);

        if (bantu==null){
            return false;
        } else {
            if (bantu.getNamaItem().equals(root.getNamaItem())) {
                if (bantu.isLeaf()) {
                    root = null;
                } else if (bantu.getRightNode() == null) {
                    root = bantu.getLeftNode();
                } else if (bantu.getLeftNode() == null) {
                    root = bantu.getRightNode();
                } else {
                    // simpul bantu punya 2 anak
                    TreeNode predeccessor = getPredecessor(bantu);
                    TreeNode parentPrede = getParent(predeccessor);
                    bantu = predeccessor;

                    if (parentPrede != bantu) {
                        if (predeccessor.getLeftNode() != null) {
                            parentPrede.setRightNode(predeccessor.getLeftNode());
                        } else {
                            parentPrede.setRightNode(null);
                        }
                    } else {
                        bantu.setLeftNode(predeccessor.getLeftNode());
                    }

                }
                return true;
            }
            else {

                TreeNode parent = getParent(key);
                if (key.getHarga() < parent.getHarga()){
                    if (bantu.isLeaf()){
                        parent.setLeftNode(null);
                    } else if (bantu.getRightNode() == null){
                        parent.setLeftNode(bantu.getLeftNode());
                    } else if (bantu.getLeftNode() == null){
                        parent.setLeftNode(bantu.getRightNode());
                    } else {
                        // simpul bantu punya 2 anak
                        TreeNode predeccessor = getPredecessor(bantu);
                        TreeNode parentPrede = getParent(predeccessor);
                        bantu = predeccessor;

                        if (parentPrede != bantu) {
                            if (predeccessor.getLeftNode() != null) {
                                parentPrede.setRightNode(predeccessor.getLeftNode());
                            } else {
                                parentPrede.setRightNode(null);
                            }
                        } else {
                            bantu.setLeftNode(predeccessor.getLeftNode());
                        }
                    }
                }
                else {
                    if (bantu.isLeaf()){
                        parent.setRightNode(null);
                    } else if (bantu.getRightNode() == null){
                        parent.setRightNode(bantu.getLeftNode());
                    } else if (bantu.getLeftNode() == null){
                        parent.setRightNode(bantu.getRightNode());
                    } else {
                        // simpul bantu punya 2 anak
                        TreeNode predeccessor = getPredecessor(bantu);
                        TreeNode parentPrede = getParent(predeccessor);
                        bantu = predeccessor;

                        if (parentPrede != bantu) {
                            if (predeccessor.getLeftNode() != null) {
                                parentPrede.setRightNode(predeccessor.getLeftNode());
                            } else {
                                parentPrede.setRightNode(null);
                            }
                        } else {
                            bantu.setLeftNode(predeccessor.getLeftNode());
                        }
                    }
                }
                return true;
            }


        }

    }
    public void getNodeByName(String name){

        boolean cek = true;
        while (cek==true){
            TreeNode bantu = getNodeByName(name, root);
            if (bantu!=null){
                nodes.add(bantu);
            } else {
                cek = false;
            }
        }

    }
    public TreeNode getNodeByName(String targetName, TreeNode currentNode) {
        String[] getName = null;

        try {
            getName = currentNode.getNamaItem().split("\\s+");
        } catch (NullPointerException e) {
            return null;
        }
        if (currentNode == null) {
            return null;
        }
        for (String cek : getName) {

            if (cek.equalsIgnoreCase(targetName)&&currentNode.isVisited()==false){
                currentNode.setVisited(true);
                return currentNode;
            }
        }
        TreeNode leftResult = getNodeByName(targetName, currentNode.getLeftNode());
        if (leftResult != null) {
            return leftResult;
        }

        TreeNode rightResult = getNodeByName(targetName, currentNode.getRightNode());
        return rightResult;


    }
    public void getNodeByPrice(double harga){
        boolean cek = true;
        while (cek==true){
            TreeNode bantu = getNodeByPrice(harga, root);
            if (bantu!=null){
                nodes.add(bantu);
            } else {
                cek = false;
            }
        }
    }

    public TreeNode getNodeByPrice(double harga, TreeNode currentNode) {
        if (currentNode == null) {
            return null;
        }
        if (currentNode.getHarga() <= harga && currentNode.isVisited()==false){
            currentNode.setVisited(true);
            return currentNode;
        }

        TreeNode leftResult = Tree.this.getNodeByPrice(harga, currentNode.getLeftNode());
        if (leftResult != null) {
            return leftResult;
        }

        TreeNode rightResult = Tree.this.getNodeByPrice(harga, currentNode.getRightNode());
        return rightResult;


    }

    public void reset() {
        setVisitedFalse(root);
    }

    public void setVisitedFalse(TreeNode node){

        if (node!=null){
            node.setVisited(false);
            setVisitedFalse(node.getLeftNode());
            setVisitedFalse(node.getRightNode());
        }
    }
    public TreeNode getnode(){
        return getnode(root, root);
    }

    public TreeNode getnode(TreeNode node, TreeNode currentNode) {
        if (currentNode == null) {
            return null;
        }
        if (currentNode.isVisited()==false){
            currentNode.setVisited(true);
            return currentNode;
        }

        TreeNode leftResult = getnode(node, currentNode.getLeftNode());
        if (leftResult != null) {
            return leftResult;
        }

        TreeNode rightResult = getnode(node, currentNode.getRightNode());
        return rightResult;


    }




}

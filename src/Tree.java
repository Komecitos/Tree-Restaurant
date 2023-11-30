public class Tree {

    TreeNode root;

    Tree() {

    }
    public void foodDisplay() {
        foodDisplayHelper(root);
        System.out.println();
    }

    public void foodDisplayHelper(TreeNode node){

        if (node!=null){
            if (node.getJenis().equals("Makanan")){
                System.out.print(node.getNamaItem() +" ");
            }
            foodDisplayHelper(node.getLeftNode());
            foodDisplayHelper(node.getRightNode());
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

        return getNode(root, targetValue);
    }

    private TreeNode getNode(TreeNode currentNode, TreeNode targetValue) {
        if (currentNode == null) {
            return null;
        }

        if (currentNode.getNamaItem().equals(targetValue.getNamaItem())) {
            return currentNode;
        } else if (targetValue.getHarga() < currentNode.getHarga()) {
            return getNode(currentNode.getLeftNode(), targetValue);
        } else {
            return getNode(currentNode.getRightNode(), targetValue);
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
                if (bantu.getNamaItem().equals(bantu.getNamaItem())) {
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
//
//                TreeNode parent = getParent(key);
//                if (key< parent.data){
//                    if (bantu.isLeaf()){
//                        parent.setLeftNode(null);
//                    } else if (bantu.getRightNode() == null){
//                        parent.setLeftNode(bantu.getLeftNode());
//                    } else if (bantu.getLeftNode() == null){
//                        parent.setLeftNode(bantu.getRightNode());
//                    } else {
//                        // simpul bantu punya 2 anak
//                        TreeNode predeccessor = getPredecessor(bantu);
//                        TreeNode parentPrede = getParent(predeccessor.data);
//                        bantu.data = predeccessor.data;
//
//                        if (parentPrede != bantu) {
//                            if (predeccessor.getLeftNode() != null) {
//                                parentPrede.setRightNode(predeccessor.getLeftNode());
//                            } else {
//                                parentPrede.setRightNode(null);
//                            }
//                        } else {
//                            bantu.setLeftNode(predeccessor.getLeftNode());
//                        }
//                    }
//                }
//                else {
//                    if (bantu.isLeaf()){
//                        parent.setRightNode(null);
//                    } else if (bantu.getRightNode() == null){
//                        parent.setRightNode(bantu.getLeftNode());
//                    } else if (bantu.getLeftNode() == null){
//                        parent.setRightNode(bantu.getRightNode());
//                    } else {
//                        // simpul bantu punya 2 anak
//                        TreeNode predeccessor = getPredecessor(bantu);
//                        TreeNode parentPrede = getParent(predeccessor.data);
//                        bantu.data = predeccessor.data;
//
//                        if (parentPrede != bantu) {
//                            if (predeccessor.getLeftNode() != null) {
//                                parentPrede.setRightNode(predeccessor.getLeftNode());
//                            } else {
//                                parentPrede.setRightNode(null);
//                            }
//                        } else {
//                            bantu.setLeftNode(predeccessor.getLeftNode());
//                        }
//                    }
//                }
//                return true;
            }


        }
        return false;

    }
    public TreeNode getnodeName(String targetName, TreeNode currentNode) {
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
        TreeNode leftResult = getnodeName(targetName, currentNode.getLeftNode());
        if (leftResult != null) {
            return leftResult;
        }

        TreeNode rightResult = getnodeName(targetName, currentNode.getRightNode());
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

}

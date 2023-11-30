public class TreeNode {

    private String namaItem;
    private String jenis;
    private double harga;
    private TreeNode leftNode;
    private TreeNode rightNode;
    private boolean isVisited;
    TreeNode(String namaItem, String jenis, double harga) {

        this.setNamaItem(namaItem);
        this.setJenis(jenis);
        this.setHarga(harga);
        this.setVisited(false);

        setLeftNode(null);
        setRightNode(null);


    }
    TreeNode (String namaItem){
        this.setNamaItem(namaItem);
        this.setNamaItem(getNamaItem());
    }

    public boolean isLeaf () {
        if (getLeftNode() ==null & getRightNode() ==null){
            return true;
        } else {
            return false;
        }
    }

    public String getNamaItem() {
        return namaItem;
    }

    public void setNamaItem(String namaItem) {
        this.namaItem = namaItem;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }
}

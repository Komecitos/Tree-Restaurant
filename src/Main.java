public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        // MAKANAN
        tree.add(new TreeNode("Menu", "null", 50000));
        tree.add(new TreeNode("Chicken Bbq Grill", "Makanan", 43000));
        tree.add(new TreeNode("Wagyu", "Makanan", 121000));
        tree.add(new TreeNode("Rib Eye Import", "Makanan", 104000));
        tree.add(new TreeNode("Sirloin Import", "Makanan", 98000));
        tree.add(new TreeNode("Blackpepper", "Makanan", 46000));
        tree.add(new TreeNode("Chicken Double Cheese Sauce ", "Makanan", 45000));
        tree.add(new TreeNode("Sirloin Cheese Sauce", "Makanan", 30000));
        tree.add(new TreeNode("Chicken Rice", "Makanan", 35000));
        tree.add(new TreeNode("Chicken Salad", "Makanan", 29000));
        tree.add(new TreeNode("Chicken Steak", "Makanan", 44000));

        // MINUMAN
        tree.add(new TreeNode("MilkShake Vanilla", "Minuman", 22000));
        tree.add(new TreeNode("MilkShake Mocca", "Minuman", 23000));
        tree.add(new TreeNode("Orange Float", "Minuman", 24000));
        tree.add(new TreeNode("Caramel Machiato", "Minuman", 27000));
        tree.add(new TreeNode("Lemon Tea", "Minuman", 19000));
//
//        // SNACK
        tree.add(new TreeNode("Kentang Lokal", "Snack", 11000));
        tree.add(new TreeNode("Cheese Fries", "Snack", 19000));
        tree.add(new TreeNode("Fries", "Snack", 13000));
        tree.add(new TreeNode("Drum And Chips", "Snack", 26000));
        tree.add(new TreeNode("Cheese Wedges", "Snack", 17000));

        boolean a = true;

        try {
            while (a == true) {

                TreeNode hasil = tree.getnodeName("Cheese", tree.root);
                if (hasil != null) {
                    System.out.println(hasil.getNamaItem());
                } else {
                    a = false;
                }

            }
        } catch (Exception e){

        }

        tree.reset();



    }

    }


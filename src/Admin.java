import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.LinkedList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class Admin extends javax.swing.JFrame {

    Tree tree = new Tree();
    LinkedList<TreeNode> list;
    
    public Admin() {
        initComponents();
        // MAKANAN
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
        
        tree.add(new TreeNode("Kentang Lokal", "Snack", 11000));
        tree.add(new TreeNode("Cheese Fries", "Snack", 19000));
        tree.add(new TreeNode("Fries", "Snack", 13000));
        tree.add(new TreeNode("Drum And Chips", "Snack", 26000));
        tree.add(new TreeNode("Cheese Wedges", "Snack", 17000));
        
        cekDisplay.setText("All");
        cekDisplay.setVisible(false);
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - this.getWidth()) / 2;
        int y = (screenSize.height - this.getHeight()) / 2;
        this.setLocation(x, y);
        
        display();
        
       
    }
    public void display(){
        
        TreeNode[] array = new TreeNode[50];
        boolean a = true;
        while (a == true) {
             TreeNode hasil = tree.getnode();
            if (hasil != null) {
                Object[] data = {hasil.getNamaItem(), hasil.getHarga(), hasil.getJenis()};
                DefaultTableModel model = (DefaultTableModel) tabel.getModel();
                model.addRow(data);
            } else {
                a = false;
            }
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        namaText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        hargaText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jenisText = new javax.swing.JComboBox<>();
        cekDisplay = new javax.swing.JLabel();

        jLabel2.setText("Add Data");

        jButton8.setBackground(new java.awt.Color(252, 249, 181));
        jButton8.setFont(new java.awt.Font("Bookman Old Style", 2, 12)); // NOI18N
        jButton8.setText("add");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jButton4.setBackground(new java.awt.Color(252, 249, 181));
        jButton4.setFont(new java.awt.Font("Bookman Old Style", 2, 12)); // NOI18N
        jButton4.setText("Display");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        remove.setBackground(new java.awt.Color(252, 249, 181));
        remove.setFont(new java.awt.Font("Bookman Old Style", 2, 12)); // NOI18N
        remove.setText("Remove");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        addButton.setBackground(new java.awt.Color(252, 249, 181));
        addButton.setFont(new java.awt.Font("Bookman Old Style", 2, 12)); // NOI18N
        addButton.setText("add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(addButton)
                .addGap(38, 38, 38)
                .addComponent(remove)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(remove, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "Harga", "Jenis"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabel);
        if (tabel.getColumnModel().getColumnCount() > 0) {
            tabel.getColumnModel().getColumn(0).setResizable(false);
            tabel.getColumnModel().getColumn(1).setResizable(false);
            tabel.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel3.setBackground(new java.awt.Color(252, 249, 181));
        jPanel3.setPreferredSize(new java.awt.Dimension(0, 2));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        namaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaTextActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Jenis:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Harga:");

        jenisText.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Minuman", "Snack" }));

        cekDisplay.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cekDisplay.setForeground(new java.awt.Color(255, 255, 255));
        cekDisplay.setText("Display active : ");
        cekDisplay.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 829, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cekDisplay)
                        .addGap(182, 182, 182))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hargaText)
                            .addComponent(namaText)
                            .addComponent(jenisText, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(namaText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jenisText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(hargaText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cekDisplay)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tabel.getModel();
        String nama = null;
        String jenis = null;
        double harga ;
        
        try {
        nama = namaText.getText();
        jenis = (String) jenisText.getSelectedItem();
        harga = Double.parseDouble(hargaText.getText());
        tree.add(new TreeNode(nama, jenis, harga));
        
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Terdapat bagian kosong \n"
                    + "Atau kesalahan format input", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
        
        int rowCount = model.getRowCount();
            if (rowCount > 0) {
                model.setRowCount(0);
            }
        
        if (jenis.equals(cekDisplay.getText())){
            if (cekDisplay.getText().equals("Makanan")) {
                tree.foodDisplay();
                list = tree.nodes;

                while (list.size() != 0) {

                    TreeNode node = list.pop();
                    Object[] data = {node.getNamaItem(), node.getHarga(), node.getJenis()};
                    model = (DefaultTableModel) tabel.getModel();
                    model.addRow(data);

                }
            } else if (cekDisplay.getText().equals("Minuman")) {
                tree.drinkDisplay();
                list = tree.nodes;

                while (list.size() != 0) {

                    TreeNode node = list.pop();
                    Object[] data = {node.getNamaItem(), node.getHarga(), node.getJenis()};
                    model = (DefaultTableModel) tabel.getModel();
                    model.addRow(data);

                }
            } else if (cekDisplay.getText().equals("Snack")) {
                tree.snacksDisplay();
                list = tree.nodes;

                while (list.size() != 0) {

                    TreeNode node = list.pop();
                    Object[] data = {node.getNamaItem(), node.getHarga(), node.getJenis()};
                    model = (DefaultTableModel) tabel.getModel();
                    model.addRow(data);

                }
            } else if (cekDisplay.getText().equals("All")) {
                tree.display();
                list = tree.nodes;

                while (list.size() != 0) {

                    TreeNode node = list.pop();
                    Object[] data = {node.getNamaItem(), node.getHarga(), node.getJenis()};
                    model = (DefaultTableModel) tabel.getModel();
                    model.addRow(data);

                }
            } 
        } else {
            tree.display();
                list = tree.nodes;

                while (list.size() != 0) {

                    TreeNode node = list.pop();
                    Object[] data = {node.getNamaItem(), node.getHarga(), node.getJenis()};
                    model = (DefaultTableModel) tabel.getModel();
                    model.addRow(data);

                }
        }
        
        
        
       
        
        
    }//GEN-LAST:event_addButtonActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        // TODO add your handling code here:
        int row = 0;

        try {
            DefaultTableModel model = (DefaultTableModel) tabel.getModel();
            row = tabel.getSelectedRow();

            String nama = (String) tabel.getValueAt(row, 0);
            double harga = (double) tabel.getValueAt(row, 1);
            String jenis = (String) tabel.getValueAt(row, 2);

            tree.remove(new TreeNode(nama, jenis, harga));

            int rowCount = model.getRowCount();
            if (rowCount > 0) {
                model.setRowCount(0);
            }
            
            if (cekDisplay.getText().equals("Makanan")) {
                tree.foodDisplay();
                list = tree.nodes;

                while (list.size() != 0) {

                    TreeNode node = list.pop();
                    Object[] data = {node.getNamaItem(), node.getHarga(), node.getJenis()};
                    model = (DefaultTableModel) tabel.getModel();
                    model.addRow(data);

                }
            } else if (cekDisplay.getText().equals("Minuman")) {
                tree.drinkDisplay();
                list = tree.nodes;

                while (list.size() != 0) {

                    TreeNode node = list.pop();
                    Object[] data = {node.getNamaItem(), node.getHarga(), node.getJenis()};
                    model = (DefaultTableModel) tabel.getModel();
                    model.addRow(data);

                }
            } else if (cekDisplay.getText().equals("Snack")) {
                tree.snacksDisplay();
                list = tree.nodes;

                while (list.size() != 0) {

                    TreeNode node = list.pop();
                    Object[] data = {node.getNamaItem(), node.getHarga(), node.getJenis()};
                    model = (DefaultTableModel) tabel.getModel();
                    model.addRow(data);

                }
            } else if (cekDisplay.getText().equals("All")) {
                tree.display();
                list = tree.nodes;

                while (list.size() != 0) {

                    TreeNode node = list.pop();
                    Object[] data = {node.getNamaItem(), node.getHarga(), node.getJenis()};
                    model = (DefaultTableModel) tabel.getModel();
                    model.addRow(data);

                }
            } 

            

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Tidak ada kolom terpilih");
        } catch (ArrayIndexOutOfBoundsException e) {

        }
        
       
    }//GEN-LAST:event_removeActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void namaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaTextActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String[] jenis = {"Makanan", "Minuman", "Cemilan", "Semua jenis"};
        int hasil = JOptionPane.showOptionDialog(null, "Pilih jenis :", "Option Dialog", JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE, null, jenis, jenis[0]);

        if (hasil == JOptionPane.YES_OPTION) {
             
            cekDisplay.setText("Makanan");
            DefaultTableModel model = (DefaultTableModel) tabel.getModel();
            int rowCount = model.getRowCount();
            if (rowCount > 0) {
                model.setRowCount(0);
            };

            tree.foodDisplay();
            list = tree.nodes;

            while (list.size() != 0) {

                TreeNode node = list.pop();
                Object[] data = {node.getNamaItem(), node.getHarga(), node.getJenis()};
                model = (DefaultTableModel) tabel.getModel();
                model.addRow(data);

            }

        } else if (hasil == JOptionPane.NO_OPTION) {

            cekDisplay.setText("Minuman");
            DefaultTableModel model = (DefaultTableModel) tabel.getModel();
            int rowCount = model.getRowCount();
            if (rowCount > 0) {
                model.setRowCount(0);
            };

            tree.drinkDisplay();
            list = tree.nodes;

            while (list.size() != 0) {

                TreeNode node = list.pop();
//                System.out.println(node.getNamaItem());
                Object[] data = {node.getNamaItem(), node.getHarga(), node.getJenis()};
                model = (DefaultTableModel) tabel.getModel();
                model.addRow(data);

            }

        } else if (hasil == JOptionPane.CANCEL_OPTION) {

            cekDisplay.setText("Snack");
            DefaultTableModel model = (DefaultTableModel) tabel.getModel();
            int rowCount = model.getRowCount();
            if (rowCount > 0) {
                model.setRowCount(0);
            };

            tree.snacksDisplay();
            list = tree.nodes;

            while (list.size() != 0) {

                TreeNode node = list.pop();
//                System.out.println(node.getNamaItem());
                Object[] data = {node.getNamaItem(), node.getHarga(), node.getJenis()};
                model = (DefaultTableModel) tabel.getModel();
                model.addRow(data);

            }
        } else {
            
            cekDisplay.setText("All");
            DefaultTableModel model = (DefaultTableModel) tabel.getModel();
            int rowCount = model.getRowCount();
            if (rowCount > 0) {
                model.setRowCount(0);
            };

            tree.display();
            list = tree.nodes;

            while (list.size() != 0) {

                TreeNode node = list.pop();
//                System.out.println(node.getNamaItem());
                Object[] data = {node.getNamaItem(), node.getHarga(), node.getJenis()};
                model = (DefaultTableModel) tabel.getModel();
                model.addRow(data);

            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel cekDisplay;
    private javax.swing.JTextField hargaText;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jenisText;
    private javax.swing.JTextField namaText;
    private javax.swing.JButton remove;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}

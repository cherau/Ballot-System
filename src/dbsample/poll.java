package dbsample;
import java.sql.*;
import javax.swing.JOptionPane;

public class poll extends javax.swing.JFrame {

    /**
     * Creates new form poll
     */
    public poll() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        g1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        bjp = new javax.swing.JRadioButton();
        dmk = new javax.swing.JRadioButton();
        bsp = new javax.swing.JRadioButton();
        aap = new javax.swing.JRadioButton();
        aitc = new javax.swing.JRadioButton();
        inc = new javax.swing.JRadioButton();
        aidmk = new javax.swing.JRadioButton();
        ss = new javax.swing.JRadioButton();
        cpi = new javax.swing.JRadioButton();
        ncp = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("VOTE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        g1.add(bjp);
        bjp.setText("BJP");
        bjp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bjpActionPerformed(evt);
            }
        });

        g1.add(dmk);
        dmk.setText("DMK");

        g1.add(bsp);
        bsp.setText("BSP");

        g1.add(aap);
        aap.setText("AAP");

        g1.add(aitc);
        aitc.setText("AITC");

        g1.add(inc);
        inc.setText("INC");
        inc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incActionPerformed(evt);
            }
        });

        g1.add(aidmk);
        aidmk.setText("AIDMK");

        g1.add(ss);
        ss.setText("SS");

        g1.add(cpi);
        cpi.setText("CPI");
        cpi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpiActionPerformed(evt);
            }
        });

        g1.add(ncp);
        ncp.setText("NCP");

        jLabel1.setText("CAST YOUR VOTE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dmk, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bjp, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(aap)
                                    .addComponent(aitc))
                                .addGap(213, 213, 213))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bsp)
                                .addGap(86, 86, 86)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ss)
                            .addComponent(cpi)
                            .addComponent(inc)
                            .addComponent(ncp)
                            .addComponent(aidmk))
                        .addGap(42, 42, 42))))
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bjp)
                    .addComponent(inc))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dmk)
                    .addComponent(ss))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpi)
                    .addComponent(bsp))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ncp)
                    .addComponent(aap))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aitc)
                    .addComponent(aidmk))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String s3=""; 
        if(bjp.isSelected())
              s3+="bjp";
        else if(inc.isSelected())
            s3+="inc";
        else if(dmk.isSelected())
            s3+="dmk";
        else if(aap.isSelected())
            s3+="aap";
        else if(cpi.isSelected())
            s3+="cpi";
        else if(ss.isSelected())
            s3+="ss";
        else if(aidmk.isSelected())
            s3+="aidmk";
        else if(ncp.isSelected())
            s3+="ncp";
        else if(aitc.isSelected())
            s3+="aitc";
        else if(bsp.isSelected())
            s3+="bsp";
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/log","cherau","12345678");
      PreparedStatement ps=con.prepareStatement("select * from votes where party=?");
        ps.setString(1, s3);
        ResultSet rs=ps.executeQuery();
        if(rs.next())
            {
                int v= Integer.parseInt(rs.getString(2));
               v++;
             PreparedStatement ps1=con.prepareStatement("update votes set votes=? where party=?");
                 ps1.setInt(1,v);
           ps1.setString(2,s3);
           if(ps1.executeUpdate()>0)      
               JOptionPane.showMessageDialog(rootPane, "Success");
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Failure");
            }
              con.close();     
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
                  poll.this.setVisible(false);
               
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cpiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpiActionPerformed

    private void incActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_incActionPerformed

    private void bjpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bjpActionPerformed
        // TODO add your handling code here:
        

    }//GEN-LAST:event_bjpActionPerformed

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
            java.util.logging.Logger.getLogger(poll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(poll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(poll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(poll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new poll().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton aap;
    private javax.swing.JRadioButton aidmk;
    private javax.swing.JRadioButton aitc;
    private javax.swing.JRadioButton bjp;
    private javax.swing.JRadioButton bsp;
    private javax.swing.JRadioButton cpi;
    private javax.swing.JRadioButton dmk;
    private javax.swing.ButtonGroup g1;
    private javax.swing.JRadioButton inc;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton ncp;
    private javax.swing.JRadioButton ss;
    // End of variables declaration//GEN-END:variables
}

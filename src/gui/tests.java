
package gui;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
public class tests extends javax.swing.JFrame implements ActionListener {
    Label l11 = new Label("Test name");
    Label l12= new Label("Test id ");
    Label l13= new Label("Test date");
    Label l14= new Label("Test time ");
    Label l15= new Label("Test result ");
    Label l16= new Label("patient page ");
    
    TextField t8=new TextField();
    TextField t9=new TextField();
    TextField t10=new TextField();
    TextField t11=new TextField();
    TextField t12=new TextField();
    
      Button b14=new Button("Update");
    Button b15=new Button("Insert");
    Button b16=new Button("Delete");
    Button b17=new Button("Search");
    Button b18=new Button("Exit");
   
    public tests() {
        initComponents();
  
    l11.setBounds(30, 120, 80, 70);
     add(l11);
   
    t8.setBounds(140, 140, 150, 30);
     add(t8);
    
     
    l12.setBounds(30, 190, 80, 70);
     add(l12);
    
  
    t9.setBounds(140, 210,150 , 30);
     add(t9); 
    
  
   l13.setBounds(30, 260, 120, 70); 
    add(l13);
  
   t10.setBounds(150, 280, 150, 30);
    add(t10);
    
    
    l14.setBounds(30, 330, 140, 70);
    add(l14);
    
    
    t11.setBounds(180, 350, 150, 30);
    add(t11);
    
    
    l15.setBounds(30, 400, 120, 70);
     add(l15);
    
    t12.setBounds(150, 420, 150, 30);    
      add(t12);
 
    
    b14.setBounds(30,500 , 60, 40);
    add(b14);
    
    
    b15.setBounds(120, 500, 60, 40);
    add(b15);
    
    
    b16.setBounds(210, 500, 60, 40);
    add(b16);
    
  
    b17.setBounds(300, 500, 60, 40);
      add(b17);
    
   
    b18.setBounds(390, 500, 60, 40);
     add(b18);
     
    b18.addActionListener(this); 
    
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(150, 50, 150, 150));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 441, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(tests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tests().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==b18){
        System.exit(0);}    
            
    
    }
    
}

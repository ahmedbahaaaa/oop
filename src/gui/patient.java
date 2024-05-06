
package gui;


import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;




public class patient extends javax.swing.JFrame implements ActionListener {
     DefaultTableModel model;
    Connection con;
    Statement stmt;
    ResultSet rs;
    
    Label l6= new Label("patient name");
    Label l7= new Label("patient ssn");
    Label l8= new Label("Date admitted");
    Label l9= new Label("Date checked out");
    Label l10= new Label("Patient insurance");
    
    TextField t3=new TextField();
    TextField t4=new TextField();
    TextField t5=new TextField();
    TextField t6=new TextField();
    TextField t7=new TextField();
    
    Button b9=new Button("Update");
    Button b10=new Button("Insert");
    Button b11=new Button("Delete");
    Button b12=new Button("Search");
    Button b13=new Button("back");
    
     public void connecttosql(){
      model = new DefaultTableModel();
      model.addColumn("patient_SSN");
      model.addColumn("patient_name");
      model.addColumn("insurance");
      model.addColumn("date_admitted_in");
      model.addColumn("date_checkedout");

     jTable2.setModel(model);
     
     String path="jdbc:sqlserver://localhost:1433;databaseName=hospital";
     String user="bahaa";
     String pass="123456";
     
     try{
      con= DriverManager.getConnection(path, user, pass);
      stmt=con.createStatement();
      rs=stmt.executeQuery("Select * from patient");
      
      while(rs.next())  {
          model.addRow(new Object[]{rs.getString("patient_SSN"),rs.getString("patient_name"),rs.getString("insurance"),rs.getString("date_admitted_in"),rs.getString("date_checkedout")});
     }
     }catch(SQLException e){
     JOptionPane.showMessageDialog(this,e.getMessage());
     
     }
       }
    
    
    
    
    
    
    
    
    
    public patient() {
        initComponents();
       
        setBackground(Color.CYAN);
        
    l6.setBounds(30, 120, 80, 70);
     add(l6);
    
   
    t3.setBounds(140, 140, 150, 30);
     add(t3);
    
     
    l7.setBounds(30, 190, 80, 70);
     add(l7);
    
    
    t4.setBounds(140, 210,150 , 30);
     add(t4);
    
   
    l10.setBounds(30, 260, 120, 70);   
     add(l10);
    
   
    t5.setBounds(150, 280, 150, 30);
     add(t5);
    
    
    l8.setBounds(30, 330, 140, 70);
      add(l8);
      
    t6.setBounds(180, 350, 150, 30);
      add(t6);
    
    
    l9.setBounds(30, 400, 120, 70);
     add(l9);
    
    
    t7.setBounds(150, 420, 150, 30); 
     add(t7);
    
   
    b9.setBounds(30,500 , 60, 40);
     add(b9);
    
    
    b10.setBounds(120, 500, 60, 40);
     add(b10);
    
    
    b11.setBounds(210, 500, 60, 40);
     add(b11);
    
    
    b12.setBounds(300, 500, 60, 40);
     add(b12);
    
 
    b13.setBounds(400, 500, 60, 40);
     add(b13);
         connecttosql();

      b13.addActionListener(this); 
      b10.addActionListener(this);
      b11.addActionListener(this);
      b9.addActionListener(this);
      b12.addActionListener(this);
    
      setSize(1100,700);
        setVisible(true);

        setLayout(new BorderLayout());

           JLabel background=new JLabel(new ImageIcon("D:\\OneDrive\\Desktop\\hero_image.png"));


        add(background);

        background.setLayout(new FlowLayout());
    }
      
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(150, 50, 400, 400));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 483, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


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
            java.util.logging.Logger.getLogger(patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
              public void run() {
                new patient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
   if(e.getSource()==b13){
         Hospital5 v1= new Hospital5();
         v1.show();
         dispose();}
    //*************************insert button 
         if (e.getSource()==b10){
         int patient_SSN = Integer.parseInt(t4.getText());
         String patient_name= t3.getText();
         String insurance=t5.getText();
         String date_admitted_in=t6.getText();
           String date_checkedout=t7.getText();
         String query="insert into patient values("+patient_SSN+",'"+patient_name+"','"+insurance+"','"+date_admitted_in+"','"+date_checkedout+"')"  ;
         try{
             stmt.executeUpdate(query);
         }catch(SQLException ex){
          Logger.getLogger(patient.class.getName()).log(Level.SEVERE, null, ex);
         }
          connecttosql();
         }
    //delete button*********
         if (e.getSource()==b11){
          int index=jTable2.getSelectedRow();
          int patient_SSN =Integer.parseInt(t4.getText());
        

           String query="Delete from patient where patient_SSN ="+patient_SSN+";";
        try{
         stmt.executeUpdate(query);//run query in sql//
         } catch(SQLException ex){
          Logger.getLogger(patient.class.getName()).log(Level.SEVERE, null, ex);
            model.removeRow(index);
         } 
         connecttosql();
         }
   // update button *********
      if(e.getSource()==b9){
         int patient_SSN =Integer.parseInt(t4.getText());
         String patient_name= t3.getText();
         String insurance=t5.getText();
         String date_admitted_in=t6.getText();
         String date_checkedout =t7.getText();

       
         String query="update patient set patient_name='"+patient_name+"',insurance='"+insurance+"',date_admitted_in='"+date_admitted_in+"',date_checkedout='"+date_checkedout+"' where patient_SSN ="+patient_SSN;
         try{
          stmt.executeUpdate(query); //run query in sql
          
         } catch(SQLException ex){
              Logger.getLogger(patient.class.getName()).log(Level.SEVERE, null, ex);
         }
         connecttosql();
         }
         //**************************
         if(e.getSource()==b12){
         model = new DefaultTableModel();
      model.addColumn("patient_SSN");
      model.addColumn("patient_name");
      model.addColumn("insurance");
      model.addColumn("date_admitted_in");
      model.addColumn("date_checkedout");

     jTable2.setModel(model);
    
     
     String path="jdbc:sqlserver://localhost:1433;databaseName=hospital";
     String user="bahaa";
     String pass="123456";
       int patient_SSN = Integer.parseInt(t4.getText());
     
     try{
      con= DriverManager.getConnection(path, user, pass);
      stmt=con.createStatement();
      rs=stmt.executeQuery("Select * from patient where patient_SSN = "+patient_SSN);
      
      while(rs.next())  {
                 model.addRow(new Object[]{rs.getString("patient_SSN"),rs.getString("patient_name"),rs.getString("insurance"),rs.getString("date_admitted_in"),rs.getString("date_checkedout")});

     }
     }catch(SQLException ex){
     JOptionPane.showMessageDialog(this,ex.getMessage());
     
     }
         }
         
   
   
   
   
   
   
    }
}

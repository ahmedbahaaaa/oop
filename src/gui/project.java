
package gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.FlowLayout;

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


public class project extends javax.swing.JFrame implements ActionListener{
     
    DefaultTableModel model;
    Connection con;
    Statement stmt;
    ResultSet rs;
        Label l2= new Label("Doctor name");
    Label l3= new Label("Doctor ssn");
    Label l4= new Label("Doctor spealization");
    Label l5= new Label("Doctor page  ");
    Button b4=new Button("Update");
    Button b5=new Button("Insert");
    Button b6=new Button("Delete");
    Button b7=new Button("Search");
    Button b8=new Button("Back");
    TextField t1=new TextField();
    TextField t2=new TextField();
    Choice c1=new Choice();
    
    
        
       public void connecttosql(){
      model = new DefaultTableModel();
      model.addColumn("doctor_SSN");
      model.addColumn("doctor_name");
      model.addColumn(" spealization ");
      
     TC.setModel(model);
     
     String path="jdbc:sqlserver://localhost:1433;databaseName=hospital";
     String user="bahaa";
     String pass="123456";
     
     try{
      con= DriverManager.getConnection(path, user, pass);
      stmt=con.createStatement();
      rs=stmt.executeQuery("Select * from doctor");
      
      while(rs.next())  {
          model.addRow(new Object[]{rs.getString("doctor_SSN"),rs.getString("doc_name"),rs.getString("specialization")});
     }
     }catch(SQLException e){
     JOptionPane.showMessageDialog(this,e.getMessage());
     
     }
       }
    

   

    public project() {
        initComponents();
        setBackground(Color.LIGHT_GRAY);
    
        l2.setBounds(30, 170, 80, 70);
        add(l2);
       
        t1.setBounds(140, 200, 150, 30);
        add(t1);
    
        l3.setBounds(30, 240, 80, 70);
                add(l3);

       t2. setBounds(140, 260,150 , 30);
            add(t2);

    
        l4.setBounds(30, 310, 120, 70);   
                add(l4);

       c1. setBounds(150, 330, 170, 70);
                add(c1);

        c1.add("Dentist");
        c1.add("Anatomy");
        c1.add("surgery");
        c1.add("Neurology");
    
       b4. setBounds(30,500 , 60, 40);
                add(b4);

    
        b5.setBounds(120, 500, 60, 40);
            add(b5);

       b6. setBounds(210, 500, 60, 40);
            add(b6);

        b7.setBounds(300, 500, 60, 40);
            add(b7);

       b8. setBounds(400, 500, 60, 40);
                add(b8);
         connecttosql();
        b8.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b4.addActionListener(this);
       b7.addActionListener(this);
       setSize(1100,700);
        setVisible(true);

        setLayout(new BorderLayout());

           JLabel background=new JLabel(new ImageIcon("D:\\OneDrive\\Desktop\\AI-bias_1_.jpg"));


        add(background);

        background.setLayout(new FlowLayout());
    }
      
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TC = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(150, 50, 150, 150));

        TC.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TC);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(386, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new project().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TC;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==b8){
        Hospital5 v1= new Hospital5();
         v1.show();
         dispose();
         }
             
         //*************************insert button 
         if (e.getSource()==b5){
         int doctor_ssn = Integer.parseInt(t2.getText());
         String doctor_name= t1.getText();
         String spealization=c1.getSelectedItem();
         String query="insert into doctor values("+doctor_ssn+",'"+doctor_name+"','"+spealization+"')"  ;
         try{
             stmt.executeUpdate(query);
         }catch(SQLException ex){
          Logger.getLogger(project.class.getName()).log(Level.SEVERE, null, ex);
         }
          connecttosql();
         }
         //delete button*********
         if (e.getSource()==b6){
          int index=TC.getSelectedRow();
          int doctor_SSN=Integer.parseInt(t2.getText());
        

           String query="Delete from doctor where doctor_SSN="+doctor_SSN+";";
        try{
         stmt.executeUpdate(query);//run query in sql//
         } catch(SQLException ex){
          Logger.getLogger(project.class.getName()).log(Level.SEVERE, null, ex);
            model.removeRow(index);
         } 
         connecttosql();
         }
         // update button *********
      if(e.getSource()==b4){
         int doctor_SSN=Integer.parseInt(t2.getText());
         String doctor_name= t1.getText();
         String specialization=c1.getSelectedItem();
          System.out.println(c1.getSelectedItem());
         String query="update doctor set doc_name='"+doctor_name+"',specialization='"+specialization+"' where doctor_SSN ="+doctor_SSN;
         try{
          stmt.executeUpdate(query); //run query in sql
          
         } catch(SQLException ex){
              Logger.getLogger(project.class.getName()).log(Level.SEVERE, null, ex);
         }
         connecttosql();
         }
         //serch**************************
         if(e.getSource()==b7){
         model = new DefaultTableModel();
      model.addColumn("doctor_SSN");
      model.addColumn("doctor_name");
      model.addColumn(" spealization ");
      
     TC.setModel(model);
     
     String path="jdbc:sqlserver://localhost:1433;databaseName=hospital";
     String user="bahaa";
     String pass="123456";
       int doctor_ssn = Integer.parseInt(t2.getText());
     
     try{
      con= DriverManager.getConnection(path, user, pass);
      stmt=con.createStatement();
      rs=stmt.executeQuery("Select * from doctor where doctor_SSN = "+doctor_ssn);
      
      while(rs.next())  {
          model.addRow(new Object[]{rs.getString("doctor_SSN"),rs.getString("doc_name"),rs.getString("specialization")});
     }
     }catch(SQLException ex){
     JOptionPane.showMessageDialog(this,ex.getMessage());
     
     }
         }
         
         
             
        
         
         }
    
}

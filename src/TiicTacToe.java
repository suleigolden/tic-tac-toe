
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SULEIGOLDEN
 */
public class TiicTacToe extends javax.swing.JFrame {
   
    /**
     * Creates new form TiicTacToe
     */
    
    private String GameStart = "P";
    private int computerMove =0, playerMover = 0;
    
    public TiicTacToe() {
        initComponents();
        StartGame();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        btn_1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });

        btn_2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });

        btn_3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });

        btn_6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });

        btn_5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });

        btn_4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });

        btn_9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });

        btn_7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });

        btn_8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 0, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Computer Player:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Human Player: ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tic Tac Toa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Menu");

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(0, 0, 153));
        jMenuItem1.setText("4x4 Board");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem2.setForeground(new java.awt.Color(0, 0, 153));
        jMenuItem2.setText("5x5 Board");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem3.setText("Reset");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setBackground(new java.awt.Color(0, 102, 102));
        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem4.setForeground(new java.awt.Color(204, 0, 0));
        jMenuItem4.setText("Exit Game");
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//Start Game Method
    public void StartGame(){
        setSize(300,300);
        setLocationRelativeTo(null);
       //set all the bottons background color to white
       btn_1.setBackground(Color.WHITE); btn_2.setBackground(Color.WHITE); btn_3.setBackground(Color.WHITE);
       btn_4.setBackground(Color.WHITE); btn_5.setBackground(Color.WHITE); btn_6.setBackground(Color.WHITE);
       btn_7.setBackground(Color.WHITE); btn_8.setBackground(Color.WHITE); btn_9.setBackground(Color.WHITE);
}
// Check the next move if is computer or player
   private void who_to_move(){
       if(GameStart.equalsIgnoreCase("P")){
           GameStart = "C";
           
       }else{
            GameStart = "P";
       }
       
   }
//Change the text of a button to C and the color Red if computer plays or move and change the text of a button to
//P and the color Blue if a player plays or move.
   private void changeMove(String move){
       switch(move){
           case "1":
               if(GameStart.equalsIgnoreCase("P")){
                    btn_1.setForeground(Color.BLUE);
                }else{
                    btn_1.setForeground(Color.RED);
                }
               break;
               case "2":
               if(GameStart.equalsIgnoreCase("P")){
                    btn_2.setForeground(Color.BLUE);
                }else{
                    btn_2.setForeground(Color.RED);
                }
               break;
               case "3":
               if(GameStart.equalsIgnoreCase("P")){
                    btn_3.setForeground(Color.BLUE);
                }else{
                    btn_3.setForeground(Color.RED);
                }
               break;
               case "4":
               if(GameStart.equalsIgnoreCase("P")){
                    btn_4.setForeground(Color.BLUE);
                }else{
                    btn_4.setForeground(Color.RED);
                }
               break;
               case "5":
               if(GameStart.equalsIgnoreCase("P")){
                    btn_5.setForeground(Color.BLUE);
                }else{
                    btn_5.setForeground(Color.RED);
                }
               break;
               case "6":
               if(GameStart.equalsIgnoreCase("P")){
                    btn_6.setForeground(Color.BLUE);
                }else{
                    btn_6.setForeground(Color.RED);
                }
               break;
               case "7":
               if(GameStart.equalsIgnoreCase("P")){
                    btn_7.setForeground(Color.BLUE);
                }else{
                    btn_7.setForeground(Color.RED);
                }
               break;
               case "8":
               if(GameStart.equalsIgnoreCase("P")){
                    btn_8.setForeground(Color.BLUE);
                }else{
                    btn_8.setForeground(Color.RED);
                }
               break;
               case "9":
               if(GameStart.equalsIgnoreCase("P")){
                    btn_9.setForeground(Color.BLUE);
                }else{
                    btn_9.setForeground(Color.RED);
                }
               break;
       }
        
        who_to_move();
        Check_i_win();
   }
   
   private void Check_i_win(){
       //Getting the Holizontal values of player move
       String H_1 = btn_1.getText();  String H_2 = btn_2.getText();  String H_3 = btn_3.getText();
       String H_4 = btn_4.getText();  String H_5 = btn_5.getText();  String H_6 = btn_6.getText();
       String H_7 = btn_7.getText();  String H_8 = btn_8.getText();  String H_9 = btn_9.getText();
       
       //Check the COMPUTER Top, Middle and Bottom Horizontal move to see if there is match in the row.
       //Display COMPUTER WINS if all the rows of Top or Middle or Bottom Horizontal are C (matches) 
       if(H_1 == "C" && H_2 == "C" && H_3 == "C"){
           btn_1.setBackground(Color.RED); btn_2.setBackground(Color.RED); btn_3.setBackground(Color.RED);
           btn_1.setForeground(Color.WHITE); btn_2.setForeground(Color.WHITE); btn_3.setForeground(Color.WHITE);
           popUpWhowin("COMPUTER WINS!");
       }else if(H_4 == "C" && H_5 == "C" && H_6 == "C"){
           btn_4.setBackground(Color.RED); btn_5.setBackground(Color.RED); btn_6.setBackground(Color.RED);
           btn_4.setForeground(Color.WHITE); btn_5.setForeground(Color.WHITE); btn_6.setForeground(Color.WHITE);
           popUpWhowin("COMPUTER WINS!");
       }else if(H_7 == "C" && H_8 == "C" && H_9 == "C"){
           btn_7.setBackground(Color.RED); btn_8.setBackground(Color.RED); btn_9.setBackground(Color.RED);
           btn_7.setForeground(Color.WHITE); btn_8.setForeground(Color.WHITE); btn_9.setForeground(Color.WHITE);
           popUpWhowin("COMPUTER WINS!");
       }
       //Check the PLAYER Top, Middle and Bottom Horizontal move to see if there is match in the row
       ////Display PLAYER WINS if all the rows of Top or Middle or Bottom Horizontal are P (matches)
       else if(H_1 == "P" && H_2 == "P" && H_3 == "P"){
           btn_1.setBackground(Color.BLUE); btn_2.setBackground(Color.BLUE); btn_3.setBackground(Color.BLUE);
           btn_1.setForeground(Color.WHITE); btn_2.setForeground(Color.WHITE); btn_3.setForeground(Color.WHITE);
           popUpWhowin("PLAYER WINS!");
       }else if(H_4 == "P" && H_5 == "P" && H_6 == "P"){
           btn_4.setBackground(Color.BLUE); btn_5.setBackground(Color.BLUE); btn_6.setBackground(Color.BLUE);
           btn_4.setForeground(Color.WHITE); btn_5.setForeground(Color.WHITE); btn_6.setForeground(Color.WHITE);
           popUpWhowin("PLAYER WINS!");
       }else if(H_7 == "P" && H_8 == "P" && H_9 == "P"){
           btn_7.setBackground(Color.BLUE); btn_8.setBackground(Color.BLUE); btn_9.setBackground(Color.BLUE);
           btn_7.setForeground(Color.WHITE); btn_8.setForeground(Color.WHITE); btn_9.setForeground(Color.WHITE);
           popUpWhowin("PLAYER WINS!");
       }
        //Check the COMPUTER Top, Middle and Bottom Vertical move to see if there is match in the row.
       //Display COMPUTER WINS if all the rows of Top or Middle or Bottom Horizontal are C (matches) 
       else if(H_1 == "C" && H_4 == "C" && H_7 == "C"){
           btn_1.setBackground(Color.RED); btn_4.setBackground(Color.RED); btn_7.setBackground(Color.RED);
           btn_1.setForeground(Color.WHITE); btn_4.setForeground(Color.WHITE); btn_7.setForeground(Color.WHITE);
           popUpWhowin("COMPUTER WINS!");
       }else if(H_2 == "C" && H_5 == "C" && H_8 == "C"){
           btn_2.setBackground(Color.RED); btn_5.setBackground(Color.RED); btn_8.setBackground(Color.RED);
           btn_2.setForeground(Color.WHITE); btn_5.setForeground(Color.WHITE); btn_8.setForeground(Color.WHITE);
           popUpWhowin("COMPUTER WINS!");
       }else if(H_3 == "C" && H_6 == "C" && H_9 == "C"){
           btn_3.setBackground(Color.RED); btn_6.setBackground(Color.RED); btn_9.setBackground(Color.RED);
           btn_3.setForeground(Color.WHITE); btn_6.setForeground(Color.WHITE); btn_9.setForeground(Color.WHITE);
           popUpWhowin("COMPUTER WINS!");
       }
        //Check the PLAYER Top, Middle and Bottom Vertical move to see if there is match in the row.
       //Display PLAYER WINS if all the rows of Top or Middle or Bottom Horizontal are C (matches) 
       else if(H_1 == "P" && H_4 == "P" && H_7 == "P"){
           btn_1.setBackground(Color.BLUE); btn_4.setBackground(Color.BLUE); btn_7.setBackground(Color.BLUE);
           btn_1.setForeground(Color.WHITE); btn_4.setForeground(Color.WHITE); btn_7.setForeground(Color.WHITE);
           popUpWhowin("PLAYER WINS!");
       }else if(H_2 == "P" && H_5 == "P" && H_8 == "P"){
           btn_2.setBackground(Color.BLUE); btn_5.setBackground(Color.BLUE); btn_8.setBackground(Color.BLUE);
           btn_2.setForeground(Color.WHITE); btn_5.setForeground(Color.WHITE); btn_8.setForeground(Color.WHITE);
           popUpWhowin("PLAYER WINS!");
       }else if(H_3 == "P" && H_6 == "P" && H_9 == "P"){
           btn_3.setBackground(Color.BLUE); btn_6.setBackground(Color.BLUE); btn_9.setBackground(Color.BLUE);
           btn_3.setForeground(Color.WHITE); btn_6.setForeground(Color.WHITE); btn_9.setForeground(Color.WHITE);
           popUpWhowin("PLAYER WINS!");
       }
       //Check the COMPUTER Cross (angle 45 degrees) play or move to see if there is match.
       //Display COMPUTER WINS if all the three bottons on angle 45 degrees from the Bottom left or right to Top, or
       //from the Top left or right to the Buttom are C (matches) 
       else if(H_1 == "C" && H_5 == "C" && H_9 == "C"){
           btn_1.setBackground(Color.RED); btn_5.setBackground(Color.RED); btn_9.setBackground(Color.RED);
           btn_1.setForeground(Color.WHITE); btn_5.setForeground(Color.WHITE); btn_9.setForeground(Color.WHITE);
           popUpWhowin("COMPUTER WINS!");
       }else if(H_3 == "C" && H_5 == "C" && H_7 == "C"){
           btn_3.setBackground(Color.RED); btn_5.setBackground(Color.RED); btn_7.setBackground(Color.RED);
           btn_3.setForeground(Color.WHITE); btn_5.setForeground(Color.WHITE); btn_7.setForeground(Color.WHITE);
           popUpWhowin("COMPUTER WINS!");
       }
       //Check the PLAYER Cross (angle 45 degrees) play or move to see if there is match.
       //Display PLAYER WINS if all the three bottons on angle 45 degrees from the Bottom left or right to Top, or
       //from the Top left or right to the Bottom are C (matches) 
       else if(H_1 == "P" && H_5 == "P" && H_9 == "P"){
           btn_1.setBackground(Color.BLUE); btn_5.setBackground(Color.BLUE); btn_9.setBackground(Color.BLUE);
           btn_1.setForeground(Color.WHITE); btn_5.setForeground(Color.WHITE); btn_9.setForeground(Color.WHITE);
           popUpWhowin("PLAYER WINS!");
       }else if(H_3 == "P" && H_5 == "P" && H_7 == "P"){
           btn_3.setBackground(Color.BLUE); btn_5.setBackground(Color.BLUE); btn_7.setBackground(Color.BLUE);
           btn_3.setForeground(Color.WHITE); btn_5.setForeground(Color.WHITE); btn_7.setForeground(Color.WHITE);
           popUpWhowin("PLAYER WINS!");
       }
   }
   
   //Display the player that win 
   private void popUpWhowin(String player){
        JOptionPane.showMessageDialog(this, player);
        ResetPlay();
   }
   //Reset Game Play 
   private void ResetPlay(){
       //Set all botton text to null
       btn_1.setText(""); btn_2.setText(""); btn_3.setText("");
       btn_4.setText(""); btn_5.setText(""); btn_6.setText("");
       btn_7.setText(""); btn_8.setText(""); btn_9.setText("");
       //set all the bottons background color to white
       btn_1.setBackground(Color.WHITE); btn_2.setBackground(Color.WHITE); btn_3.setBackground(Color.WHITE);
       btn_4.setBackground(Color.WHITE); btn_5.setBackground(Color.WHITE); btn_6.setBackground(Color.WHITE);
       btn_7.setBackground(Color.WHITE); btn_8.setBackground(Color.WHITE); btn_9.setBackground(Color.WHITE);
       //set all the bottons foreground color to white
       btn_1.setForeground(Color.WHITE); btn_2.setForeground(Color.WHITE); btn_3.setForeground(Color.WHITE);
       btn_4.setForeground(Color.WHITE); btn_5.setForeground(Color.WHITE); btn_6.setForeground(Color.WHITE);
       btn_7.setForeground(Color.WHITE); btn_8.setForeground(Color.WHITE); btn_9.setForeground(Color.WHITE);
   }

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        btn_4.setText(GameStart);
        changeMove("4");
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
         btn_9.setText(GameStart);
         changeMove("9");
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        btn_1.setText(GameStart);
        changeMove("1");
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
       btn_2.setText(GameStart);
       changeMove("2");
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
       btn_3.setText(GameStart);
       changeMove("3");
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        btn_5.setText(GameStart);
        changeMove("5");
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        btn_6.setText(GameStart);
        changeMove("6");
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
         btn_7.setText(GameStart);
         changeMove("7");
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        btn_8.setText(GameStart);
        changeMove("8");
    }//GEN-LAST:event_btn_8ActionPerformed

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
            java.util.logging.Logger.getLogger(TiicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TiicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TiicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TiicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TiicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}

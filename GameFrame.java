public class GameFrame extends javax.swing.JFrame implements java.awt.event.ActionListener{
   javax.swing.JButton left = new javax.swing.JButton ("Left");
   javax.swing.JButton right = new javax.swing.JButton ("Right");
   javax.swing.JFrame name = new javax.swing.JFrame("Boulders");
      Dodger slider = new Dodger(2, 2, 3, 4);
      //slider.moveLeft(xPos);
      //slider.moveRight(xPos);
      public int GamePanel(int xSize, int ySize){
         java.awt.Container layout = getContentPane();
         javax.swing.BoxLayout Game = new
           javax.swing.BoxLayout(text,javax.swing.BoxLayout.Y_AXIS);   //new objects in y axis in box layout
         setLayout( lastName );
         layout.add( left );
         layout.add( right );
         left.addActionListener( this );
         right.addActionListener( this );
         
         setSize(XSIZE, YSIZE);    //frame window size
         panel = new GamePanel(XSIZE, YSIZE-50);
         setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE); //ability to close window
         setVisible( true );
      }
      public void actionPerformed(java.awt.event.ActionEvent call){
         int xPos = slider.moveLeft(xPos);
      }
   }

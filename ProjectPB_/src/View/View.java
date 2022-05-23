package View;

import java.awt.Color;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import Model.cards.Card;


public class View  {
	 static JButton cardN = new JButton(); //NEXT CARD
	 static JButton cardP = new JButton(); //PREVIOUS CARD
	 JFrame window = new JFrame("Sorry Game");
     public static JLabel[] ar = new JLabel[74];
	 JLabel pawn;
	 JTextArea infobox = new JTextArea();
	 static JPanel panel = new JPanel();
  	 static JLabel label = new JLabel();
     JButton PawnR1 = new JButton();
     JButton PawnR2 = new JButton();
     JButton PawnY1 = new JButton();
     JButton PawnY2 = new JButton();
     JButton Fold = new JButton("Fold Button");
     JLabel StartY = new JLabel(); //YELLOW START
     JLabel StartR = new JLabel();
     JLabel blueback = new JLabel();
     
	 
     /**
      * Creates a new Menu Window 
      */
	 public void MenuDialog(Object a,Object b,String str,String str2){

	 }
	 
	 /**
	  * 
	  * @param: pr1, pr2, py1, py2
	  * when any of the parameters are =-1, the specific position is the start square. 
	  * The method is called after the player draws the card, to the parameters are the new positions of each pawn.
	  * Post-Condition: the pawn will be appeared on the new square.
	  */
	 public void updatePawn(int pr1,int pr2,int py1,int py2) {
		 if(pr2 != -1) {
			 PawnR2.setBounds(0, 0, 45, 45);
			 ar[pr2].add(PawnR2);
		 } else
		 {
			 PawnR2.setBounds(50, 0, 45, 45);
			 //set pr2 start square
		 }
		 if(py1 != -1) {
			 PawnY1.setBounds(0, 0, 45, 45);
			 ar[py1].add(PawnY1);
		 } else {
			 PawnY1.setBounds(50, 0, 45, 45);
			 //set py2 start square
		 }
		 if(pr1!=-1)
		 ar[pr1].add(PawnR1);
		
		 
		 if(py2!=-1)
		 ar[py2].add(PawnY2);
		
		 
		 panel.revalidate();
		 panel.repaint();
		
	 }
	 
	 /**
	  * Pre-Condition: the fold button must be created.(JButton)
	  * setter and getter of the fold button.
	  * They will be used for the MouseListeners in the Controller class.
	  * @param fold
	  * @return Fold
	  */
	 
	 public JButton getFold() {
			return Fold;
		}

		public void setFold(JButton fold) {
			Fold = fold;
		}
		

		
		/**
		 * Pre-Condition: Pawns must be created.(JButtons)
		 * setters and getters for each Pawn(2 red and 2 yellow).
		 * They will be used for the MouseListeners on the Controller class.
		 * @param Pawn(R1,R2,Y1,Y2)
		 * @return pawn(R1,R2,Y1,Y2)
		 */
	 
	 public JButton getPawnR1() {
		return PawnR1;
	}



	public void setPawnR1(JButton pawnR1) {
		PawnR1 = pawnR1;
	}



	public JButton getPawnR2() {
		return PawnR2;
	}



	public void setPawnR2(JButton pawnR2) {
		PawnR2 = pawnR2;
	}



	public JButton getPawnY1() {
		return PawnY1;
	}



	public void setPawnY1(JButton pawnY1) {
		PawnY1 = pawnY1;
	}



	public JButton getPawnY2() {
		return PawnY2;
	}



	public void setPawnY2(JButton pawnY2) {
		PawnY2 = pawnY2;
	}


/**
 * Pre-Condition: the player must draw a card for the updateCard method to take place.
 * This method will get the image of the card that was just drawn by the player, and change the image of the button 
 * that is on the right. The right button shows which card was last drawn.
 * @param c
 * @param i
 */
	public void updateCard(Card c, int i) {
		 String image = c.getImage();
		 cardN.setIcon(new ImageIcon(image));
		 panel.repaint();
	 }
     
	/**
	 * Setter and getter for the left button, which shows the back of the card.
	 * the left button is basically the stack of all the cards that the player can draw.
	 * @param but
	 */
	 public void setButton(JButton but) {
		 View.cardP = but;
	 }
	 public JButton getButton() {
		return cardP;
	 }
	 
	 /**
	  * Pre-Condition: the infobox must be created.(JTextArea)
	  * This method will be called in order to change the information in the box when 
	  * for example the player draws a card and is removed from the stack, or when the turn changes from 
	  * one player to another etc.
	  * @param message
	  */
	 
	 public void updateInfobox(String message) {
	     infobox.setText(message);
	     panel.repaint();
	 }
	 
	 /**
	  * In this method the board will be initialized and everything that is needed to make the specific board for 
	  * the sorry game. The squares are JLabels that are designed as an array.
	  */
	 
	 public void initView() {
		 panel.setLayout(null);
  
         for(int i = 0; i < 2; i++) {
        	if(i==1) {
         		ar[i] = new JLabel("" + (i));
         		ar[i].setBounds( 45, 0 , 45, 45);
         		ar[i].setIcon(new ImageIcon("src/images/slides/redSlideStart.png"));
         		ar[i].setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
         		panel.add(ar[i]);
         		continue;
         	}
        	ar[i] = new JLabel("" + (i));
          	ar[i].setBounds(0 +(i*45), 0, 45, 45);
          	ar[i].setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
          	ar[i].setOpaque(true);
          	panel.add(ar[i]);
         }
         
         
         for(int i = 2; i < 9; i++) {
            
        	if(i==2) {
        		ar[i] = new JLabel("" + (i));
        		ar[i].setBounds( 90, 0 +((i-2)*45), 45, 45);
        		ar[i].setIcon(new ImageIcon("src/images/slides/redSlideMedium.png"));
        		ar[i].setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
        		ar[i].setOpaque(true);
        		panel.add(ar[i]);
        		continue;
        	}
            if(i==8) {
        		ar[i] = new JLabel();  //RED HOME
        		ar[i].setBackground(Color.white);
            	ar[i].setBounds(65, 45 +((i-3)*45), 95, 75);
            	ar[i].setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.red));
            	ar[i].setOpaque(true);
            	
            	JLabel HRT = new JLabel("HOME");
                HRT.setBounds(93, 310, 100, 50);
                
                panel.add(HRT);
            	panel.add(ar[i]);
            	break;
           	}
                       	
        	ar[i] = new JLabel("" + (i));
          	ar[i].setBounds( 90, 0 +((i-2)*45), 45, 45);
          	ar[i].setBackground(Color.red);
          	ar[i].setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
          	ar[i].setOpaque(true);
          	panel.add(ar[i]);
          	
         }
         
        
         StartR.setBackground(Color.white);
         StartR.setBounds(155, 45, 100, 80);
         StartR.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.red));
         StartR.setOpaque(true);
         
         JLabel SRT = new JLabel("START");
         SRT.setBounds(183, 85, 100, 50);
         
         panel.add(SRT);
         panel.add(StartR);
         
         for(int i = 9; i < 22; i++) {
        	if(i==9) {
             	ar[i] = new JLabel("" + (i));
         		ar[i].setBounds( 135, 0 , 45, 45);
         		ar[i].setIcon(new ImageIcon("src/images/slides/redSlideMedium.png"));
         		ar[i].setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
         		panel.add(ar[i]);
         		continue;
            }
        	
            if(i==10) {
            	ar[i] = new JLabel("" + (i));
        		ar[i].setBounds( 180, 0 , 45, 45);
        		ar[i].setIcon(new ImageIcon("src/images/slides/redSlideEnd.png"));
        		ar[i].setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
        		panel.add(ar[i]);
        		continue;
            }
            

            if(i==15) {
            	ar[i] = new JLabel("" + (i));
        		ar[i].setBounds( 405, 0 , 45, 45);
        		ar[i].setIcon(new ImageIcon("src/images/slides/redSlideStart.png"));
        		ar[i].setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
        		ar[i].setOpaque(true);
        		panel.add(ar[i]);
        		continue;
            }
            
            if(i==16 || i==17 || i==18) {
            	ar[i] = new JLabel("" + (i));
        		ar[i].setBounds( 450 + (i-16)*45, 0 , 45, 45);
        		ar[i].setIcon(new ImageIcon("src/images/slides/redSlideMedium.png"));
        		ar[i].setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
        		ar[i].setOpaque(true);
        		panel.add(ar[i]);
        		continue;
            }
            
            if(i==19) {
            	ar[i] = new JLabel("" + (i));
        		ar[i].setBounds( 585, 0 , 45, 45);
        		ar[i].setIcon(new ImageIcon("src/images/slides/redSlideEnd.png"));
        		ar[i].setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
        		ar[i].setOpaque(true);
        		panel.add(ar[i]);
        		continue;
            }
            
        	ar[i] = new JLabel("" + i);
           	ar[i].setBounds(135 +((i-9)*45), 0, 45, 45);
           	ar[i].setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
           	ar[i].setOpaque(true);
           	panel.add(ar[i]);
         }
         
         for(int i = 22; i < 37; i++) {
        	 
        	if(i==22) {
             	ar[i] = new JLabel("" + (i));
         		ar[i].setBounds( 675, 45, 45, 45);
         		ar[i].setIcon(new ImageIcon("src/images/slides/blueSlideStart.png"));
         		ar[i].setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
         		ar[i].setOpaque(true);
         		panel.add(ar[i]);
         		continue;
            }
        	
        	if(i==23 || i==24) {
            	ar[i] = new JLabel("" + (i));
        		ar[i].setBounds( 675, 45 + (i-22)*45 , 45, 45);
        		ar[i].setIcon(new ImageIcon("src/images/slides/blueSlideMedium.png"));
        		ar[i].setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
        		ar[i].setOpaque(true);
        		panel.add(ar[i]);
        		continue;
            }
        	
        	if(i==25) {
            	ar[i] = new JLabel("" + (i));
        		ar[i].setBounds( 675, 45 + (i-22)*45 , 45, 45);
        		ar[i].setIcon(new ImageIcon("src/images/slides/blueSlideEnd.png"));
        		ar[i].setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
        		ar[i].setOpaque(true);
        		panel.add(ar[i]);
        		continue;
            }
        	
        	if(i==30) {
            	ar[i] = new JLabel("" + (i));
        		ar[i].setBounds( 675, 45 + (i-22)*45 , 45, 45);
        		ar[i].setIcon(new ImageIcon("src/images/slides/blueSlideStart.png"));
        		ar[i].setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
        		ar[i].setOpaque(true);
        		panel.add(ar[i]);
        		continue;
            }
        	
        	if(i==31 || i==32 || i==33) {
            	ar[i] = new JLabel("" + (i));
        		ar[i].setBounds( 675, 45 + (i-22)*45 , 45, 45);
        		ar[i].setIcon(new ImageIcon("src/images/slides/blueSlideMedium.png"));
        		ar[i].setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
        		ar[i].setOpaque(true);
        		panel.add(ar[i]);
        		continue;
            }
        	
        	if(i==34) {
            	ar[i] = new JLabel("" + (i));
        		ar[i].setBounds( 675, 45 + (i-22)*45 , 45, 45);
        		ar[i].setIcon(new ImageIcon("src/images/slides/blueSlideEnd.png"));
        		ar[i].setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
        		ar[i].setOpaque(true);
        		panel.add(ar[i]);
        		continue;
            }
        	ar[i] = new JLabel("" + (i));
           	ar[i].setBounds(675, 45 +((i-22)*45), 45, 45);
           	ar[i].setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
           	ar[i].setOpaque(true);
           	panel.add(ar[i]);
         }
         
         for(int i = 37; i < 39; i++) {
        	 if(i==37) {
             	ar[i] = new JLabel("" + (i));
         		ar[i].setBounds( 630, 675 + (i-37)*45 , 45, 45);
         		ar[i].setIcon(new ImageIcon("src/images/slides/yellowSlideStart.png"));
         		ar[i].setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
         		ar[i].setOpaque(true);
         		panel.add(ar[i]);
         		continue;
             }
        	 
        	 if(i==38) {
             	ar[i] = new JLabel("" + (i));
         		ar[i].setBounds( 585, 675  , 45, 45);
         		ar[i].setIcon(new ImageIcon("src/images/slides/yellowSlideMedium.png"));
         		ar[i].setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
         		ar[i].setOpaque(true);
         		panel.add(ar[i]);
         		continue;
             }
         }

         
         for(int i = 39; i < 45; i++) {
        	 if(i == 44) {
        		 ar[i] = new JLabel(); //YELLOW HOME
              	 ar[i].setBackground(Color.white);
        		 ar[i].setBounds(560, 585 -((i-39)*42), 95, 75);
                 ar[i].setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.yellow));
        		 ar[i].setOpaque(true);
        		 
        		 JLabel HYT = new JLabel("HOME");
                 HYT.setBounds(587, 363, 100, 50);
                 
                 panel.add(HYT);
                 panel.add(ar[i]);
                 break;
        	 }
        	 ar[i] = new JLabel("" + i);
          	 ar[i].setBackground(Color.yellow);
             ar[i].setBounds(585, 630 -((i-39)*45), 45, 45);
             ar[i].setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
             ar[i].setOpaque(true);
             panel.add(ar[i]);
            	
         }
         
         
        
         StartY.setBackground(Color.white);
         StartY.setBounds(470, 595, 100, 80);
         StartY.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.yellow));
         StartY.setOpaque(true);
         
         JLabel SYT = new JLabel("START");
         SYT.setBounds(500, 630, 100, 50);
         
         panel.add(SYT);
         panel.add(StartY);
         
         
         for(int i = 45; i < 59; i++) {
        	 if(i==45) {
              	ar[i] = new JLabel("" + (i));
          		ar[i].setBounds( 540, 675 , 45, 45);
          		ar[i].setIcon(new ImageIcon("src/images/slides/yellowSlideMedium.png"));
          		ar[i].setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
          		ar[i].setOpaque(true);
          		panel.add(ar[i]);
          		continue;
              }
        	 
        	 if(i==46) {
              	ar[i] = new JLabel("" + (i));
          		ar[i].setBounds( 495, 675 , 45, 45);
          		ar[i].setIcon(new ImageIcon("src/images/slides/yellowSlideEnd.png"));
          		ar[i].setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
          		ar[i].setOpaque(true);
          		panel.add(ar[i]);
          		continue;
              }
        	 
        	 if(i==51) {
              	ar[i] = new JLabel("" + (i));
          		ar[i].setBounds( 270, 675, 45, 45);
          		ar[i].setIcon(new ImageIcon("src/images/slides/yellowSlideStart.png"));
          		ar[i].setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
          		ar[i].setOpaque(true);
          		panel.add(ar[i]);
          		continue;
              }
        	 
        	 if(i==52 || i==53 || i==54) {
              	ar[i] = new JLabel("" + (i));
          		ar[i].setBounds( 180 - (i-53)*45, 675  , 45, 45);
          		ar[i].setIcon(new ImageIcon("src/images/slides/yellowSlideMedium.png"));
          		ar[i].setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
          		ar[i].setOpaque(true);
          		panel.add(ar[i]);
          		continue;
              }
        	 
        	 if(i==55) {
              	ar[i] = new JLabel("" + (i));
          		ar[i].setBounds( 90, 675 , 45, 45);
          		ar[i].setIcon(new ImageIcon("src/images/slides/yellowSlideEnd.png"));
          		ar[i].setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
          		ar[i].setOpaque(true);
          		panel.add(ar[i]);
          		continue;
              }
        	 ar[i] = new JLabel("" + (i));
         	 ar[i].setBounds(540 - ((i-45)*45), 675, 45, 45);
         	 ar[i].setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
             ar[i].setOpaque(true);
             panel.add(ar[i]);
         }
         
         for(int i = 58; i < 72; i++) {
        	 if(i==58) {
              	ar[i] = new JLabel("" + (i));
          		ar[i].setBounds(0, 630 , 45, 45);
          		ar[i].setIcon(new ImageIcon("src/images/slides/greenSlideStart.png"));
          		ar[i].setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
          		ar[i].setOpaque(true);
          		panel.add(ar[i]);
          		continue;
              }
        	 
        	 if(i==59 || i==60) {
              	ar[i] = new JLabel("" + (i));
          		ar[i].setBounds(0, 585 - ((i-59)*45) , 45, 45);
          		ar[i].setIcon(new ImageIcon("src/images/slides/greenSlideMedium.png"));
          		ar[i].setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
          		ar[i].setOpaque(true);
          		panel.add(ar[i]);
          		continue;
              }
        	 
        	 if(i==61) {
               	ar[i] = new JLabel("" + (i));
           		ar[i].setBounds(0, 495 , 45, 45);
           		ar[i].setIcon(new ImageIcon("src/images/slides/greenSlideEnd.png"));
           		ar[i].setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
           		ar[i].setOpaque(true);
           		panel.add(ar[i]);
           		continue;
               }
        	 
        	 if(i==66) {
               	ar[i] = new JLabel("" + (i));
           		ar[i].setBounds(0, 270 , 45, 45);
           		ar[i].setIcon(new ImageIcon("src/images/slides/greenSlideStart.png"));
           		ar[i].setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
           		ar[i].setOpaque(true);
           		panel.add(ar[i]);
           		continue;
               }
        	 
        	 if(i==67 || i==68 || i==69) {
               	ar[i] = new JLabel("" + (i));
           		ar[i].setBounds(0, 225 - ((i-67)*45) , 45, 45);
           		ar[i].setIcon(new ImageIcon("src/images/slides/greenSlideMedium.png"));
           		ar[i].setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
           		ar[i].setOpaque(true);
           		panel.add(ar[i]);
           		continue;
               }
        	 
        	 if(i==70) {
               	ar[i] = new JLabel("" + (i));
           		ar[i].setBounds(0, 90 , 45, 45);
           		ar[i].setIcon(new ImageIcon("src/images/slides/greenSlideEnd.png"));
           		ar[i].setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
           		ar[i].setOpaque(true);
           		panel.add(ar[i]);
           		continue;
               }
        	 ar[i] = new JLabel("" + (i));
         	 ar[i].setBounds(0, 630 - ((i-58)*45), 45, 45);
         	 ar[i].setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black));
             ar[i].setOpaque(true);
             panel.add(ar[i]);
         }
           
           PawnR1.setBounds(2, 0, 45, 45);
           Image im= new ImageIcon("src/images/pawns/redPawn1.png").getImage().getScaledInstance(48, 45, Image.SCALE_SMOOTH);
           PawnR1.setIcon(new ImageIcon(im));
           PawnR1.setOpaque(true);
           StartR.add(PawnR1);
        
           PawnR2.setBounds(50, 0, 45, 45);
           Image im2= new ImageIcon("src/images/pawns/redPawn2.png").getImage().getScaledInstance(48, 45, Image.SCALE_SMOOTH);
           PawnR2.setIcon(new ImageIcon(im2));
           PawnR2.setOpaque(true);
           StartR.add(PawnR2);
          // panel.add(PawnR2);
           //PawnY2.setIcon(new ImageIcon("src/images/pawns/yellowPawn1.png"));
           PawnY2.setBounds(0,0,45,45);
           Image im3= new ImageIcon("src/images/pawns/yellowPawn2.png").getImage().getScaledInstance(48, 45, Image.SCALE_SMOOTH);
           PawnY2.setIcon(new ImageIcon(im3));
           PawnY2.setOpaque(true);
           StartY.add(PawnY2);
           
           
           PawnY1.setBounds(50,0,45,45);
           Image im4= new ImageIcon("src/images/pawns/yellowPawn1.png").getImage().getScaledInstance(48, 45, Image.SCALE_SMOOTH);
           PawnY1.setIcon(new ImageIcon(im4));
           PawnY1.setOpaque(true);
           StartY.add(PawnY1);

           JLabel sorry = new JLabel("SORRY");
           sorry.setBounds(240, 310, 250, 100);
           sorry.setIcon(new ImageIcon("src/images/sorryImage.png"));
           sorry.setOpaque(true);
           panel.add(sorry);
           
           
           
           cardP.setBounds(740, 160, 100, 150);
           cardP.setIcon(new ImageIcon("src/images/cards/backCard.png"));
           cardP.setOpaque(true);
           panel.add(cardP);
           
           cardN.setBounds(860, 160, 100, 150);
           cardN.setOpaque(true);
           panel.add(cardN);
           
           JLabel CT = new JLabel("Receive Card");
           CT.setBounds(750, 310, 100, 50);
           panel.add(CT);
           
           JLabel CT2 = new JLabel("Current Card");
           CT2.setBounds(870, 310, 100, 50);
           panel.add(CT2);
           
   		   Fold.setBackground(Color.red);
   		   Fold.setBounds(740, 370, 220, 50);
   		   Fold.setOpaque(true);
           panel.add(Fold);
           
           blueback.setBackground(Color.CYAN);
  		   blueback.setBounds(45, 45, 630, 630);
           blueback.setOpaque(true);
           panel.add(blueback);
           
           infobox.setBackground(Color.white);
           infobox.setBounds(740, 450, 220, 150);
           infobox.setOpaque(true);
           panel.add(infobox);
           
           label.setBounds(0, 0, 1000, 1000);
           Image im1= new ImageIcon("src/images/background.png").getImage().getScaledInstance(1000, 1000, Image.SCALE_SMOOTH);
           label.setIcon(new ImageIcon(im1));
           label.setOpaque(true);
           panel.add(label);
       
           window.setSize(1000,1000);
           window.getContentPane().add(panel);
 		   window.setVisible(true);
 		   window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
      }
	 
	 
	 
}

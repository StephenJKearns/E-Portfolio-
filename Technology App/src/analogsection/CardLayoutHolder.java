/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analogsection;

import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JPanel;



/**
 *
 * @author Stephen 
 */
public class CardLayoutHolder extends javax.swing.JFrame {
       JPanel cardsContainer;
    /**
     * Creates new form AnalogCardHolder
     */
  
   
    public CardLayoutHolder() {
        initComponents();
       
         //declare and create objects
        
        //Welcome screen of the application goes here 
        StartMenu start = new StartMenu();
        // Is the main screen of the application
        MainMenuGUI mainCard = new  MainMenuGUI();
        
        // All of the screens in the analog section 
        AnalogGUIPanel screen1Card = new AnalogGUIPanel();
        AnalogHangmanPanel screen2Card = new AnalogHangmanPanel ();
        QuizScreen screen3Card = new QuizScreen();
        InformationGUIAllSections screen4Card  = new  InformationGUIAllSections();
        AnalogResistorCalcPanel screen6Card = new  AnalogResistorCalcPanel();
        AnalogResistorCalc5band screen7Card = new  AnalogResistorCalc5band();
        AnalogResistorCalc6band screen8Card = new AnalogResistorCalc6band();
        AnalogInfoMainScreen screenInfoCard = new  AnalogInfoMainScreen();
        AnalogWavesScreen screenWavesCard = new AnalogWavesScreen();
        
        // All of the cards(screens) in the Wood section 
        WoodMainPanel WoodMainScreen = new WoodMainPanel();
        WoodInfoPanel WoodinfoCard = new WoodInfoPanel();
        WoodQuizPanel WoodquizCard = new WoodQuizPanel();
        WhatsItMadeOfPanel WoodwhatsCard = new WhatsItMadeOfPanel();
        
        
        // All of the cards(Screens) in the plastic section 
        PlasticMainGUI screen10Card = new PlasticMainGUI();
        PlasticQuizGUI screen11Card = new PlasticQuizGUI();
        //All of the cards(Screens) in the digital section 
        DigitalSectionGUI screen12Card = new DigitalSectionGUI();
        DigitalInformationGUI screen13Card = new DigitalInformationGUI();
        DigitalDiagPanelGUI screen14Card = new DigitalDiagPanelGUI();
        DigitalHangMan screen16Card = new DigitalHangMan();
        DigitalTruthTables screen18Card = new DigitalTruthTables();
        DigitalGeneralInformation screen19Card = new DigitalGeneralInformation();
        
        //creates a variable which is new Panel with cardlayout 
        cardsContainer = new JPanel(new CardLayout());
        
         //add the welcom screen here
        cardsContainer.add(start, "welcome");
        // adds the main screen to the container 
        cardsContainer.add(mainCard, "MAIN");
        
        //adds all of the analog cards(screens) to the contanier 
        cardsContainer.add(screen1Card,"AnalogMainScreen");
        cardsContainer.add(screen2Card, "AnalogHangmanScreen");
        cardsContainer.add(screen3Card, "QuizScreen");
        cardsContainer.add(screen4Card, "AnalogInfoScreen");
        cardsContainer.add(screen6Card, "AnalogCalcScreen");
        cardsContainer.add(screen7Card, "Analog5bandCalcScreen");
        cardsContainer.add(screen8Card, "Analog6bandCalcScreen");
        cardsContainer.add(screenInfoCard, "AnalogInfoMainScreen");
        cardsContainer.add(screenWavesCard, "AnalogWavesScreen"); 
        
        //adds all of the Digital cards(screens) to the contanier:
      

        //adds all of the plastic cards to the container: 
       
        cardsContainer.add(screen10Card, "PlasticMainScreen");
        cardsContainer.add(screen11Card, "PlasticQuizScreen");
        //adds all of the Wood cards(screens) to the contanier:
        cardsContainer.add(WoodMainScreen,"WoodMainScreen");
        cardsContainer.add(WoodinfoCard, "WoodInfoScreen");
        cardsContainer.add(WoodquizCard, "WoodQuizScreen");
        cardsContainer.add(WoodwhatsCard, "WoodWhatsScreen");
        
        //adds all of the Digital cards(screens) to the contanier:
         cardsContainer.add(screen12Card, "DigitalSectionScreen");
        cardsContainer.add(screen13Card, "DigitalInformationScreen");
        cardsContainer.add(screen14Card, "DigitalDiagScreen");
        cardsContainer.add(screen16Card, "DigitalHangMan");
        cardsContainer.add(screen18Card, "DigitalTruthTables");
        cardsContainer.add(screen19Card, "DigitalGen");
        
      
      
        
        // add the cards container to the JFrame 
        this.setLayout(new FlowLayout());
        this.add(cardsContainer);
        this.setSize(400,450);
        java.awt.CardLayout cardlayout = (java.awt.CardLayout)(cardsContainer.getLayout());
         cardlayout.show(cardsContainer, "welcome");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(CardLayoutHolder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CardLayoutHolder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CardLayoutHolder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CardLayoutHolder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CardLayoutHolder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

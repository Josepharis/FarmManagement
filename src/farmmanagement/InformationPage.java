
package farmmanagement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

/**
 *
 * @author yusuf
 */
public class InformationPage {
    // create a frame
      public static void fill(int deliveryTime)
    {
        ProgressBarScreen pbs=new ProgressBarScreen();
        pbs.setVisible(true);
        
        //int i = deliveryTime;
        try {
            while ( deliveryTime<= 100) {
                pbs.progressBar1.setValue(deliveryTime);
                // fill the menu bar
                System.out.println(deliveryTime);
                pbs.progressBar1.setValue(deliveryTime);
                // delay the thread
                Thread.sleep(1000);
                deliveryTime += 1;
            }
        }
        catch (Exception e) {
            System.out.println("Hata var");
        }
    }
 
    
    // function to increase progress
  
}
    


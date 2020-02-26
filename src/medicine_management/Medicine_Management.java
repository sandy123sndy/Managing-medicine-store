/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicine_management;

/**
 *
 * @author ASUS
 */
public class Medicine_Management {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        SplashScreen f=new SplashScreen();
        f.setVisible(true);
        for(int i=0;i<=100;i++)
        {
            Thread.sleep(20);
            f.loadingnum.setText(Integer.toString(i)+"%");
            f.loadingbar.setValue(i);
            
        }
        f.dispose();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
        LoginPage l=new LoginPage();
        l.setVisible(true);
    }
      
    }
    
}

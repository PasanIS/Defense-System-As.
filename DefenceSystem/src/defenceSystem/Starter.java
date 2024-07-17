/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defenceSystem;

import defenceSystem.gui.HelicopterGUI;
import defenceSystem.gui.MainControllerGUI;
import defenceSystem.gui.SubmarineGUI;
import defenceSystem.gui.TankGUI;
import defenceSystem.model.Observable;
import defenceSystem.model.Observer;
import defenceSystem.model.SuperDefence;
import defenceSystem.model.Strength;
/**
 *
 * @author User
 */
public class Starter {

    public static void main(String[] args) {
        
        Observer sbj=new Observer();
 
        MainControllerGUI mainCon=new MainControllerGUI(true);
        
        Observable tankGUI =new TankGUI();
        Observable helicopterGUI =new HelicopterGUI();
        Observable submarineGUI =new SubmarineGUI();
        
        sbj.add(tankGUI);
        sbj.add(helicopterGUI);
        sbj.add(submarineGUI);
        
        mainCon.setSubject(sbj);
        helicopterGUI.setMain(mainCon);
        tankGUI.setMain(mainCon);
        submarineGUI.setMain(mainCon);
    }
}
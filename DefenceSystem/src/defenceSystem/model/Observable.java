/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package defenceSystem.model;

/**
 *
 * @author User
 */
import defenceSystem.gui.MainControllerGUI;

public interface Observable {
    public void setMain(MainControllerGUI main);
    
    public void msg(String msg);
    
    public void position(int value);
    
    public void clear(boolean res);
}
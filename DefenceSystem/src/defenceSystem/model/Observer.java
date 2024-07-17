/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package defenceSystem.model;

/**
 *
 * @author User
 */
import java.util.ArrayList;

public class Observer {
    private ArrayList<Observable> list=new ArrayList<>();
    
    public void add(Observable ob){
        list.add(ob);
    }   

    public void methodMsg(String msg){
        for (Observable ob: list) {
            ob.msg(msg);
        }
    }
    
    public void methodPosition(int value){
        for (Observable ob: list) {
            ob.position(value);
        }
    }
    
    public void methodClear(boolean res){
        for (Observable ob: list) {
            ob.clear(res);
        }
    }
}

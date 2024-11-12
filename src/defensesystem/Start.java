/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defensesystem;

import DefenseSystemUI.Helicopter;
import DefenseSystemUI.Mainpage;
import DefenseSystemUI.Submarine;
import DefenseSystemUI.Tank;
/**
 *
 * @author Dilshan
 */
public class Start {
    public static void main(String[] args) {
        Helicopter H1 = new Helicopter();
        H1.setVisible(true);
        Tank T1 = new Tank();
        T1.setVisible(true);
        Submarine S1 = new Submarine();
        S1.setVisible(true);
        Observable observable = Observable.getInstance();
             
        observable.add(H1);
        observable.add(T1);
        observable.add(S1);  
        
        Mainpage mainForm = new Mainpage(observable);
        observable.setMainCOntroller(mainForm);
        mainForm.setVisible(true);
    }                   
}

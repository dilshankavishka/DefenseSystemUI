/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defensesystem;

import DefenseSystemUI.Mainpage;
import java.util.ArrayList;
/**
 *
 * @author Dilshan
 */
public class Observable {
    private final ArrayList<Observer> observerList = new ArrayList<>();
    
    private int position;
    private boolean status;
    private String message;
    private boolean select;
    
    private static Observable instance;
    private Mainpage mainpage;
    private Observable(){        
    }
    
    public static Observable getInstance() {
        if (instance == null) {
            return instance = new Observable();
        }
        return instance;
    }
    public void add(Observer ob){
        observerList.add(ob);
    }
    public void setMainCOntroller(Mainpage mainForm) {
        this.mainpage = mainForm;
    }
    public void setAreaStatus(boolean status) {
        if (this.status != status) {
            this.status = status;
            notifyDevices();
        }
    }

    public void setPosition(int position) {       
            this.position = position;
            notifyDevices();       
    }
    
    public void notifyDevices() {
        for (Observer ob : observerList) {
            ob.areaStatus(status);
            ob.updatePosition(position);
            ob.updateSendMessage(message,select);
        }
    }
     public void setMessage(String message,boolean select) {            
         if (this.message != message) {
            this.message = message;
            this.select = select;
            notifyDevices();
        }
    }
     public void setControlerMessage(String message) {
        mainpage.setText(message);
    }
}

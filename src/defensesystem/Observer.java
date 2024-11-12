/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package defensesystem;

/**
 *
 * @author Dilshan
 */
public interface Observer {
    
    public void areaStatus(boolean status);

    public void updatePosition(int positionLevel);

    public void updateSendMessage(String message,boolean select);
    
    public int getAmmoCount(int count);
    
    public int getSoldierCount(int count);
    
    public int getKillCount(int count);
}

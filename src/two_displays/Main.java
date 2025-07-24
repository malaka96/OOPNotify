/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package two_displays;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args){
        Display display = new Display();
        display.setVisible(true);
        new Slider(display).setVisible(true);
        
    }
}

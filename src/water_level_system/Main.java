/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package water_level_system;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args){
        Display display = new Display();
        Alarm alarm =  new Alarm();
        Splitter splitter = new Splitter();
        Slider slider = new Slider();
        
        display.setVisible(true);
        alarm.setVisible(true);
        splitter.setVisible(true);
        slider.setVisible(true);
        
        slider.addObserver(display);
        slider.addObserver(alarm);
        slider.addObserver(splitter);
    }
}

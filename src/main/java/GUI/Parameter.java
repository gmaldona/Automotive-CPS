/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author HN
 */
public class Parameter {
    
    /**
     * Size of Padding and Spacing
     */
    public static final int SIZE_PADDING = 20;
    public static final int SIZE_SPACING = 10;
    
    /**
     * Size of gap
     */
    public static final int GRID_VGAP = 20;
    public static final int GRID_HGAP = 20;
    
    public static final int REGION_VGAP = 20;
    public static final int REGION_HGAP = 20;
    
    public static final int BOX_VGAP = 10;
    public static final int BOX_HGAP = 10;
    
    public static final int TITLE_VGAP = 20;
    public static final int HEADING1_VGAP = 10;
    public static final int HEADING2_VGAP = 5;
      
    public static final int COMPONENT_VGAP = 10;
    public static final int COMPONENT_HGAP = 10;
    public static final int ICON_HGAP = 50;
    //private final int control_horizental_gap = 50;
    
    /**
     * Size of Scene
     */  
    public static final int WIDTH_SCENE_CONNECT = 600;
    public static final int HEIGHT_SCENE_CONNECT = 400;
    
    public static final int WIDTH_SCENE_CONTROL = 1000;
    public static final int HEIGHT_SCENE_CONTROL = 800;
    
    public static final int WIDTH_SCENE_POPUP = 300;
    public static final int HEIGHT_SCENE_POPUP = 200;
    
    /**
     * Size of Icon
     */  
    public static final int SIZE_ICON_BIG = 150;
    public static final int SIZE_ICON_MEDIUM = 50;
    public static final int SIZE_ICON_SMALL = 20;
    public static final int SIZE_ICON_TINY = 10;
    
    /**
     * Size of components of Control GUI
     */ 
    public static final int HEIGHT_INDIVIDUAL_CAR = 250;
    
    public static final int HEIGHT_LIST_CAR = 200;
    public static final int WIDTH_LIST_CAR = 100;
    
    public static final int HEIGHT_THUMBNAIL = 100;
    public static final int WIDTH_DESCRIPTION_CAR = 250;
    
    
    
    /**
     * Behaviors
     */   
    public static final String BEHAVIOR_CONNECTED = "Connected";
    
    public static final String BEHAVIOR_BRAKE_LIGHT = "Brake Light";
    public static final String BEHAVIOR_EMERGENCY_LIGHT = "Emergency Light";
    public static final String BEHAVIOR_FOUR_WAY_HAZARD_LIGHT = "Four Way Hazard Light";
    
    public static final String BEHAVIOR_CHANGE_LANE = "Change Lane";
    public static final String BEHAVIOR_EMERGENCY_STOP = "Emergency Stop";
    public static final String BEHAVIOR_PULL_OVER = "Pull Over";
    public static final String BEHAVIOR_U_TURN = "U Turn";
    
    public static final int SPEED_ADJUST = 100;
    
    /**
    * Message
    */
    public static final String MESSAGE_SUCCESS = "200 Success";
    public static final String MESSAGE_NO_SELECTED_VEHICLE = "No selected vehicle";
    public static final String MESSAGE_NO_ADJUST_CONNECTED_BEHAVIOR = "This behavior cannot be manually adjusted";
}

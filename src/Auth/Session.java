/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Auth;

/**
 *
 * @author Lenovo
 */
public class Session {
    private static String id;
    private static String name;
    
    public static String getId() {
        return id;
    }
    
    public static String getName() {
        return name;
    }
    
    public static void setId(String id) {
        Session.id = id;
    }
    
    public static void setName(String name) {
        Session.name = name;
    }
}

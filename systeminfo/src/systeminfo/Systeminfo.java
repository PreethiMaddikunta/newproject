/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systeminfo;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author preet
 */
public class Systeminfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InetAddress ip;
    try {
  
        System.out.println("\n  Your Current Computer information \n");
        ip = InetAddress.getLocalHost();
        System.out.println("Current host name : " + ip.getHostName());
        System.out.println("Current IP address : " + ip.getHostAddress());
        System.out.println("Name of the OS: " + System.getProperty("os.name"));
        System.out.println("Version of the OS: " + System.getProperty("os.version"));
        System.out.println("Architecture of THe OS: " + System.getProperty("os.arch"));
        System.out.println("Processors_IDENTIFIER: " + System.getenv("PROCESSOR_IDENTIFIER"));
        System.out.println("Available processors (cores): " + Runtime.getRuntime().availableProcessors());
        System.out.println("Free memory (bytes): " +  Runtime.getRuntime().freeMemory());
        long maxMemory = Runtime.getRuntime().maxMemory();
        System.out.println("Maximum memory (bytes): " + (maxMemory == Long.MAX_VALUE ? "no limit" : maxMemory));
        System.out.println("Total memory available (bytes): " +  Runtime.getRuntime().totalMemory());
        
  
    } catch (UnknownHostException e) {
  
        e.printStackTrace();
  
    } 
    catch (Exception e){
  
        e.printStackTrace();
  
    }
 
    }
    }
    


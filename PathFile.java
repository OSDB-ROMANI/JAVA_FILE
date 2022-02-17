/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pathfile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paolo
 */
public class PathFile {
    public static void creaDirectory(String path,String nome){
        File f = new File(path,nome);
        if(f.exists()){
            System.out.println("DIRECTORY ESISTE");
        }else {
            System.out.println("DIRECTORY NON ESISTE");
            if(f.mkdir()) System.out.println("DIRECTORY CREATA");
            else System.out.println("IMPOSSIBILE CREARE LA DIRECTORY");            
        }
        System.out.println("Hashcode: "+f.hashCode());        
    }
    
    public static void creaFile(String path,String nome){
        File f = new File(path,nome);
        if(f.exists())
            System.out.println("ESISTE");
        else {
            System.out.println("Non esiste");
            try {
                if(f.createNewFile()) System.out.println("FILE CREATO");
                else System.out.println("IMPOSSIBILE CREARE IL FILE");
            } catch (IOException ex) {
                Logger.getLogger(PathFile.class.getName()).log(Level.SEVERE, null, ex);
            }            
        }
        System.out.println("Hashcode: "+f.hashCode());
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Path currentDir = Paths.get("");
        String path = currentDir.toAbsolutePath().toString();
        System.out.println("**** PATH APPLICAZIONE ****\n"+path+"\n***************************\n");        
        System.out.print("Creare\n1.Directory\n2.File\nscegli: ");
        switch(sc.next()){
            case "1":
                System.out.println("Nome directory");
                creaDirectory(path,sc.next());
                break;
            case "2":
                System.out.println("Nome File");
                creaFile(path,sc.next());
                break;
            default:
                throw new Exception("Devi inserire 1 o 2");
        }
        System.out.println("premi invio per uscire");
        sc.nextLine();
    }
    
}

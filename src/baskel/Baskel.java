/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baskel;

import Services.ServiceAnnonce;
import Model.Annonce;
import Model.Annonce_location;
import Model.Annonce_vente;
import Model.Gouvernorat;
import Model.UserTest;
import Services.ServiceAnnonceLocation;
import Services.ServiceAnnonceVente;
import Services.ServiceGouvernerat;
import Services.ServiceStatistique;
import Utils.DataBase;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author hpp
 */
public class Baskel extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Date d1= new Date() ;

     //pour tester 
        Annonce a=new Annonce( "azerty", 99999999, "exp", "exp1", "address","photo.jpg",1) ;
        
         Annonce a1=new Annonce( 29,"mohamedbouzid", 99999999,d1, "Gouvernorat", " Delegation", "address","photo.jpg",3,1) ;
        ServiceAnnonce ser =new ServiceAnnonce() ;
        
        try {
    //ser.ajouter(a1);
        //
           
    System.out.println(ser.delete( a1) );
        //System.out.println(ser.update(a1) );
        //System.out.println(ser.readAll()) ;
         
      //System.out.println( ser.name_person( a1 )+"kkkkkkkkkkkkkkkkkkkkkkkm") ;
      //System.out.println(ser.find_annonce(33)) ;
     // System.out.println(ser.find_annonce_bool (33)) ;
     // System.out.println(ser.filter("Gouvernorat"," Delegation")) ;
         
         
        } catch (SQLException ex) {
            Logger.getLogger(Baskel.class.getName()).log(Level.SEVERE, null, ex);
        }
        //annvente
        Annonce_vente a2=new Annonce_vente( "Vente", 99999999, "exp", "exp1", "address","photo.jpg",200,2) ;
         Annonce_vente a3=new Annonce_vente(400,45,"mohamedbouzid", 99999999,d1, "Gouvernorat", " Delegation", "address","photo.jpg",2,2);
        ServiceAnnonceVente ser1 =new ServiceAnnonceVente() ;
          try {
    // ser1.ajouter(a3);
      //System.out.println(ser1.delete( a3) );
    //  System.out.println(ser1.update(a3) );
      System.out.println(ser1.readAllVente());
       //System.out.println(ser1.getAVid(a3));
    //System.out.println(ser1.filter("Gouvernorat" ,null,1)+"fffffffffff")  ; 
     //System.out.println(ser1.find_annoncevente (57)+"fffffffffff")  ;
           
     //System.out.println(ser.delete( a1) );
        //System.out.println(ser.update(a1) );
        //System.out.println(ser.readAll()) ;
         
      // System.out.println( ser.name_person( a1 )) ;
      //System.out.println(ser.find_annonce(33)) ;
     // System.out.println(ser.find_annonce_bool (33)) ;
    
      System.out.println("****************************************************************") ;   
         
        } catch (SQLException ex) {
            Logger.getLogger(Baskel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
          
          
          Annonce_location a11 = new Annonce_location (1, 5, 20, 66, "location", 99999999, d1, "gouvernorat", " delegation", " address", " photo",  0,3);
          Annonce_location a12 = new Annonce_location (1, 20, 20, 106, "location", 99999999, d1, "gouvernorat", " delegation", " address", " photo",  0,3);
           Annonce_location a13 = new Annonce_location(138) ;
          ServiceAnnonceLocation ser22 =new ServiceAnnonceLocation() ;
          ServiceGouvernerat serg = new ServiceGouvernerat() ;
          ServiceStatistique sers =  new ServiceStatistique() ;
          
        
         
          
          
        try {
         //ser22.ajouter(a12);
         //System.out.println(ser22.delete(a12) ) ;
         //System.out.println(ser22.readAllLocation() ) ;
         System.out.println(ser22.name_person( a13 )) ;
         System.out.println(ser22.filterH("gouvernorat" , null,2  )) ;
         Gouvernorat g = new Gouvernorat(1,"tunis") ;
         System.out.println(serg.readAll(g)) ;
        System.out.println(sers.getStatLJour(10,30));
         
            
        } catch (SQLException ex) {
            Logger.getLogger(Baskel.class.getName()).log(Level.SEVERE, null, ex);
        }
         System.out.println("****************************************************************") ; 

        
        launch(args);
    }
    
}

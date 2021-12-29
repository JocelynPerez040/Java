/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;
import Datos.Datos_trabajo;
import Datos.Leer_mensaje;
import Presentacion.Interaccion;
import Presentacion.Ingreso_Datos;
import java.util.Random;
/**
 *
 * @author Equipo
 */
public class Control {
    
    private Datos_trabajo dat;
    private Leer_mensaje men;
    private Interaccion frm;
    private Ingreso_Datos frmIngreso;
    private int num;
    Random claseRandom = new Random();
    

      
       
    public Control( Interaccion frm){
        this.dat = dat;
        this.men = new  Leer_mensaje();
        this.frmIngreso = frmIngreso;
        this.frm = frm;
        //frmIngreso.BtnIngresar.addActionListener(this);
    }
    
    public Datos_trabajo getFrase(){
          
         num = 1 + claseRandom.nextInt(30);
         try{

           dat= men.getDatos(num);
           
         }catch(Exception e){
             System.err.println(e);
         }
        return dat;
    }
 

    //@Override public void actionPerformed(ActionEvent e) {/
      //   num = 1 + claseRandom.nextInt(30);
  
   /*  //   if(e.getSource()== frmIngreso.BtnIngresar){
            dat.setId(num);
            if(men.getDatos(dat) ){
                frm.lblFrase.setText(dat.getMensaje());
                frm.lblDonar.setText(dat.getDonacion());
                
            }else{
                JOptionPane.showMessageDialog(null,"No se encontro registro");
            }    
            
        }
    */
   // }
    
   
    
}

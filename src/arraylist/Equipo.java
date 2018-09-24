/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Estudiante
 */
public class Equipo {

    /**
     * @param args the command line arguments
     */
    private String nombre;
    private HashMap<Integer, Jugador> jugadores;
    
  //  private ArrayList<Jugador> jugadores=new ArrayList<>();
    public boolean addJugador(Jugador jugador){
        Jugador j=this.jugadores.put(jugador.getCedula(), jugador);
        if(j!=null)
        return true;
        else return false;
    }
    
    public Equipo(String nombre){
        this.nombre=nombre;
        this.jugadores= new HashMap<>();
        
    }
    
   public HashMap getJugadores(){
       return this.jugadores;
   }
   
   public void setJugadores(HashMap<Integer, Jugador> jugadores){
       this.jugadores=jugadores;
   }
   
   //Se puede hacer cast con ArrayList y Hashmap - Treemap
   //Ejemplo:
   /*
   ArrayList<Jugador> jgs= (ArrayList)jugadores.values(); siendo jugadores un hashmap (values te pasa todo el hashmap)
   
   for(Jugador jg : jgs){
   System.out.println(jg);
   }
   */
            
    public static void main(String[] args) {
        Equipo e=new Equipo("hola");
        ArrayList<Jugador> jugador=new ArrayList<>();
        
        
    }
   
}

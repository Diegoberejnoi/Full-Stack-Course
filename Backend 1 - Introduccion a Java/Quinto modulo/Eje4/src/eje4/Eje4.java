/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje4;

/**
 *
 * @author Diego
 */
public class Eje4 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
      int [][] mat = new int [4][4];
      for ( int i = 0; i < 4; i++){
          for (int j = 0; j < 4; j++ ){
            mat [i][j] = (int) (Math.random()*10);
              System.out.print ("[ "+ mat [i][j]+ "]");
          }
          System.out.println(""); 
}

        System.out.println("------------------ ");
        
     for ( int i = 0; i < 4; i++){
          for (int j = 0; j < 4; j++ ){
           // mat [j][i] = (int) (Math.random()*10);
              System.out.print ("[ "+ mat [j][i]+ "]");
          }
          System.out.println(""); 
      
      
    }
}
}
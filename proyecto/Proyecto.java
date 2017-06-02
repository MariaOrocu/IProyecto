/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Brayan
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Movie m1 = new Movie("Matrix", "Accion", 66, 8, 1, 0);
//        Movie m2 = new Movie("Harry Potter", "Accion", 2, 0, 0, 0);
//        Movie m3 = new Movie("Sing", "Accion", 3, 0, 0, 0);
//        Movie m4 = new Movie("Zootopia", "Accion", 4, 0, 0, 0);
//        Movie m5 = new Movie("Ella es la chica de mis suenos", "Accion", 5, 0, 0, 0);
//        Movie m6 = new Movie("Duro de matar", "Accion", 6, 0, 0, 0);
//        
        List list = new List();
//        list.insertInOrder(m5);
//        list.insertInOrder(m2);
//        list.insertInOrder(m4);
//        list.insertInOrder(m3);
//        list.insertInOrder(m1);
//        list.insertInOrder(m6);
//        
//        list.printList();
//        
      
       
//        
//        System.out.println(list.size());
//        
//        System.out.println(list.getAt(4).getTittle());
        list.construct("datos.csv","Action");
        
  Movie m7 = list.search("Amistad");
        if(m7 != null){
            System.out.println(m7.getTittle()+"/"+m7.getGender());
        }
        //list.writeInFile("datos.csv", m1);
        list.printList();
        
        

    }
}

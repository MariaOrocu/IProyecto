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
public class Node {
    
    public Node siguiente;
    public Node anterior;
    public Movie movie;

    public Node() {
    }

    public Node(Node siguiente, Node anterior, Movie movie) {
        this.siguiente = siguiente;
        this.anterior = anterior;
        this.movie = movie;
    }
    
}

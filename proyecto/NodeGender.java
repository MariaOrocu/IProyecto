/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author mary_
 */
public class NodeGender {
    public List list;
    public String gender;
    public NodeGender siguiente;
    public NodeGender anterior;

    public NodeGender(String gender) {
        this.list = new List();
        this.gender = gender;
    }
    
    
}

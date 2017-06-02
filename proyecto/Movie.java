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
public class Movie {
    
    private String tittle;
    private String gender;
    private int code;
    private int total;
    private int subtitled;
    private int premier;

    public Movie() {
    }

    public Movie(String tittle, String gender, int code, int total, int subtitled, int premier) {
        this.tittle = tittle;
        this.gender = gender;
        this.code = code;
        this.total = total;
        this.subtitled = subtitled;
        this.premier = premier;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getSubtitled() {
        return subtitled;
    }

    public void setSubtitled(int subtitled) {
        this.subtitled = subtitled;
    }

    public int getPremier() {
        return premier;
    }

    public void setPremier(int premier) {
        this.premier = premier;
    }
    
    
    
    
    
}

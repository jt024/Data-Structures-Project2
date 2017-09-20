/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataLayer;

/**
 *
 * @author Trevi
 */
public class Link {
    private int value;
    private Link nextLink;
//    private Link previousLink;
    
    
    public int getValue(){
        return value;
    }
    public void setValue(int newValue){
        this.value = newValue;
        
    }
     public Link getNextLink(){
        return nextLink;
    }
    public void setNextLink(Link newLink){
        this.nextLink = newLink;
        
    }
//    public Link getPrevious(){
//        return previousLink;
//    }
//    public void setPrevious(Link newLink){
//        this.previousLink = newLink;
//        
//    }    

    
    
}

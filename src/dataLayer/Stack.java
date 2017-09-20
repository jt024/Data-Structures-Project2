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
public class Stack {
    
    private Link root = null;
//    private Link foundLink=null;
    
    public void setRoot(Link topLink){
        this.root = topLink;
    }
    public Link getRoot(){
        return root;
    }
    
    public void addLink(int value){
        Link temp = new Link();
        
        if(root==null) 
        {
            root = new Link();
            root.setValue(value);
        }   
        else
        {
            temp.setValue(value);
            temp.setNextLink(root);
            root = temp;
        }

    }
    
    public Link searchLinkList(int value, Link start){
        if (start.getValue()==value) 
            return start;
        else
            return recursiveSearch(start.getNextLink(),value);  
    }
    public Link recursiveSearch(Link next, int value){
        if(next.getValue()==value)
            return next;
        else
            return recursiveSearch(next.getNextLink(),value);
    }
    
    public void deleteLink(Link deleteLink){
        
        if (root==deleteLink) {
            root = root.getNextLink();
        }
        else
            recursiveDelete(root,deleteLink);
    }
    
    public void recursiveDelete(Link startLink, Link deleteLink){
        if (startLink.getNextLink()==deleteLink) 
            startLink.setNextLink(startLink.getNextLink().getNextLink());
        else
            recursiveDelete(startLink.getNextLink(),deleteLink);
        
        
    }
    
//    public void deleteLink(){
//        if (root.getNextLink()!=null) {
//            root = root.getNextLink();
//        }
//    }
    
    
}

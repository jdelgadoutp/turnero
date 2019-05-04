/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author utp
 */
public class NodeLlegada {
    
    private Usuario data; 
    private NodeLlegada next; 
    private Date fecha; 

    public Usuario getData() {
        return data;
    }

    public void setData(Usuario data) {
        this.data = data;
    }

    public NodeLlegada getNext() {
        return next;
    }

    public void setNext(NodeLlegada next) {
        this.next = next;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    
    

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import jakarta.persistence.*;
@Entity
@Table(name = "productos")
public class UserModel {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Crear las variables que va a guardar la BD 
     
    private Long ID;
    
    @Column(name = "NOMBRE", nullable = false)
    private String NOMBRE;
    
    @Column(name = "DESCRIPCIÓN", nullable = false)
    private String DESCRIPCIÓN;
    
    @Column(name = "PRECIO", nullable = false)
    private int PRECIO;
    
    @Column(name = "CANTIDAD", nullable = false)
    private int CANTIDAD;
    //Creación de los métodos GET.

    public Long getID() {
        return ID;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public String getDESCRIPCIÓN() {
        return DESCRIPCIÓN;
    }

    public int getPRECIO() {
        return PRECIO;
    }

    public int getCANTIDAD() {
        return CANTIDAD;
    }
    
    //Creación de los métodos SET.

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public void setDESCRIPCIÓN(String DESCRIPCIÓN) {
        this.DESCRIPCIÓN = DESCRIPCIÓN;
    }

    public void setPRECIO(int PRECIO) {
        this.PRECIO = PRECIO;
    }

    public void setCANTIDAD(int CANTIDAD) {
        this.CANTIDAD = CANTIDAD;
    }
    
}
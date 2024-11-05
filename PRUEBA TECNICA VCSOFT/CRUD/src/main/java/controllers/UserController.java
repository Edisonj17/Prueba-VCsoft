/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import models.UserModel;
import Services.UserService;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tienda_online")
public class UserController {
    
    @Autowired
    private UserService UserService;    
    
    @GetMapping("/tienda_online")
    public ArrayList<UserModel> getNombre(){
        return this.UserService.getNombre();
        
    }
    
    @PostMapping("/productos")
    public UserModel saveUser(@RequestBody UserModel productos){
        return this.UserService.saveUser(productos); 
    }
      
    @GetMapping(path = "/{ID}")
    public Optional<UserModel> getUserById(@PathVariable("ID") Long ID){    
        return this.UserService.getById(ID);    
    }
    
    @PutMapping(path = "/{ID}")
    public UserModel updateUserById(@RequestBody UserModel request, @PathVariable("ID") long ID){
        return this.UserService.updateById(request, ID);
    }
    @DeleteMapping(path = "/{ID}")
    public String deleteById(@PathVariable("ID") long ID){
        boolean ok = this.UserService.deleteUser(ID);
        if (ok){
            return "El usuario " + ID + " ha sido eliminado!";
        }else{
            return "Error, usuario no encontrado";
        }
    }
}
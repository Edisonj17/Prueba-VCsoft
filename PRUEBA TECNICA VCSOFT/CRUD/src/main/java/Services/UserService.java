/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;


import models.UserModel;
import repositories.IUserRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired  
    IUserRepository userRepository;   
    public ArrayList<UserModel> getNombre(){
        return(ArrayList<UserModel>) userRepository.findAll();
    }
    
    public UserModel saveUser (UserModel productos){
        return userRepository.save(productos);
    }
    
    public Optional<UserModel> getById(Long ID){
        return userRepository.findById(ID);
    }
    
    public UserModel updateById(UserModel request, Long ID){
        UserModel UserModel = userRepository.findById(ID).get();
                
        UserModel.setNOMBRE(request.getNOMBRE());
        UserModel.setDESCRIPCIÓN(request.getDESCRIPCIÓN());
        UserModel.setPRECIO(request.getPRECIO());
        UserModel.setCANTIDAD(request.getCANTIDAD());
        userRepository.save(UserModel);
        return UserModel;
    }
    
    public Boolean deleteUser (Long ID){
        try{
            userRepository.deleteById(ID);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}

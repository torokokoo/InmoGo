package com.inmogo.api.Service;

import com.inmogo.api.Entity.UserTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.inmogo.api.Repository.UserRepository;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepo;

    /**
     * Busca en el repositorio si existe un Usuario con un correo especifico.
     * @param email El correo a buscar
     * @return El usuario si existe, un RuntimeException si no.
     */
    public UserTemplate findByEmail(String email){
        return userRepo.findByEmail(email).orElseThrow(() -> new RuntimeException("Usuario no encontrado."));
    }

    /**
     * Busca en el repositorio si existe un Usuario con una ID especifica.
     * @param id La ID a buscar.
     * @return El usuario si existe. un RuntimeException si no.
     */
    public UserTemplate findById(Long id){
        return userRepo.findById(id).orElseThrow(() -> new RuntimeException("Usuario no encontrado."));
    }

    /**
     * Registra al pre-usuario (usuario antes de registro) al repositorio,
     * si es que no existe un usuario con el mismo correo o RUT.
     * @param tempUser El pre-usuario a buscar.
     * @return El guardado del pre-usuario (ahora usuario) al repositorio.
     */
    public UserTemplate register(UserTemplate tempUser){
        if (userRepo.findByEmail(tempUser.getEmail()).isPresent()){
            throw new RuntimeException("Ya hay una cuenta con ese correo.");
        }
        if (userRepo.findByRut(tempUser.getRut()).isPresent()){
            throw new RuntimeException("Ya hay una cuenta con esa RUT.");
        }
        return userRepo.save(tempUser);
    }

    /**
     * Revisa si las credenciales ingresadas son validas (si existen en un mismo usuario),
     * y despues devuelve al usuario con las mismas.
     * @param email El correo del usuario.
     * @param password La clave del usuario.
     * @return El usuario si existe, RuntimeException si no.
     */
    public UserTemplate login(String email, String password){
        //Buscar usuario con correo.
        UserTemplate temp = userRepo.findByEmail(email).orElseThrow(() -> new RuntimeException("Credenciales Invalidas."));
        //Se encontro, revisar clave.
        if (!temp.getPassword().equals(password)){
            throw new RuntimeException(("Clave incorrecta."));
        }
        return temp;
    }
}
package com.inmogo.api.Service;

import com.inmogo.api.Entity.UserTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.inmogo.api.Repository.UserRepository;

/**
 * Servicio para gestionar las operaciones relacionadas con los usuarios.
 * 
 * Este servicio maneja las operaciones de negocio asociadas a los usuarios, incluyendo el registro,
 * el inicio de sesión y la búsqueda de usuarios por ID. Utiliza el repositorio {@link UserRepository}
 * para interactuar con la base de datos y realizar las operaciones necesarias sobre los datos de los usuarios.
 * 
 * @see UserRepository
 */

@Service
public class UserService {
    @Autowired
    private UserRepository userRepo;

    /**
     * Registra un nuevo usuario en el sistema. 
     * Crea una nueva instancia de {@link UserTemplate} con los datos proporcionados y la guarda en la base de datos.
     * Si ya existe un usuario con el mismo correo electrónico, el método devuelve null. 
     * 
     * @param id Identificador del usuario.
     * @param name Nombre del usuario.
     * @param rut RUT del usuario
     * @param email Correo electrónico del usuario.
     * @param password Contraseña del usuario.
     * @param role Rol del usuario (representado como entero). 
     *        Los roles son: 0(Visitante), 1(Administrador), 2(Mod), 3(Propietario), 4(Adquiriente)
     * @return El usuario registrado o null si ya existe un usuario con el mismo correo electrónico.
     */
   
    public UserTemplate register(long id, String name, String rut, String email, String password, Integer role){
        UserTemplate userTemplate = new UserTemplate(id, name, rut, email, password, role);
        UserTemplate exists = userRepo.findUserByEmail(userTemplate.getEmail());
        System.out.println("Register");
        if (exists != null){
            return null;
        }
        return userRepo.save(userTemplate);
    }

    /**
     * Inicia sesión en el sistema.
     * Verifica las credenciales del usuario (correo electrónico y contraseña) y devuelve el usuario correspondiente
     * si las credenciales son correctas. Si no se encuentra el usuario o las credenciales no coinciden, el método 
     * devuelve null. 
     * 
     * @param email Correo electrónico del usuario.
     * @param password Contraseña del usuario.
     * @return El usuario correspondiente si las credenciales son válidas, o null si no lo son.
     */
    
    public UserTemplate login(String email, String password){
        UserTemplate userTemplate = userRepo.findUserByEmail(email);
        System.out.println("Login");
        if (userTemplate != null){
            if (password.equals(userTemplate.getPassword())){
                return userTemplate;
            }
        }
        return null;
    }

    /**
     * Busca un usuario por su identificador.
     * Busca y devuelve el usuario correspondiente al ID proporcionado. 
     * 
     * @param Id Identificador del usuario.
     * @return El usuario correspondiente al ID proporcionado.
     */
    
    public UserTemplate getUserById(long Id){
        return userRepo.findUserById(Id);
    }

    public Integer getRoleById(long id) {
        UserTemplate user = userRepo.findUserById(id);
        return user.getRole();
    }

}

package com.inmogo.api.Controller;

import com.inmogo.api.Entity.Listing;
import com.inmogo.api.Service.ListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Controlador para gestionar las operaciones relacionadas con las publicaciones (Listings).
 * 
 * Este controlador expone endpoints para crear nuevas publicaciones, obtener todas las publicaciones y
 * buscar una publicación específica por su ID. Utiliza el servicio {@link ListingService} para realizar
 * las operaciones de negocio relacionadas con las publicaciones.
 * 
 * Atributos:
 * 
 * @param listingService Servicio para manejar las operaciones de negocio relacionadas con las publicaciones.
 *                       Se utiliza para crear, obtener y buscar publicaciones en el sistema.
 */

@RestController
@CrossOrigin
@RequestMapping("/api/listing")
public class ListingController {

    @Autowired
    private ListingService listingService;

    /**
     * Crea una nueva publicación con los datos proporcionados.
     * 
     * @param listingRequest Contiene la información necesaria para crear una nueva publicación.
     * @return La publicación creada.
     */
    @PostMapping("/create")
    public Listing post(@RequestBody ListingRequest listingRequest) {
        System.out.println("Creando publicacion");
        return listingService.post(
                listingRequest.isSale(),
                listingRequest.isHouse(),
                listingRequest.getTitle(),
                listingRequest.getImages(),
                listingRequest.getDescription(),
                listingRequest.getDimensions(),
                listingRequest.getAddress(),
                listingRequest.getDistrict(),
                listingRequest.getSectorDescription(),
                listingRequest.getPrice(),
                listingRequest.getReservations(),
                listingRequest.getOwnerId()
        );
    }

    /**
     * Obtiene todas las publicaciones disponibles.
     * 
     * @return Una lista de todas las publicaciones disponibles en el sistema.
     */
    @GetMapping("/all")
    public List<Listing> getAll() {
        System.out.printf("Consiguiendo todas las publicaciones");
        return listingService.getAll();
    }

    /**
     * Busca una publicación específica por su ID.
     *
     * @param id El ID de la publicación que se desea buscar.
     * @return La publicación correspondiente al ID proporcionado, si existe.
     */
    @GetMapping("/{id}")
    public Optional<Listing> getById(@PathVariable long id) {
        System.out.printf("Buscando propiedad por id");
        return listingService.getById(id);
    }

    @PostMapping("/approve/{id}")
    public Listing approve(@PathVariable long id) {
        System.out.println("Propiedad aprobada");
        return listingService.approve(id);
    }
}

//package fr.gparrot.gparrotback.controllers;
//
//import fr.gparrot.gparrotback.entities.Vehicule;
//import fr.gparrot.gparrotback.VehiculeGParrotRepository;
//import jakarta.transaction.Transactional;
//import jakarta.validation.Valid;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/vehicule")
//@CrossOrigin
//public class Controller {
//    private VehiculeGParrotRepository leRepository;
//    @Autowired
//    public Controller (VehiculeGParrotRepository gparrotRepositoryVehicule){this.leRepository = gparrotRepositoryVehicule;}
//    @RequestMapping(value="/create", method= RequestMethod.POST)
//    @Transactional
//    public ResponseEntity createVehicule (@RequestBody @Valid Vehicule vehicule) {
//        try {
//            leRepository.save(vehicule);
////        throw new RuntimeException();
//            return new ResponseEntity(HttpStatus.CREATED);
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
////        throw new RuntimeException("Message d'erreur");
////        System.out.println(visit);
//    }
//}

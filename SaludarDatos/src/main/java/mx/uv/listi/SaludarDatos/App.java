package mx.uv.listi.SaludarDatos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class App {
    @Autowired
    Isaludadores isaludadores;

    @RequestMapping(value = "/saludos", method = RequestMethod.GET)
    public Iterable<Saludadores> dameSaludos(){
        return isaludadores.findAll();
    }

    @RequestMapping(value = "/saludos", method = RequestMethod.POST)
    public void crearSaludos(@RequestBody Saludadores saludo){
        try{
            isaludadores.save(saludo);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

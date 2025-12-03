package mx.uv.listi.SaludarDatos;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Isaludadores extends CrudRepository<Saludadores, Integer> {
    List<Saludadores> getAllById(Integer id);
}

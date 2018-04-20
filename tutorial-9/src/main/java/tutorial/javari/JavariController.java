package tutorial.javari;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static tutorial.javari.JavariData.animalList;
import static tutorial.javari.JavariData.deleteFromCsv;
import static tutorial.javari.JavariData.readCsv;

import java.util.List;
import java.util.Optional;

import org.json.JSONException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tutorial.javari.animal.Animal;
import tutorial.javari.errormessages.EmptyDatabaseException;
import tutorial.javari.errormessages.NoAnimalException;

@RestController
public class JavariController {

    @RequestMapping(value = "/javari", method = GET)
    public List<Animal> listAnimal() {
        readCsv();
        if (animalList.size() > 0)
            return animalList;
        else throw new EmptyDatabaseException();
    }

    @RequestMapping(value = "/javari/{id}", method = GET)
    public Animal findAnimal(@PathVariable Integer id) {
        readCsv();

        Optional<Animal> findAnimal = animalList.stream().filter(s -> s.getId()
                .equals(id)).findFirst();
        if (findAnimal.isPresent()) {
            return findAnimal.get();
        } else {
            throw new NoAnimalException();
        }
    }


    @DeleteMapping(value = "javari/{id}")
    public Animal removeAnimal(@PathVariable Integer id) {
        Animal animal = deleteFromCsv(id);
        if (animal != null) {
            return animal;
        } else {
            throw new EmptyDatabaseException();
        }

    }

    @PostMapping(value = "javari/{json}")
    public Animal addAnimal(@PathVariable String json)
            throws JSONException {
        return JavariData.addAnimalToDatabase(json);
    }
}

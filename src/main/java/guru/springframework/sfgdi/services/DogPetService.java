package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"dog", "default"})
public class DogPetService implements PetService {
    public String getPetType(){
        return "Dogs are the best!";
    }
}

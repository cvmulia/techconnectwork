package oceansfourcasino.Controllers;

import oceansfourcasino.General_Classes.Casino;
import oceansfourcasino.Models.SlotPlayer;
import oceansfourcasino.NonCard.SlotMachine;
import oceansfourcasino.Repositories.SlotPlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SlotPlayerController {

    @Autowired
    SlotPlayerRepository slotPlayerRepository;


    @GetMapping(value="/oceansfour")
    public ResponseEntity<String> getWelcomePage(){
        Casino casino = new Casino();
        String message = casino.welcomeMessage();
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}

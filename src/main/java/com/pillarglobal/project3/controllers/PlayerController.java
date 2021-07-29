package com.pillarglobal.project3.controllers;

import com.pillarglobal.project3.models.Player;
import com.pillarglobal.project3.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PlayerController {

    @Autowired
    PlayerService playerService;

    @GetMapping("/getPlayer/{id}")
    public ResponseEntity<?> getPlayer(@PathVariable int id) {
        if (playerService.playerExists(id)) {
            return new ResponseEntity<>(playerService.getPlayer(id), HttpStatus.OK);
        } else
            return new ResponseEntity<>("Player " + id + " does not exist", HttpStatus.NOT_FOUND);
    }

    @GetMapping("/getPlayers")
    public ResponseEntity<?> getPlayers() {
        return new ResponseEntity<>(playerService.getPlayers(), HttpStatus.OK);
    }

    @PostMapping("/addPlayer")
    public ResponseEntity<?> addPlayer(@RequestBody Player player) {
        playerService.addPlayer(player);
        return new ResponseEntity<>("Player " + player + " was added", HttpStatus.CREATED);

    }
    @PutMapping("/updatePlayer")
    public ResponseEntity<?> updatePlayer(@RequestBody Player player){
        if(playerService.playerExists(player.getId())){
            playerService.update(player);
            return new ResponseEntity<>("Player " + player + " was updated", HttpStatus.ACCEPTED);

        }
        else  return new ResponseEntity<>("Player " + player.getId() + " was not updated", HttpStatus.NOT_FOUND);

    }

    @DeleteMapping("/deletePlayer/{id}")
    public ResponseEntity<?> deletePlayer(@PathVariable int id){
        if(playerService.playerExists(id)){
            playerService.delete(id);
            return new ResponseEntity<>("Player with id " + id + " was deleted", HttpStatus.ACCEPTED);

        }
        else  return new ResponseEntity<>("Player " + id + " was not updated", HttpStatus.NOT_FOUND);


    }

}

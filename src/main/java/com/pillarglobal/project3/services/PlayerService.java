package com.pillarglobal.project3.services;

import com.pillarglobal.project3.models.Player;
import com.pillarglobal.project3.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PlayerService {


    @Autowired
    private PlayerRepository playerRepository;

    public boolean playerExists(int id) {
        return playerRepository.existPlayer(id);
    }

    public Player getPlayer(int id) {
        for(Player p:playerRepository.getSet()){
            if(p.getId()==id)
                return p;
        }
        return null;
    }

    public Set<Player> getPlayers() {
        return playerRepository.getSet();
    }

    public void addPlayer(Player player) {
        playerRepository.addPlayer(player);

    }

    public void update(Player player) {
        for(Player p:playerRepository.getSet()){
            if(player.getId()==p.getId()) {
                playerRepository.removePlayer(p);
                playerRepository.addPlayer(player);
            }
        }
    }

    public void delete(int id) {

        Set<Player> set = playerRepository.getSet();
        for(Player p: set){

            if(p.getId()==id){

                playerRepository.removePlayer(p);
            }
        }
    }
}

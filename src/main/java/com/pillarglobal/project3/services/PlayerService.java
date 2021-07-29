package com.pillarglobal.project3.services;

import com.pillarglobal.project3.models.Player;
import com.pillarglobal.project3.repositories.PlayersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class PlayerService {


    @Autowired
    private PlayersRepository playersRepository;

    public boolean playerExists(int id) {
        return playersRepository.existsById(id);
    }

    public Player getPlayer(int id) {
        return (Player) playersRepository.findById(id).get();

    }

    public Set<Player> getPlayers() {
        return new LinkedHashSet<>(playersRepository.findAll());
    }

    public void addPlayer(Player player) {
        playersRepository.save(player);

    }

    public void update(Player player) {
        playersRepository.save(player);
    }

    public void delete(int id) {
        playersRepository.deleteById(id);

    }
}

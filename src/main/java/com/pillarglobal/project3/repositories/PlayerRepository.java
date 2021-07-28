package com.pillarglobal.project3.repositories;

import com.pillarglobal.project3.models.Player;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class PlayerRepository {
    Set<Player> playersSet=new HashSet<>();

    public void addPlayer(Player player){
        playersSet.add(player);
    }
    public void removePlayer(Player player){
        playersSet.remove(player);
    }
    public boolean existPlayer(int id){
        for(Player p:playersSet){
            if(p.getId()==id)
                return true;
        }
        return false;
    }

    public Set<Player> getSet(){
        return playersSet;
    }


}

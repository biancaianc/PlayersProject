package com.pillarglobal.project3.repositories;

import com.pillarglobal.project3.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayersRepository extends JpaRepository<Player,Integer> {

}

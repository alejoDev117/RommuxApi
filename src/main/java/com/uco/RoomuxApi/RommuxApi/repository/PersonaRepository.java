package com.uco.RoomuxApi.RommuxApi.repository;

import com.uco.RoomuxApi.RommuxApi.entity.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PersonaRepository extends JpaRepository<PersonaEntity, UUID>{

}

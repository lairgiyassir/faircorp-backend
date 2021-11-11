package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.Heater;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface HeaterDao extends JpaRepository<Heater, Long>, HeaterDaoCustom {
    @Modifying
    @Query("delete from Heater h where h.room.id =:roomId")
    void deleteHeaters(@Param("roomId") Long id);

}
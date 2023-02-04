package com.valorant.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valorant.api.entity.Arma;

@Repository
public interface WeaponRepository extends JpaRepository<Arma, Integer> {

}

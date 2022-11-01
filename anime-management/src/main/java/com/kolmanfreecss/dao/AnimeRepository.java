package com.kolmanfreecss.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kolmanfreecss.domain.Anime;


@Repository
public interface AnimeRepository extends JpaRepository<Anime,Integer>{

}

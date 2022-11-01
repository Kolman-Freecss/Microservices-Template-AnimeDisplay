package com.kolmanfreecss.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kolmanfreecss.dao.AnimeRepository;
import com.kolmanfreecss.domain.Anime;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimeServiceImpl implements AnimeService {

	@Autowired
	AnimeRepository repository;
	List<Anime> animeList = new ArrayList<>();

	@Override
	public void addAnime(Anime anime) {
			repository.save(anime);
	}

	@Override
	public List<Anime> getAnimes() {
		return repository.findAll();
	}
}

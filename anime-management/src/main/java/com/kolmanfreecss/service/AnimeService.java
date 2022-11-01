package com.kolmanfreecss.service;


import java.util.List;

import com.kolmanfreecss.domain.Anime;

public interface AnimeService {
	
	void addAnime(Anime anime);
	List<Anime> getAnimes();
	
}

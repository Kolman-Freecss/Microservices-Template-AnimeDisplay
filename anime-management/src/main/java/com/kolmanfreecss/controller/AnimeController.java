package com.kolmanfreecss.controller;

import com.kolmanfreecss.domain.Anime;
import com.kolmanfreecss.service.AnimeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/")
public class AnimeController {

	@Autowired
	AnimeService animeService;

	@PostMapping
	public void saveEmployeeProfile(@RequestBody Anime anime) {
		animeService.addAnime(anime);
	}

	@GetMapping
	public List<Anime> getAllEmployee() {
		return animeService.getAnimes();
	}

}

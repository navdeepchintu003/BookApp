package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.Favourite;

@Service
public interface FavouriteService {
	public Favourite saveFavourite(Favourite f);
	public List<Favourite> getAllFavourite (String username);
	public Favourite deleteFromFavourite(String id, String username);
	
	public List<Favourite> getFavouriteBooksByIdAndUsername(String id, String username);
	
}

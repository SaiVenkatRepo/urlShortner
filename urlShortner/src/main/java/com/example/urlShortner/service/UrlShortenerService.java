package com.example.urlShortner.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.urlShortner.entity.UrlMapping;
import com.example.urlShortner.repository.UrlRepository;

@Service
public class UrlShortenerService {

    @Autowired
    private UrlRepository urlRepository;
    
    public String shortenUrl(String longUrl) {
		 String shortUrl = generateRandomString();
	        urlRepository.save(new UrlMapping(longUrl, shortUrl));
	        return shortUrl;
	}
 

    private String generateRandomString() {
        // Generate a random UUID and remove hyphens
        String uuid = UUID.randomUUID().toString().replace("-", "");
        // Return the first 8 characters as the short URL
        return uuid.substring(0, 8);
    }

	
}

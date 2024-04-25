package com.example.urlShortner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.urlShortner.entity.UrlMapping;

@Repository
public interface UrlRepository extends JpaRepository<UrlMapping, Long> {
}
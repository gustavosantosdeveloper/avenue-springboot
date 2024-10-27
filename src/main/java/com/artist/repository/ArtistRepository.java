package com.artist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.artist.model.Artist;

@Repository
public interface ArtistRepository extends JpaRepository<Artist,Long> {
}

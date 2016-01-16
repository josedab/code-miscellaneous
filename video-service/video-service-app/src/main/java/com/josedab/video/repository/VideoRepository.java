package com.josedab.video.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.josedab.video.domain.Video;

public interface VideoRepository extends JpaRepository<Video, Long>{
    List<Video> findByTitle(@Param("title") String title);
}

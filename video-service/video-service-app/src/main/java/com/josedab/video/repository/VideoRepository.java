package com.josedab.video.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.josedab.video.domain.Video;

public interface VideoRepository extends JpaRepository<Video, Long> {
}

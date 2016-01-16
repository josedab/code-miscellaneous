package com.josedab.video.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.josedab.video.domain.Video;


@RepositoryRestResource(collectionResourceRel = "videos", path = "videos")
public interface VideoRepository extends JpaRepository<Video, Long>{
    List<Video> findByTitle(@Param("title") String title);
}

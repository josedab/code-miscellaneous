package com.josedab.video.controller;


import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.josedab.video.domain.Video;
import com.josedab.video.repository.VideoRepository;

@RestController
@RequestMapping("/api")
public class VideoController {
    private final Logger logger = LoggerFactory.getLogger(VideoController.class);
    
    @Autowired
    private VideoRepository videoRepository;

    @RequestMapping(value = "/videos", method = RequestMethod.GET)
    @ResponseBody
    public List<Video> getVideos() {
        return videoRepository.findAll();
    }
    
    @RequestMapping(value = "/videos/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Video getVideoById(
            @PathVariable(value="id") long id) {
        return videoRepository.findOne(id);
    }
    
    @RequestMapping(value = "/videos", method = RequestMethod.POST)
    @ResponseBody
    public Video storeVideo(
            @Valid @RequestBody(required = true) final Video videos) {
        return videoRepository.save(videos);
    }
    
    @RequestMapping(value = "/videos/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public Video updateVideo(
            @PathVariable(value="id") long id,
            @Valid @RequestBody(required = true) final Video video) {
        final long videoId = video.getId();
        if (videoId != videoId) {
            throw new IllegalArgumentException(
                    "Video must be consistent with the resource specified on the url path");
        }
        return videoRepository.save(video);
    }
    
    @RequestMapping(value = "/videos/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteVideo(
            @PathVariable(value="id") long id) {
        videoRepository.delete(id);
    }
    

}

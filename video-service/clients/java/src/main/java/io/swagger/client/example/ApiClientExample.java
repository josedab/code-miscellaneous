package io.swagger.client.example;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.VideocontrollerApi;
import io.swagger.client.model.Video;

import java.util.List;

public class ApiClientExample {

    public static void main(String[] args) throws ApiException {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath("http://localhost:8080/");

        VideocontrollerApi videoApi = new VideocontrollerApi(apiClient);

        List<Video> videos = videoApi.getVideosUsingGET();
        System.out.println("Number of videos on db: " + videos.size());

        System.out.println("Adding videos to db");
        for (int i = 0; i < 5; i++) {
            Video video = new Video();
            video.setId(Long.valueOf(i));
            video.setIdentifier("id-" + i);
            video.setDescription("Default <" + i + ">");
            videoApi.storeVideoUsingPOST(video);
        }

        videos = videoApi.getVideosUsingGET();
        System.out.println("Number of videos on db after POSTing: " + videos.size());
    }

}

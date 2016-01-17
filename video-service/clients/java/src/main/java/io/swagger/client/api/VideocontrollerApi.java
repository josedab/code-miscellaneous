package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.Video;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-16T17:37:17.007-08:00")
public class VideocontrollerApi {
  private ApiClient apiClient;

  public VideocontrollerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public VideocontrollerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * getVideos
   * 
   * @return List<Video>
   */
  public List<Video> getVideosUsingGET() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/videos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<List<Video>> returnType = new GenericType<List<Video>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * storeVideo
   * 
   * @param videos videos
   * @return Video
   */
  public Video storeVideoUsingPOST(Video videos) throws ApiException {
    Object postBody = videos;
    
     // verify the required parameter 'videos' is set
     if (videos == null) {
        throw new ApiException(400, "Missing the required parameter 'videos' when calling storeVideoUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/videos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<Video> returnType = new GenericType<Video>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * getVideoById
   * 
   * @param id id
   * @return Video
   */
  public Video getVideoByIdUsingGET(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling getVideoByIdUsingGET");
     }
     
    // create path and map variables
    String path = "/api/videos/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<Video> returnType = new GenericType<Video>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * updateVideo
   * 
   * @param id id
   * @param video video
   * @return Video
   */
  public Video updateVideoUsingPUT(Long id, Video video) throws ApiException {
    Object postBody = video;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling updateVideoUsingPUT");
     }
     
     // verify the required parameter 'video' is set
     if (video == null) {
        throw new ApiException(400, "Missing the required parameter 'video' when calling updateVideoUsingPUT");
     }
     
    // create path and map variables
    String path = "/api/videos/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<Video> returnType = new GenericType<Video>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * deleteVideo
   * 
   * @param id id
   * @return void
   */
  public void deleteVideoUsingDELETE(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling deleteVideoUsingDELETE");
     }
     
    // create path and map variables
    String path = "/api/videos/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "*/*"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
}

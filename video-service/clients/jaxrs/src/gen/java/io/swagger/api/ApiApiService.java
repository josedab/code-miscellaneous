package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Video;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-16T17:38:46.038-08:00")
public abstract class ApiApiService {
  
      public abstract Response getVideosUsingGET(SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response storeVideoUsingPOST(Video videos,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response getVideoByIdUsingGET(Long id,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response updateVideoUsingPUT(Long id,Video video,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response deleteVideoUsingDELETE(Long id,SecurityContext securityContext)
      throws NotFoundException;
  
}

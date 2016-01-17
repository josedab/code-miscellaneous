package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.ApiApiService;
import io.swagger.api.factories.ApiApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Video;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/api")


@io.swagger.annotations.Api(description = "the api API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-16T17:38:46.038-08:00")
public class ApiApi  {
   private final ApiApiService delegate = ApiApiServiceFactory.getApiApi();

    @GET
    @Path("/videos")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "getVideos", notes = "", response = Video.class, responseContainer = "List", tags={ "video-controller",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Video.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Video.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = Video.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Video.class, responseContainer = "List") })

    public Response getVideosUsingGET(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getVideosUsingGET(securityContext);
    }
    @POST
    @Path("/videos")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "storeVideo", notes = "", response = Video.class, tags={ "video-controller",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Video.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "Created", response = Video.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Video.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = Video.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Video.class) })

    public Response storeVideoUsingPOST(@ApiParam(value = "videos" ,required=true) Video videos,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.storeVideoUsingPOST(videos,securityContext);
    }
    @GET
    @Path("/videos/{id}")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "getVideoById", notes = "", response = Video.class, tags={ "video-controller",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Video.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Video.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = Video.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Video.class) })

    public Response getVideoByIdUsingGET(@ApiParam(value = "id",required=true) @PathParam("id") Long id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getVideoByIdUsingGET(id,securityContext);
    }
    @PUT
    @Path("/videos/{id}")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "updateVideo", notes = "", response = Video.class, tags={ "video-controller",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Video.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "Created", response = Video.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Video.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = Video.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found", response = Video.class) })

    public Response updateVideoUsingPUT(@ApiParam(value = "id",required=true) @PathParam("id") Long id,@ApiParam(value = "video" ,required=true) Video video,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateVideoUsingPUT(id,video,securityContext);
    }
    @DELETE
    @Path("/videos/{id}")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "deleteVideo", notes = "", response = Void.class, tags={ "video-controller" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 204, message = "No Content", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = Void.class) })

    public Response deleteVideoUsingDELETE(@ApiParam(value = "id",required=true) @PathParam("id") Long id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteVideoUsingDELETE(id,securityContext);
    }
}

package io.swagger.api;

import io.swagger.model.*;

import io.swagger.model.Video;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;
import io.swagger.annotations.AuthorizationScope;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static org.springframework.http.MediaType.*;

@Controller
@RequestMapping(value = "/api", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/api", description = "the api API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2016-01-16T17:16:29.688-08:00")
public class ApiApi {
  

  @ApiOperation(value = "getCredentials", notes = "", response = Video.class, responseContainer = "List")
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "OK"),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 403, message = "Forbidden"),
    @ApiResponse(code = 404, message = "Not Found") })
  @RequestMapping(value = "/videos", 
    produces = { "*/*" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity<List<Video>> getCredentialsUsingGET1()
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<List<Video>>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "storeVideo", notes = "", response = Video.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "OK"),
    @ApiResponse(code = 201, message = "Created"),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 403, message = "Forbidden"),
    @ApiResponse(code = 404, message = "Not Found") })
  @RequestMapping(value = "/videos", 
    produces = { "*/*" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity<Video> storeVideoUsingPOST(

@ApiParam(value = "videos" ,required=true ) @RequestBody Video videos
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Video>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "getCredentials", notes = "", response = Video.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "OK"),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 403, message = "Forbidden"),
    @ApiResponse(code = 404, message = "Not Found") })
  @RequestMapping(value = "/videos/{id}", 
    produces = { "*/*" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity<Video> getCredentialsUsingGET(
@ApiParam(value = "id",required=true ) @PathVariable("id") Long id

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Video>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "updateVideo", notes = "", response = Video.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "OK"),
    @ApiResponse(code = 201, message = "Created"),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 403, message = "Forbidden"),
    @ApiResponse(code = 404, message = "Not Found") })
  @RequestMapping(value = "/videos/{id}", 
    produces = { "*/*" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity<Video> updateVideoUsingPUT(
@ApiParam(value = "id",required=true ) @PathVariable("id") Long id

,
    

@ApiParam(value = "video" ,required=true ) @RequestBody Video video
)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Video>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "deleteVideo", notes = "", response = Void.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "OK"),
    @ApiResponse(code = 204, message = "No Content"),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 403, message = "Forbidden") })
  @RequestMapping(value = "/videos/{id}", 
    produces = { "*/*" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity<Void> deleteVideoUsingDELETE(
@ApiParam(value = "id",required=true ) @PathVariable("id") Long id

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Void>(HttpStatus.OK);
  }

  
}

package io.swagger.api.factories;

import io.swagger.api.ApiApiService;
import io.swagger.api.impl.ApiApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-16T17:38:46.038-08:00")
public class ApiApiServiceFactory {

   private final static ApiApiService service = new ApiApiServiceImpl();

   public static ApiApiService getApiApi()
   {
      return service;
   }
}

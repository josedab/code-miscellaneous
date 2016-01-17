'use strict';

exports.getCredentialsUsingGET1 = function(args, res, next) {
  /**
   * parameters expected in the args:
   **/

var examples = {};
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
exports.storeVideoUsingPOST = function(args, res, next) {
  /**
   * parameters expected in the args:
   * videos (Video)
   **/

var examples = {};
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
exports.getCredentialsUsingGET = function(args, res, next) {
  /**
   * parameters expected in the args:
   * id (Long)
   **/

var examples = {};
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
exports.updateVideoUsingPUT = function(args, res, next) {
  /**
   * parameters expected in the args:
   * id (Long)
   * video (Video)
   **/

var examples = {};
  

  
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
  
}
exports.deleteVideoUsingDELETE = function(args, res, next) {
  /**
   * parameters expected in the args:
   * id (Long)
   **/

var examples = {};
  

  
  res.end();
}

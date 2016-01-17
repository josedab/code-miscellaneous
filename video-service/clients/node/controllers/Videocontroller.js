'use strict';

var url = require('url');


var Videocontroller = require('./VideocontrollerService');


module.exports.getCredentialsUsingGET1 = function getCredentialsUsingGET1 (req, res, next) {
  Videocontroller.getCredentialsUsingGET1(req.swagger.params, res, next);
};

module.exports.storeVideoUsingPOST = function storeVideoUsingPOST (req, res, next) {
  Videocontroller.storeVideoUsingPOST(req.swagger.params, res, next);
};

module.exports.getCredentialsUsingGET = function getCredentialsUsingGET (req, res, next) {
  Videocontroller.getCredentialsUsingGET(req.swagger.params, res, next);
};

module.exports.updateVideoUsingPUT = function updateVideoUsingPUT (req, res, next) {
  Videocontroller.updateVideoUsingPUT(req.swagger.params, res, next);
};

module.exports.deleteVideoUsingDELETE = function deleteVideoUsingDELETE (req, res, next) {
  Videocontroller.deleteVideoUsingDELETE(req.swagger.params, res, next);
};

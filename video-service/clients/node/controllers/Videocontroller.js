'use strict';

var url = require('url');


var Videocontroller = require('./VideocontrollerService');


module.exports.getVideosUsingGET = function getVideosUsingGET (req, res, next) {
  Videocontroller.getVideosUsingGET(req.swagger.params, res, next);
};

module.exports.storeVideoUsingPOST = function storeVideoUsingPOST (req, res, next) {
  Videocontroller.storeVideoUsingPOST(req.swagger.params, res, next);
};

module.exports.getVideoByIdUsingGET = function getVideoByIdUsingGET (req, res, next) {
  Videocontroller.getVideoByIdUsingGET(req.swagger.params, res, next);
};

module.exports.updateVideoUsingPUT = function updateVideoUsingPUT (req, res, next) {
  Videocontroller.updateVideoUsingPUT(req.swagger.params, res, next);
};

module.exports.deleteVideoUsingDELETE = function deleteVideoUsingDELETE (req, res, next) {
  Videocontroller.deleteVideoUsingDELETE(req.swagger.params, res, next);
};

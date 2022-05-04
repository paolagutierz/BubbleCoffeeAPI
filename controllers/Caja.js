'use strict';

var utils = require('../utils/writer.js');
var Caja = require('../service/CajaService');

module.exports.pedidoPOST = function pedidoPOST (req, res, next) {
  var pedido = req.swagger.params['pedido'].value;
  Caja.pedidoPOST(pedido)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.pedidoPagoPedidoIdPOST = function pedidoPagoPedidoIdPOST (req, res, next) {
  var pedidoId = req.swagger.params['pedidoId'].value;
  var pago = req.swagger.params['pago'].value;
  Caja.pedidoPagoPedidoIdPOST(pedidoId,pago)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.pedidoPedidoIdDELETE = function pedidoPedidoIdDELETE (req, res, next) {
  var pedidoId = req.swagger.params['pedidoId'].value;
  Caja.pedidoPedidoIdDELETE(pedidoId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.pedidoPedidoIdGET = function pedidoPedidoIdGET (req, res, next) {
  var pedidoId = req.swagger.params['pedidoId'].value;
  Caja.pedidoPedidoIdGET(pedidoId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.pedidoPedidoIdPUT = function pedidoPedidoIdPUT (req, res, next) {
  var pedidoId = req.swagger.params['pedidoId'].value;
  var pedido = req.swagger.params['pedido'].value;
  Caja.pedidoPedidoIdPUT(pedidoId,pedido)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

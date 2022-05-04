'use strict';

var utils = require('../utils/writer.js');
var Barista = require('../service/BaristaService');

module.exports.pedidoCompletadoPedidoIdPUT = function pedidoCompletadoPedidoIdPUT (req, res, next) {
  var pedidoId = req.swagger.params['pedidoId'].value;
  Barista.pedidoCompletadoPedidoIdPUT(pedidoId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.pedidoDetallePedidoIdGET = function pedidoDetallePedidoIdGET (req, res, next) {
  var pedidoId = req.swagger.params['pedidoId'].value;
  Barista.pedidoDetallePedidoIdGET(pedidoId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

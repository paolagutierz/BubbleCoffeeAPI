'use strict';


/**
 * Hacer pedido
 *
 * pedido Pedido Agregar pedido (optional)
 * returns Pedido
 **/
exports.pedidoPOST = function(pedido) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {"empty": false};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Pagar pedido
 *
 * pedidoId String pedido id
 * pago Pago pagar pedido (optional)
 * returns PedidoPagado
 **/
exports.pedidoPagoPedidoIdPOST = function(pedidoId,pago) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {"empty": false};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Cancelar pedido
 *
 * pedidoId String pedido id
 * returns PedidoCancelado
 **/
exports.pedidoPedidoIdDELETE = function(pedidoId) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {"empty": false};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Obetener pedido por ID
 *
 * pedidoId String pedido id
 * returns Pedido
 **/
exports.pedidoPedidoIdGET = function(pedidoId) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {"empty": false};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Actualizar pedido
 *
 * pedidoId String cambiar o actualizar pedido por id
 * pedido Pedido pedido a actualizar (optional)
 * returns Pedido
 **/
exports.pedidoPedidoIdPUT = function(pedidoId,pedido) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {"empty": false};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


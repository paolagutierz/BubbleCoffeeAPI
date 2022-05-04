'use strict';


/**
 * pedido completado
 *
 * pedidoId String pedido id
 * returns PedidoCompletado
 **/
exports.pedidoCompletadoPedidoIdPUT = function(pedidoId) {
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
 * detalle de pedido pagado.
 *
 * pedidoId String ver detalle de pedido para producirlo
 * returns PedidoPagado
 **/
exports.pedidoDetallePedidoIdGET = function(pedidoId) {
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


'use strict';

var utils = require('../utils/writer.js');
var Menu = require('../service/MenuService');

module.exports.createProductWithForm = function createProductWithForm (req, res, next) {
  var nombre = req.swagger.params['Nombre'].value;
  var categoria = req.swagger.params['Categoria'].value;
  var descripcion = req.swagger.params['Descripcion'].value;
  var precio = req.swagger.params['Precio'].value;
  var imagen = req.swagger.params['Imagen'].value;
  Menu.createProductWithForm(nombre,categoria,descripcion,precio,imagen)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.deleteProduct = function deleteProduct (req, res, next) {
  var productId = req.swagger.params['productId'].value;
  var api_key = req.swagger.params['api_key'].value;
  Menu.deleteProduct(productId,api_key)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.findProductByCategory = function findProductByCategory (req, res, next) {
  var category = req.swagger.params['category'].value;
  Menu.findProductByCategory(category)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.getProductById = function getProductById (req, res, next) {
  var productId = req.swagger.params['productId'].value;
  Menu.getProductById(productId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.updateProductWithForm = function updateProductWithForm (req, res, next) {
  var productId = req.swagger.params['productId'].value;
  var nombre = req.swagger.params['Nombre'].value;
  var descripcion = req.swagger.params['Descripcion'].value;
  var disponibilidad = req.swagger.params['Disponibilidad'].value;
  var precio = req.swagger.params['Precio'].value;
  var imagen = req.swagger.params['Imagen'].value;
  Menu.updateProductWithForm(productId,nombre,descripcion,disponibilidad,precio,imagen)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

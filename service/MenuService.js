'use strict';


/**
 * Agregar nuevo producto al Menu
 * Añadir producto al menu por medio de formulario
 *
 * nombre String   Introduce el nombre del producto (optional)
 * categoria List Elige la categoria del producto (optional)
 * descripcion String Introduce la descripcion del producto (optional)
 * precio String Introduce el  precio del producto (optional)
 * imagen File Imagen del producto (optional)
 * no response value expected for this operation
 **/
exports.createProductWithForm = function(nombre,categoria,descripcion,precio,imagen) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Eliminar producto del menu
 * Eliminar producto del menu por ID
 *
 * productId Long ID del producto a eliminar
 * api_key String  (optional)
 * no response value expected for this operation
 **/
exports.deleteProduct = function(productId,api_key) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


/**
 * Buscar producto por categoria
 * Se puede agregar categoria separando los string con comas
 *
 * category List Ver productos por categoria
 * returns List
 **/
exports.findProductByCategory = function(category) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = {};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * Buscar producto por ID
 * Retorna un solo producto
 *
 * productId Long Introduce el ID del producto
 * returns Menu
 **/
exports.getProductById = function(productId) {
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
 * Modificar o Actualizar un producto por medio de formulario
 * Modificar informacion del producto
 *
 * productId Long Introduce el ID del producto a actualizar
 * nombre String Modificar nombre del producto (optional)
 * descripcion String Modificar descripcion del producto (optional)
 * disponibilidad String Modificar disponibilidad del producto (optional)
 * precio String Modificar precio del producto (optional)
 * imagen File Modificar imagen del producto (optional)
 * no response value expected for this operation
 **/
exports.updateProductWithForm = function(productId,nombre,descripcion,disponibilidad,precio,imagen) {
  return new Promise(function(resolve, reject) {
    resolve();
  });
}


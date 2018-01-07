package com.acme.ecommerce.exceptions;

import com.acme.ecommerce.domain.Product;

public class OrderQuantityExceedsStockException extends RuntimeException {

  public OrderQuantityExceedsStockException(Product product) {
    super("Sorry, there are only " + product.getQuantity() + " " + product.getName()
        + "s in stock.");
  }
}

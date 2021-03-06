package com.acme.ecommerce.exceptions;

public class ProductNotFoundException extends RuntimeException {
  public ProductNotFoundException(Long id) {
    super("Could not find product with an ID of " + id + "!");
  }
}

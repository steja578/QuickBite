package in.bushansirgur.foodiesapi.service;

import in.bushansirgur.foodiesapi.io.CartRequest;
import in.bushansirgur.foodiesapi.io.CartResponse;

public interface CartService {

    CartResponse addToCart(CartRequest request);

    CartResponse getCart();

    void clearCart();

    CartResponse removeFromCart(CartRequest cartRequest);
}

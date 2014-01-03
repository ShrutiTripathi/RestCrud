package com.jkt.registration.service;
/*
* This software is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND.
*/
import java.util.List;

import com.jkt.registratrion.domain.Order;
import com.jkt.registratrion.domain.OrderItem;




public interface OrderService {

	Order placeOrder(String orderId);

    List<OrderItem> listOrderItems();
}
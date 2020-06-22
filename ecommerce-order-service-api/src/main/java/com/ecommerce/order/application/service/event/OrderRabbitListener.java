package com.ecommerce.order.application.service.event;

import com.ecommerce.order.sdk.event.order.OrderEvent;
import com.ecommerce.spring.common.event.messaging.rabbit.EcommerceRabbitListener;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.stereotype.Component;

@Component
@EcommerceRabbitListener
public class OrderRabbitListener {
    private OrderEventHandler eventHandler;

    public OrderRabbitListener(OrderEventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }

    @RabbitHandler
    public void on(OrderEvent event) {
        eventHandler.cqrsSync(event);
    }

}

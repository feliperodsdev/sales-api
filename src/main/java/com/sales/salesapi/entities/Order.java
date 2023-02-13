package com.sales.salesapi.entities;

import com.sales.salesapi.enums.OrderStatus;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "tb_orders")
public class Order {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private Instant moment;

    private Integer orderStatus;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;

    public Order() {}

    public Order(Long id, Instant moment, OrderStatus orderStatus, User client) {
        this.id = id;
        this.moment = moment;
        this.client = client;
        setOrderStatus(orderStatus);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }

    public OrderStatus getOrderStatus() {
        return OrderStatus.valueOf(orderStatus);
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus.getCode();
    }
}

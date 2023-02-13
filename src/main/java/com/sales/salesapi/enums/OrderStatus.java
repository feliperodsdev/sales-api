package com.sales.salesapi.enums;

public enum OrderStatus {
    WAITING_PAYMENT(1),
    CANCELED(2),
    PAID(3);

    private int code;

    private OrderStatus(int code){
        this.code = code;
    }

    public int getCode(){
        return code;
    }

    public static OrderStatus valueOf(int code){
        for(OrderStatus value: OrderStatus.values()){
            if(value.getCode() == code){return value;}
        }
        throw new IllegalArgumentException("Invalid Order Status Code");
    }

}

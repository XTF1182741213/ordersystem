package com.hsbc.group2.ordersystem.ordersystem.order;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author:fly
 * @Description: The detail of Order
 * @Date:15:49 2018/8/2
 */
@Data
public class Product implements Serializable{

    /** product Id **/
    private String productId;
    /** Product Name **/
    private String productName;
    /** Product Picture Path **/
    private String productPicturePath;


}

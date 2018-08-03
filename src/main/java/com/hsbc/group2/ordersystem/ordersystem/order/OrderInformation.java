package com.hsbc.group2.ordersystem.ordersystem.order;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * @Author:fly
 * @Description:  the information about Order
 * @Date:15:31 2018/8/2
 */
@Data
public class OrderInformation implements Serializable {
    /** Order Id */
    private String orderId;
    /** Order Status, 1 is success 0 is fail**/
    private int orderStatus;
   /** Create Time*/
    private Date createTime;
    /** End Time*/
    private Date endTime;
    /** Close Time */
    private Date closeTime;
    /** Account Id*/
    private String accountId;
    /** Product */
    private Product product;


}

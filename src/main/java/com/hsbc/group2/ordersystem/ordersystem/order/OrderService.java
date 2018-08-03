package com.hsbc.group2.ordersystem.ordersystem.order;

import java.util.Date;
import java.util.List;
/**
 * @Author:fly
 * @Description: The class is in order to operate Order
 * @Date:20:44 2018/8/2
 */
public interface OrderService {

    /** Create a Order */
    OrderInformation createOrder(Date createTime, String productId, String accountId);


    /** Cancel a Order */
    String cancelOrder(String orderId);

    /** Get a Order */
    OrderInformation getOrderInformation(String orderId);

    /** Get a list of order by a accountId */
    List<OrderInformation> getOrderInformationList(String accountId, int pageSize, int pageNum);


    /** Get a list of order without any conditions */
    List<OrderInformation> getOrdersList(int pageSize, int pageNum);


    /** Get a list of order by the order status */
    List<OrderInformation> getOrdersListByOrderStatus(int pageSize, int pageNum, int orderStatus);


}

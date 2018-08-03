package com.hsbc.group2.ordersystem.ordersystem.order;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 * @Author:fly
 * @Description:this class is to implement the operation of OrderService
 * @Date:20:49 2018/8/2
 */
@Service
public class OrderServiceImpl  implements OrderService {
    /**
     * @Date:20:50 2018/8/2
     * @Description:Create a Order
     * @Param:  * @param createTime
     * @param productId
     * @param accountId
     * @Return:
     */
    @Override
    public OrderInformation createOrder(Date createTime, String productId, String accountId) {
        Product product=new Product();
        product.setProductId(productId);
        product.setProductName("汇丰银行卡");
        product.setProductPicturePath("xxxx.jpg");

        OrderInformation orderInformation=new OrderInformation();
        orderInformation.setOrderId("1");
        orderInformation.setOrderStatus(1);
        orderInformation.setCreateTime(createTime);
        orderInformation.setEndTime(new Date());
        orderInformation.setCloseTime(new Date());
        orderInformation.setAccountId(accountId);
        orderInformation.setProduct(product);

        return orderInformation;
    }

    /**
     * @Date:20:50 2018/8/2
     * @Description:Cancel a Order
     * @Param:  * @param orderId
     * @Return:
     */
    @Override
    public String cancelOrder(String orderId) {
        Product product=new Product();
        product.setProductId("1");
        product.setProductName("汇丰银行卡");
        product.setProductPicturePath("xxxx.jpg");

        OrderInformation orderInformation=new OrderInformation();
        orderInformation.setOrderId("1");
        orderInformation.setOrderStatus(0);
        orderInformation.setCreateTime(new Date());
        orderInformation.setEndTime(new Date());
        orderInformation.setCloseTime(new Date());
        orderInformation.setAccountId("1");
        orderInformation.setProduct(product);

        return orderInformation.getOrderId();
    }

    /**
     * @Date:20:51 2018/8/2
     * @Description:Get a Order
     * @Param:  * @param orderId
     * @Return:
     */
    @Override
    public OrderInformation getOrderInformation(String orderId) {
        Product product=new Product();
        product.setProductId("1");
        product.setProductName("汇丰银行卡");
        product.setProductPicturePath("xxxx.jpg");

        OrderInformation orderInformation=new OrderInformation();
        orderInformation.setOrderId("1");
        orderInformation.setOrderStatus(0);
        orderInformation.setCreateTime(new Date());
        orderInformation.setEndTime(new Date());
        orderInformation.setCloseTime(new Date());
        orderInformation.setAccountId("1");
        orderInformation.setProduct(product);
        return orderInformation;
    }

    /**
     * @Date:20:51 2018/8/2
     * @Description:Get a list of order by a accountId
     * @Param:  * @param accountId
     * @param pageSize
     * @param pageNum
     * @Return:
     */
    @Override
    public List<OrderInformation> getOrderInformationList(String accountId, int pageSize, int pageNum) {

        ArrayList<OrderInformation> list=new ArrayList<>() ;
        Product product=new Product();
        product.setProductId("1");
        product.setProductName("汇丰银行卡");
        product.setProductPicturePath("xxxx.jpg");



        OrderInformation orderInformation=new OrderInformation();
        orderInformation.setOrderId("1");
        orderInformation.setOrderStatus(0);
        orderInformation.setCreateTime(new Date());
        orderInformation.setEndTime(new Date());
        orderInformation.setCloseTime(new Date());
        orderInformation.setAccountId("1");
        orderInformation.setProduct(product);

        Product product1=new Product();
        product.setProductId("11");
        product.setProductName("汇丰银行卡2");
        product.setProductPicturePath("yyyyyy.jpg");

        OrderInformation orderInformation2=new OrderInformation();
        orderInformation2.setOrderId("11");
        orderInformation2.setOrderStatus(0);
        orderInformation2.setCreateTime(new Date());
        orderInformation2.setEndTime(new Date());
        orderInformation2.setCloseTime(new Date());
        orderInformation2.setAccountId("1");
        orderInformation2.setProduct(product);

        list.add(orderInformation);
        list.add(orderInformation2);

        return list;
    }

    /**
     * @Date:20:51 2018/8/2
     * @Description:Get a list of order without any conditions
     * @Param:  * @param pageSize
     * @param pageNum
     * @Return:
     */
    @Override
    public List<OrderInformation> getOrdersList(int pageSize, int pageNum) {
        ArrayList<OrderInformation> list=new ArrayList<>() ;
        Product product=new Product();
        product.setProductId("2");
        product.setProductName("汇丰银行卡");
        product.setProductPicturePath("xxxx.jpg");

        OrderInformation orderInformation=new OrderInformation();
        orderInformation.setOrderId("1");
        orderInformation.setOrderStatus(0);
        orderInformation.setCreateTime(new Date());
        orderInformation.setEndTime(new Date());
        orderInformation.setCloseTime(new Date());
        orderInformation.setAccountId("1");
        orderInformation.setProduct(product);
        list.add(orderInformation);

        return list;
    }
    /**
     * @Date:20:51 2018/8/2
     * @Description:Get a list of order by the order status
     * @Param:  * @param pageSize
     * @param pageNum
     * @param orderStatus
     * @Return:
     */
    @Override
    public List<OrderInformation> getOrdersListByOrderStatus(int pageSize, int pageNum, int orderStatus) {
        ArrayList<OrderInformation> list=new ArrayList<>() ;
        Product product=new Product();
        product.setProductId("3");
        product.setProductName("汇丰银行卡");
        product.setProductPicturePath("xxxx.jpg");

        OrderInformation orderInformation=new OrderInformation();
        orderInformation.setOrderId("1");
        orderInformation.setOrderStatus(0);
        orderInformation.setCreateTime(new Date());
        orderInformation.setEndTime(new Date());
        orderInformation.setCloseTime(new Date());
        orderInformation.setAccountId("1");
        orderInformation.setProduct(product);
        list.add(orderInformation);

        return list;
    }
}

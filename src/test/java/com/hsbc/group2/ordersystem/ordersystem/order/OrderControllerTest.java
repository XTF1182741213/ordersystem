package com.hsbc.group2.ordersystem.ordersystem.order;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

/**
 * @Author:fly
 * @Description: test OrderController
 * @Date:21:07 2018/8/2
 */
@RunWith(SpringRunner.class)
//@WebMvcTest(OrderController.class)
@SpringBootTest
@AutoConfigureMockMvc
public class OrderControllerTest {

    private static final String test1 = "{\"code\":0,\"msg\":\"Success\",\"data\":{\"orderId\":\"0\",\"orderStatus\":1,\"createTime\":null,\"endTime\":\"2018-08-02T14:20:01.790+0000\",\"closeTime\":\"2018-08-02T14:20:01.790+0000\",\"accountId\":\"\\\"1\\\"\",\"product\":{\"productId\":\"\\\"1\\\"\",\"productName\":\"汇丰银行卡\",\"productPicturePath\":\"xxxx.jpg\"}}}";
    private static final String test2 = "";
    private static final String test3 = "";
    private static final String test4 = "";
    private static final String test5 = "";
    private static final String test6 = "";

    @Autowired
    private MockMvc mvc;

//    @MockBean
//    private OrderService orderService;

    /**
     * @Date:0:53 2018/8/3
     * @Description: this method's target is testing create order
     * @Param:  * @param
     * @Return:
     */
    @Test
    public void createOrder() throws Exception {

        String responseString = mvc.perform(MockMvcRequestBuilders.get("/order/createorder").contentType(MediaType.APPLICATION_JSON)  //数据的格式
                .param("createTime", "2018-08-02 22:50:00")
                .param("productId", "1")
                .param("accountId", "1")
        ).andExpect(MockMvcResultMatchers.status().isOk())    //返回的状态是200
                .andDo(print())         //打印出请求和相应的内容
                .andReturn().getResponse().getContentAsString();   //将相应的数据转换为字符串

/*
        given(this.orderService.createOrder(new Date(),"1","1")).willReturn(listProductView);
        this.mvc.perform(get("/order/createorder").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andExpect(content().string(TEST_JSON));*/

    }

    /**
     * @Date:0:53 2018/8/3
     * @Description: this method's target is testing cancel order
     * @Param:  * @param
     * @Return:
     */
    @Test
    public void cancelOrder() throws Exception {

        String responseString = mvc.perform(MockMvcRequestBuilders.get("/order/cancelorder").contentType(MediaType.APPLICATION_JSON)  //数据的格式
                .param("productId", "1")
        ).andExpect(MockMvcResultMatchers.status().isOk())    //返回的状态是200
                .andDo(print())         //打印出请求和相应的内容
                .andReturn().getResponse().getContentAsString();   //将相应的数据转换为字符串
    }

    /**
     * @Date:0:53 2018/8/3
     * @Description: this method's target is testing get order
     * @Param:  * @param
     * @Return:
     */
    @Test
    public void getOrder() throws Exception {

        String responseString = mvc.perform(MockMvcRequestBuilders.get("/order/getorder").contentType(MediaType.APPLICATION_JSON)  //数据的格式
                .param("orderId", "1")
        ).andExpect(MockMvcResultMatchers.status().isOk())    //返回的状态是200
                .andDo(print())         //打印出请求和相应的内容
                .andReturn().getResponse().getContentAsString();   //将相应的数据转换为字符串
    }

    /**
     * @Date:0:53 2018/8/3
     * @Description: this method's target is testing get orderList by AccountId
     * @Param:  * @param
     * @Return:
     */
    @Test
    public void getOrderListByAccountId() throws Exception {

        String responseString = mvc.perform(MockMvcRequestBuilders.get("/order/getorderlistbyaccountid").contentType(MediaType.APPLICATION_JSON)  //数据的格式
                .param("accountId", "1")
                .param("pageSize", "1")
                .param("pageNum", "1")
        ).andExpect(MockMvcResultMatchers.status().isOk())    //返回的状态是200
                .andDo(print())         //打印出请求和相应的内容
                .andReturn().getResponse().getContentAsString();   //将相应的数据转换为字符串
    }

    /**
     * @Date:0:53 2018/8/3
     * @Description: this method's target is testing get order list without conditions.
     * @Param:  * @param
     * @Return:
     */
    @Test
    public void getOrderLists() throws Exception {

        String responseString = mvc.perform(MockMvcRequestBuilders.get("/order/getorderlist").contentType(MediaType.APPLICATION_JSON)  //数据的格式
                .param("pageSize", "1")
                .param("pageNum", "1")
        ).andExpect(MockMvcResultMatchers.status().isOk())    //返回的状态是200
                .andDo(print())         //打印出请求和相应的内容
                .andReturn().getResponse().getContentAsString();   //将相应的数据转换为字符串
    }

    /**
     * @Date:0:53 2018/8/3
     * @Description: this method's target is testing get order list by status.
     * @Param:  * @param
     * @Return:
     */
    @Test
    public void getOrderList() throws Exception {

        String responseString = mvc.perform(MockMvcRequestBuilders.get("/order/getorderlistbystatus").contentType(MediaType.APPLICATION_JSON)  //数据的格式
                .param("pageSize", "1")
                .param("pageNum", "1")
                .param("status", "1")
        ).andExpect(MockMvcResultMatchers.status().isOk())    //返回的状态是200
                .andDo(print())         //打印出请求和相应的内容
                .andReturn().getResponse().getContentAsString();   //将相应的数据转换为字符串
    }


}

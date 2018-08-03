package com.hsbc.group2.ordersystem.ordersystem.order;


import com.hsbc.group2.ordersystem.ordersystem.result.ResultView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;

/**
 * @Author:fly
 * @Description: The controller of Order.
 * @Date:17:24 2018/8/2
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * @param productId
     * @param accountId
     * @Date:17:47 2018/8/2
     * @Description:
     * @Param: * @param createTime
     * @Return:
     */
    @GetMapping("/createorder")
    public ResultView createOrder(@RequestParam(value="createTime") String createTime,
                                  @RequestParam(value="productId") String productId, @RequestParam(value="accountId") String accountId) throws Exception {

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        ResultView resultView = new ResultView();
        resultView.setCode(0);
        resultView.setMsg("Success");
        resultView.setData(orderService.createOrder(sdf.parse(createTime), productId, accountId));

        return resultView;
    }

    /**
     * @Date:17:51 2018/8/2
     * @Description:
     * @Param: * @param orderId
     * @Return:
     */
    @GetMapping("/cancelorder")
    public ResultView cancelOrder(String orderId) {

        ResultView resultView = new ResultView();
        resultView.setCode(0);
        resultView.setMsg("Success");
        resultView.setData(orderService.cancelOrder(orderId));
        return resultView;
    }

    /**
     * @Date:17:52 2018/8/2
     * @Description:
     * @Param: * @param orderId
     * @Return:
     */
    @GetMapping("/getorder")
    public ResultView getOrder(String orderId) {

        ResultView resultView = new ResultView();
        resultView.setCode(0);
        resultView.setMsg("Success");
        resultView.setData(orderService.getOrderInformation(orderId));
        return resultView;
    }

    /**
     * @param pageSize
     * @param pageNum
     * @Date:17:57 2018/8/2
     * @Description:
     * @Param: * @param accountId
     * @Return:
     */
    @GetMapping("/getorderlistbyaccountid")
    public ResultView getOrderListByAccountId(String accountId, int pageSize, int pageNum) {

        ResultView resultView = new ResultView();
        resultView.setCode(0);
        resultView.setMsg("Success");
        resultView.setData(orderService.getOrderInformationList(accountId, pageSize, pageNum));
        return resultView;
    }

    /**
     * @param pageNum
     * @Date:17:57 2018/8/2
     * @Description:
     * @Param: * @param pageSize
     * @Return:
     */
    @GetMapping("/getorderlist")
    public ResultView getOrderLists(int pageSize, int pageNum) {

        ResultView resultView = new ResultView();
        resultView.setCode(0);
        resultView.setMsg("Success");
        resultView.setData(orderService.getOrdersList(pageSize, pageNum));
        return resultView;
    }

    /**
     * @param pageNum
     * @param status
     * @Date:17:58 2018/8/2
     * @Description:
     * @Param: * @param pageSize
     * @Return:
     */
    @GetMapping("/getorderlistbystatus")
    public ResultView getOrderList(int pageSize, int pageNum, int status) {
        ResultView resultView = new ResultView();
        resultView.setCode(0);
        resultView.setMsg("Success");
        resultView.setData(orderService.getOrdersListByOrderStatus(pageSize, pageNum, status));
        return resultView;
    }


}

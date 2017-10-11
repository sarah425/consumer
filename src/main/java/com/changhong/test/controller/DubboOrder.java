//package com.changhong.test.controller;
//
//import java.util.List;
//
//import javax.annotation.Resource;
//import javax.servlet.http.HttpServletRequest;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.changhong.csc.center.bill.order.service.IOrderDubboService;
//import com.changhong.csc.center.bill.order.entity.Order;
//import com.changhong.provider.entity.Order1;
//import com.changhong.provider.service.OrderService;
//
//@Controller
//public class DubboOrder {
//
//	@Resource(name="orderService")
////	public OrderService orderService;
//	
//	@Resource(name="orderDubboService")
//	public IOrderDubboService orderDubboService;
//	
//	@RequestMapping("/query")
//	public ModelAndView query(HttpServletRequest request){
//		
//		List<Order1> orders1= orderService.getOrderByCreatedUserId(50);
//		
//		Order order = orderDubboService.getOrder(123L);
////		List<Order> orders2= orderService.getOrderByCompanyId(42);
////		System.out.println("订单信息：");
////		for(int i=0;i<orders1.size();i++) {
////			System.out.println((Order)orders1.indexOf(i).toString());
////		}
////		
//		System.out.println("localhost:");
//		for(Order1 order1 : orders1) {
//			  System.out.println(order1.toString());
//			}
//		
//		System.out.println("remote:" + order);
//		return null;
//	} 
//}
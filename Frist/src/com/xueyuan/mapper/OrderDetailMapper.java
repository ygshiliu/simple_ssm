package com.xueyuan.mapper;

import java.util.List;

import com.xueyuan.beans.OrderDetail;

public interface OrderDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_order_details
     *
     * @mbggenerated Sat Jun 22 09:58:08 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_order_details
     *
     * @mbggenerated Sat Jun 22 09:58:08 CST 2019
     */
    int insert(OrderDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_order_details
     *
     * @mbggenerated Sat Jun 22 09:58:08 CST 2019
     */
    OrderDetail selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_order_details
     *
     * @mbggenerated Sat Jun 22 09:58:08 CST 2019
     */
    List<OrderDetail> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_order_details
     *
     * @mbggenerated Sat Jun 22 09:58:08 CST 2019
     */
    int updateByPrimaryKey(OrderDetail record);
}
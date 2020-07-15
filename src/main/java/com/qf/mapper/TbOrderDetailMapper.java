package com.qf.mapper;

import com.qf.pojo.TbOrderDetail;
import com.qf.pojo.TbOrderDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbOrderDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_detail
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    long countByExample(TbOrderDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_detail
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    int deleteByExample(TbOrderDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_detail
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    int deleteByPrimaryKey(Integer odid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_detail
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    int insert(TbOrderDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_detail
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    int insertSelective(TbOrderDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_detail
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    List<TbOrderDetail> selectByExample(TbOrderDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_detail
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    TbOrderDetail selectByPrimaryKey(Integer odid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_detail
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    int updateByExampleSelective(@Param("record") TbOrderDetail record, @Param("example") TbOrderDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_detail
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    int updateByExample(@Param("record") TbOrderDetail record, @Param("example") TbOrderDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_detail
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    int updateByPrimaryKeySelective(TbOrderDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_order_detail
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    int updateByPrimaryKey(TbOrderDetail record);
}
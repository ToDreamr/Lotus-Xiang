

package com.yami.shop.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yami.shop.bean.model.OrderSettlement;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *  @author 春江花朝秋月夜
 */
public interface OrderSettlementMapper extends BaseMapper<OrderSettlement> {
	/**
	 * 更新订单结算
	 * @param orderSettlement
	 */
	void updateByOrderNumberAndUserId(@Param("orderSettlement") OrderSettlement orderSettlement);

	/**
	 * 根据支付单号获取结算信息
	 * @param payNo
	 * @return
	 */
	List<OrderSettlement> getSettlementsByPayNo(@Param("payNo") String payNo);

	/**
	 * 根据支付单号更新结算
	 * @param outTradeNo
	 * @param transactionId
	 */
	void updateSettlementsByPayNo(@Param("outTradeNo") String outTradeNo, @Param("transactionId") String transactionId);

	/**
	 * 更新结算信息为已支付
	 * @param payNo
	 * @param version
	 * @return
	 */
	int updateToPay(@Param("payNo") String payNo, @Param("version") Integer version);
}

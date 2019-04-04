package seed.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    /**
     * 订单ID
     */
    private Long id;

    /**
     * 服务号id
     */
    @JSONField(name="pos_id")
    private Long posId;

    /**
     * app code码
     */
    @JSONField(name="app_code")
    private String appCode;

    /**
     * 订单号
     */
    private Long orderNo;

    /**
     * 订单状态
        10=已创建
        15=已付款
        20=已发货
        25=已签收
        30=已退款
        35=已取消
     */
    private Integer orderStatus;

    /**
     * 
订单最新流程
        10=待付款
        15=待发货
        20=待签收
        25=已完成
        30=交易关闭
35=退款中
     */
    private Long flowId;

    /**
     * 支付类型(1=支付宝 2=微信 3=银联)
     */
    private Boolean paymentType;

    /**
     * 支付编号(支付宝、微信、银联支付成功后的编号 流水号) 支付单号
     */
    private String paymentNo;

    /**
     * 支付账户信息
     */
    private String paymentAccount;

    /**
     * 实际金额
     */
    private BigDecimal actualAmount;

    /**
     * 付款时间
     */
    private Date paymentTime;

    /**
     * 购买的总数量
     */
    private Integer totalQuantity;

    /**
     * 实际售卖的数量
     */
    private Integer actualQuantity;

    /**
     * 支付金额=商品总金额+运费
     */
    private BigDecimal paymentAmount;

    /**
     * 订单商品总金额
     */
    private BigDecimal totalAmount;

    /**
     * 退款类型(0=手动退款，1=超时退款)
     */
    private Boolean refundType;

    /**
     * 退款总金额=商品明细表的退款金额之和
     */
    private BigDecimal refundTotalAmount;

    /**
     * 退款编号
     */
    private String refundNo;

    /**
     * 订单标题（第一件商品名称）
     */
    private String title;

    /**
     * 支付宝、微信、银联退款编号 流水号
     */
    private String refundTradeNo;

    /**
     * 退款数量
     */
    private Byte refundQuantity;

    /**
     * 申请退款原因
     */
    private String refundCause;

    /**
     * 退款图片
     */
    private String refundPhotos;

    /**
     * 订单异常原因
     */
    private Boolean errorCause;

    /**
     * 物流配送信息
     */
    private String logisticsInfo;

    /**
     * 物流运费
     */
    private BigDecimal logisticsCost;

    /**
     * 物流类型(EMS、顺丰等)
     */
    private String logisticsType;

    /**
     * 物流单号
     */
    private String logisticsOrder;

    /**
     * 买家ID 下单人
     */
    private Long buyerId;

    /**
     * 收货人名称
     */
    private String receiveName;

    /**
     * 收货人电话
     */
    private String receivePhone;

    /**
     * 省份
     */
    private String receiveProvince;

    /**
     * 城市
     */
    private String receiveCity;

    /**
     * 区 县
     */
    private String receiveCounty;

    /**
     * 收货人具体地址
     */
    private String receiveAddress;

    /**
     * 收货人邮政编码
     */
    private String receiveZipcode;

    /**
     * 订单备注信息 由用户提交订单前填写的备注信息
     */
    private String payNote;

    /**
     * 发票信息 判断是否为空来决定开具发票情况 json: 
{
	"title": "发票抬头",
	"content": "发票内容",
	"create_time": "开票时间",
	"type": "1-个人；2-单位"
}
     */
    private String invoice;

    /**
     * 评论ID
     */
    private Long commentId;

    /**
     * 是否删除 0=没有删除；1=已删除
     */
    private Byte status;

    /**
     * 是否有商品申请退款
0=否，1=是
     */
    private Byte isRefund;

    /**
     * 创建人ID
     */
    private Long creator;

    /**
     * 创建人名称
     */
    private String creatorName;

    /**
     * 创建时间(下单时间)
     */
    private Date createTime;

    /**
     * 修改人ID
     */
    private Long modifier;

    /**
     * 修改人名称
     */
    private String modifierName;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 推广商id
     */
    private Long promotersId;

    /**
     * 订单ID
     * @return id 订单ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 订单ID
     * @param id 订单ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 服务号id
     * @return pos_id 服务号id
     */
    public Long getPosId() {
        return posId;
    }

    /**
     * 服务号id
     * @param posId 服务号id
     */
    public void setPosId(Long posId) {
        this.posId = posId;
    }

    /**
     * app code码
     * @return app_code app code码
     */
    public String getAppCode() {
        return appCode;
    }

    /**
     * app code码
     * @param appCode app code码
     */
    public void setAppCode(String appCode) {
        this.appCode = appCode == null ? null : appCode.trim();
    }

    /**
     * 订单号
     * @return order_no 订单号
     */
    public Long getOrderNo() {
        return orderNo;
    }

    /**
     * 订单号
     * @param orderNo 订单号
     */
    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 订单状态
        10=已创建
        15=已付款
        20=已发货
        25=已签收
        30=已退款
        35=已取消
     * @return order_status 订单状态
        10=已创建
        15=已付款
        20=已发货
        25=已签收
        30=已退款
        35=已取消
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * 订单状态
        10=已创建
        15=已付款
        20=已发货
        25=已签收
        30=已退款
        35=已取消
     * @param orderStatus 订单状态
        10=已创建
        15=已付款
        20=已发货
        25=已签收
        30=已退款
        35=已取消
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 
订单最新流程
        10=待付款
        15=待发货
        20=待签收
        25=已完成
        30=交易关闭
35=退款中
     * @return flow_id 
订单最新流程
        10=待付款
        15=待发货
        20=待签收
        25=已完成
        30=交易关闭
35=退款中
     */
    public Long getFlowId() {
        return flowId;
    }

    /**
     * 
订单最新流程
        10=待付款
        15=待发货
        20=待签收
        25=已完成
        30=交易关闭
35=退款中
     * @param flowId 
订单最新流程
        10=待付款
        15=待发货
        20=待签收
        25=已完成
        30=交易关闭
35=退款中
     */
    public void setFlowId(Long flowId) {
        this.flowId = flowId;
    }

    /**
     * 支付类型(1=支付宝 2=微信 3=银联)
     * @return payment_type 支付类型(1=支付宝 2=微信 3=银联)
     */
    public Boolean getPaymentType() {
        return paymentType;
    }

    /**
     * 支付类型(1=支付宝 2=微信 3=银联)
     * @param paymentType 支付类型(1=支付宝 2=微信 3=银联)
     */
    public void setPaymentType(Boolean paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * 支付编号(支付宝、微信、银联支付成功后的编号 流水号) 支付单号
     * @return payment_no 支付编号(支付宝、微信、银联支付成功后的编号 流水号) 支付单号
     */
    public String getPaymentNo() {
        return paymentNo;
    }

    /**
     * 支付编号(支付宝、微信、银联支付成功后的编号 流水号) 支付单号
     * @param paymentNo 支付编号(支付宝、微信、银联支付成功后的编号 流水号) 支付单号
     */
    public void setPaymentNo(String paymentNo) {
        this.paymentNo = paymentNo == null ? null : paymentNo.trim();
    }

    /**
     * 支付账户信息
     * @return payment_account 支付账户信息
     */
    public String getPaymentAccount() {
        return paymentAccount;
    }

    /**
     * 支付账户信息
     * @param paymentAccount 支付账户信息
     */
    public void setPaymentAccount(String paymentAccount) {
        this.paymentAccount = paymentAccount == null ? null : paymentAccount.trim();
    }

    /**
     * 实际金额
     * @return actual_amount 实际金额
     */
    public BigDecimal getActualAmount() {
        return actualAmount;
    }

    /**
     * 实际金额
     * @param actualAmount 实际金额
     */
    public void setActualAmount(BigDecimal actualAmount) {
        this.actualAmount = actualAmount;
    }

    /**
     * 付款时间
     * @return payment_time 付款时间
     */
    public Date getPaymentTime() {
        return paymentTime;
    }

    /**
     * 付款时间
     * @param paymentTime 付款时间
     */
    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    /**
     * 购买的总数量
     * @return total_quantity 购买的总数量
     */
    public Integer getTotalQuantity() {
        return totalQuantity;
    }

    /**
     * 购买的总数量
     * @param totalQuantity 购买的总数量
     */
    public void setTotalQuantity(Integer totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    /**
     * 实际售卖的数量
     * @return actual_quantity 实际售卖的数量
     */
    public Integer getActualQuantity() {
        return actualQuantity;
    }

    /**
     * 实际售卖的数量
     * @param actualQuantity 实际售卖的数量
     */
    public void setActualQuantity(Integer actualQuantity) {
        this.actualQuantity = actualQuantity;
    }

    /**
     * 支付金额=商品总金额+运费
     * @return payment_amount 支付金额=商品总金额+运费
     */
    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * 支付金额=商品总金额+运费
     * @param paymentAmount 支付金额=商品总金额+运费
     */
    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    /**
     * 订单商品总金额
     * @return total_amount 订单商品总金额
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * 订单商品总金额
     * @param totalAmount 订单商品总金额
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * 退款类型(0=手动退款，1=超时退款)
     * @return refund_type 退款类型(0=手动退款，1=超时退款)
     */
    public Boolean getRefundType() {
        return refundType;
    }

    /**
     * 退款类型(0=手动退款，1=超时退款)
     * @param refundType 退款类型(0=手动退款，1=超时退款)
     */
    public void setRefundType(Boolean refundType) {
        this.refundType = refundType;
    }

    /**
     * 退款总金额=商品明细表的退款金额之和
     * @return refund_total_amount 退款总金额=商品明细表的退款金额之和
     */
    public BigDecimal getRefundTotalAmount() {
        return refundTotalAmount;
    }

    /**
     * 退款总金额=商品明细表的退款金额之和
     * @param refundTotalAmount 退款总金额=商品明细表的退款金额之和
     */
    public void setRefundTotalAmount(BigDecimal refundTotalAmount) {
        this.refundTotalAmount = refundTotalAmount;
    }

    /**
     * 退款编号
     * @return refund_no 退款编号
     */
    public String getRefundNo() {
        return refundNo;
    }

    /**
     * 退款编号
     * @param refundNo 退款编号
     */
    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo == null ? null : refundNo.trim();
    }

    /**
     * 订单标题（第一件商品名称）
     * @return title 订单标题（第一件商品名称）
     */
    public String getTitle() {
        return title;
    }

    /**
     * 订单标题（第一件商品名称）
     * @param title 订单标题（第一件商品名称）
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 支付宝、微信、银联退款编号 流水号
     * @return refund_trade_no 支付宝、微信、银联退款编号 流水号
     */
    public String getRefundTradeNo() {
        return refundTradeNo;
    }

    /**
     * 支付宝、微信、银联退款编号 流水号
     * @param refundTradeNo 支付宝、微信、银联退款编号 流水号
     */
    public void setRefundTradeNo(String refundTradeNo) {
        this.refundTradeNo = refundTradeNo == null ? null : refundTradeNo.trim();
    }

    /**
     * 退款数量
     * @return refund_quantity 退款数量
     */
    public Byte getRefundQuantity() {
        return refundQuantity;
    }

    /**
     * 退款数量
     * @param refundQuantity 退款数量
     */
    public void setRefundQuantity(Byte refundQuantity) {
        this.refundQuantity = refundQuantity;
    }

    /**
     * 申请退款原因
     * @return refund_cause 申请退款原因
     */
    public String getRefundCause() {
        return refundCause;
    }

    /**
     * 申请退款原因
     * @param refundCause 申请退款原因
     */
    public void setRefundCause(String refundCause) {
        this.refundCause = refundCause == null ? null : refundCause.trim();
    }

    /**
     * 退款图片
     * @return refund_photos 退款图片
     */
    public String getRefundPhotos() {
        return refundPhotos;
    }

    /**
     * 退款图片
     * @param refundPhotos 退款图片
     */
    public void setRefundPhotos(String refundPhotos) {
        this.refundPhotos = refundPhotos == null ? null : refundPhotos.trim();
    }

    /**
     * 订单异常原因
     * @return error_cause 订单异常原因
     */
    public Boolean getErrorCause() {
        return errorCause;
    }

    /**
     * 订单异常原因
     * @param errorCause 订单异常原因
     */
    public void setErrorCause(Boolean errorCause) {
        this.errorCause = errorCause;
    }

    /**
     * 物流配送信息
     * @return logistics_info 物流配送信息
     */
    public String getLogisticsInfo() {
        return logisticsInfo;
    }

    /**
     * 物流配送信息
     * @param logisticsInfo 物流配送信息
     */
    public void setLogisticsInfo(String logisticsInfo) {
        this.logisticsInfo = logisticsInfo == null ? null : logisticsInfo.trim();
    }

    /**
     * 物流运费
     * @return logistics_cost 物流运费
     */
    public BigDecimal getLogisticsCost() {
        return logisticsCost;
    }

    /**
     * 物流运费
     * @param logisticsCost 物流运费
     */
    public void setLogisticsCost(BigDecimal logisticsCost) {
        this.logisticsCost = logisticsCost;
    }

    /**
     * 物流类型(EMS、顺丰等)
     * @return logistics_type 物流类型(EMS、顺丰等)
     */
    public String getLogisticsType() {
        return logisticsType;
    }

    /**
     * 物流类型(EMS、顺丰等)
     * @param logisticsType 物流类型(EMS、顺丰等)
     */
    public void setLogisticsType(String logisticsType) {
        this.logisticsType = logisticsType == null ? null : logisticsType.trim();
    }

    /**
     * 物流单号
     * @return logistics_order 物流单号
     */
    public String getLogisticsOrder() {
        return logisticsOrder;
    }

    /**
     * 物流单号
     * @param logisticsOrder 物流单号
     */
    public void setLogisticsOrder(String logisticsOrder) {
        this.logisticsOrder = logisticsOrder == null ? null : logisticsOrder.trim();
    }

    /**
     * 买家ID 下单人
     * @return buyer_id 买家ID 下单人
     */
    public Long getBuyerId() {
        return buyerId;
    }

    /**
     * 买家ID 下单人
     * @param buyerId 买家ID 下单人
     */
    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    /**
     * 收货人名称
     * @return receive_name 收货人名称
     */
    public String getReceiveName() {
        return receiveName;
    }

    /**
     * 收货人名称
     * @param receiveName 收货人名称
     */
    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName == null ? null : receiveName.trim();
    }

    /**
     * 收货人电话
     * @return receive_phone 收货人电话
     */
    public String getReceivePhone() {
        return receivePhone;
    }

    /**
     * 收货人电话
     * @param receivePhone 收货人电话
     */
    public void setReceivePhone(String receivePhone) {
        this.receivePhone = receivePhone == null ? null : receivePhone.trim();
    }

    /**
     * 省份
     * @return receive_province 省份
     */
    public String getReceiveProvince() {
        return receiveProvince;
    }

    /**
     * 省份
     * @param receiveProvince 省份
     */
    public void setReceiveProvince(String receiveProvince) {
        this.receiveProvince = receiveProvince == null ? null : receiveProvince.trim();
    }

    /**
     * 城市
     * @return receive_city 城市
     */
    public String getReceiveCity() {
        return receiveCity;
    }

    /**
     * 城市
     * @param receiveCity 城市
     */
    public void setReceiveCity(String receiveCity) {
        this.receiveCity = receiveCity == null ? null : receiveCity.trim();
    }

    /**
     * 区 县
     * @return receive_county 区 县
     */
    public String getReceiveCounty() {
        return receiveCounty;
    }

    /**
     * 区 县
     * @param receiveCounty 区 县
     */
    public void setReceiveCounty(String receiveCounty) {
        this.receiveCounty = receiveCounty == null ? null : receiveCounty.trim();
    }

    /**
     * 收货人具体地址
     * @return receive_address 收货人具体地址
     */
    public String getReceiveAddress() {
        return receiveAddress;
    }

    /**
     * 收货人具体地址
     * @param receiveAddress 收货人具体地址
     */
    public void setReceiveAddress(String receiveAddress) {
        this.receiveAddress = receiveAddress == null ? null : receiveAddress.trim();
    }

    /**
     * 收货人邮政编码
     * @return receive_zipcode 收货人邮政编码
     */
    public String getReceiveZipcode() {
        return receiveZipcode;
    }

    /**
     * 收货人邮政编码
     * @param receiveZipcode 收货人邮政编码
     */
    public void setReceiveZipcode(String receiveZipcode) {
        this.receiveZipcode = receiveZipcode == null ? null : receiveZipcode.trim();
    }

    /**
     * 订单备注信息 由用户提交订单前填写的备注信息
     * @return pay_note 订单备注信息 由用户提交订单前填写的备注信息
     */
    public String getPayNote() {
        return payNote;
    }

    /**
     * 订单备注信息 由用户提交订单前填写的备注信息
     * @param payNote 订单备注信息 由用户提交订单前填写的备注信息
     */
    public void setPayNote(String payNote) {
        this.payNote = payNote == null ? null : payNote.trim();
    }

    /**
     * 发票信息 判断是否为空来决定开具发票情况 json: 
{
	"title": "发票抬头",
	"content": "发票内容",
	"create_time": "开票时间",
	"type": "1-个人；2-单位"
}
     * @return invoice 发票信息 判断是否为空来决定开具发票情况 json: 
{
	"title": "发票抬头",
	"content": "发票内容",
	"create_time": "开票时间",
	"type": "1-个人；2-单位"
}
     */
    public String getInvoice() {
        return invoice;
    }

    /**
     * 发票信息 判断是否为空来决定开具发票情况 json: 
{
	"title": "发票抬头",
	"content": "发票内容",
	"create_time": "开票时间",
	"type": "1-个人；2-单位"
}
     * @param invoice 发票信息 判断是否为空来决定开具发票情况 json: 
{
	"title": "发票抬头",
	"content": "发票内容",
	"create_time": "开票时间",
	"type": "1-个人；2-单位"
}
     */
    public void setInvoice(String invoice) {
        this.invoice = invoice == null ? null : invoice.trim();
    }

    /**
     * 评论ID
     * @return comment_id 评论ID
     */
    public Long getCommentId() {
        return commentId;
    }

    /**
     * 评论ID
     * @param commentId 评论ID
     */
    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    /**
     * 是否删除 0=没有删除；1=已删除
     * @return status 是否删除 0=没有删除；1=已删除
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 是否删除 0=没有删除；1=已删除
     * @param status 是否删除 0=没有删除；1=已删除
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 是否有商品申请退款
0=否，1=是
     * @return is_refund 是否有商品申请退款
0=否，1=是
     */
    public Byte getIsRefund() {
        return isRefund;
    }

    /**
     * 是否有商品申请退款
0=否，1=是
     * @param isRefund 是否有商品申请退款
0=否，1=是
     */
    public void setIsRefund(Byte isRefund) {
        this.isRefund = isRefund;
    }

    /**
     * 创建人ID
     * @return creator 创建人ID
     */
    public Long getCreator() {
        return creator;
    }

    /**
     * 创建人ID
     * @param creator 创建人ID
     */
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    /**
     * 创建人名称
     * @return creator_name 创建人名称
     */
    public String getCreatorName() {
        return creatorName;
    }

    /**
     * 创建人名称
     * @param creatorName 创建人名称
     */
    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName == null ? null : creatorName.trim();
    }

    /**
     * 创建时间(下单时间)
     * @return create_time 创建时间(下单时间)
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间(下单时间)
     * @param createTime 创建时间(下单时间)
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 修改人ID
     * @return modifier 修改人ID
     */
    public Long getModifier() {
        return modifier;
    }

    /**
     * 修改人ID
     * @param modifier 修改人ID
     */
    public void setModifier(Long modifier) {
        this.modifier = modifier;
    }

    /**
     * 修改人名称
     * @return modifier_name 修改人名称
     */
    public String getModifierName() {
        return modifierName;
    }

    /**
     * 修改人名称
     * @param modifierName 修改人名称
     */
    public void setModifierName(String modifierName) {
        this.modifierName = modifierName == null ? null : modifierName.trim();
    }

    /**
     * 修改时间
     * @return modify_time 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 修改时间
     * @param modifyTime 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 推广商id
     * @return promoters_id 推广商id
     */
    public Long getPromotersId() {
        return promotersId;
    }

    /**
     * 推广商id
     * @param promotersId 推广商id
     */
    public void setPromotersId(Long promotersId) {
        this.promotersId = promotersId;
    }
}
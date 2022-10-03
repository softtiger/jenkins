package springboot.study.jpa.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "order")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 场次ID
     */
    @Column(name = "schedule_id", nullable = false)
    private Integer scheduleId;

    /**
     * 价格
     */
    @Column(name = "price", nullable = false)
    private Integer price;

    /**
     * 数量
     */
    @Column(name = "quality", nullable = false)
    private Integer quality;

    /**
     * 客户ID
     */
    @Column(name = "custom_id", nullable = false)
    private Integer customId;

    /**
     * 状态 new 新订单   paid 已支付 failue 支付失败  cancel 取消
     */
    @Column(name = "status", nullable = false)
    private String status;

    /**
     * 下单时间
     */
    @Column(name = "order_time", nullable = false)
    private Date orderTime;

    /**
     * 支付时间
     */
    @Column(name = "pay_time")
    private Date payTime;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    /**
     * 场次ID
     */
    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    /**
     * 场次ID
     */
    public Integer getScheduleId() {
        return scheduleId;
    }

    /**
     * 价格
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * 价格
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * 数量
     */
    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    /**
     * 数量
     */
    public Integer getQuality() {
        return quality;
    }

    /**
     * 客户ID
     */
    public void setCustomId(Integer customId) {
        this.customId = customId;
    }

    /**
     * 客户ID
     */
    public Integer getCustomId() {
        return customId;
    }

    /**
     * 状态 new 新订单   paid 已支付 failue 支付失败  cancel 取消
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 状态 new 新订单   paid 已支付 failue 支付失败  cancel 取消
     */
    public String getStatus() {
        return status;
    }

    /**
     * 下单时间
     */
    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    /**
     * 下单时间
     */
    public Date getOrderTime() {
        return orderTime;
    }

    /**
     * 支付时间
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * 支付时间
     */
    public Date getPayTime() {
        return payTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id + '\'' +
                "scheduleId=" + scheduleId + '\'' +
                "price=" + price + '\'' +
                "quality=" + quality + '\'' +
                "customId=" + customId + '\'' +
                "status=" + status + '\'' +
                "orderTime=" + orderTime + '\'' +
                "payTime=" + payTime + '\'' +
                '}';
    }
}

package com.jo.dy.ot.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "leave_bill")
public class LeaveBill implements Serializable {
    @Id
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    private String reason;

    private String status;

    @Column(name = "day_time")
    private Integer dayTime;

    @Column(name = "pro_def_id")
    private String proDefId;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    /**
     * @param reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return day_time
     */
    public Integer getDayTime() {
        return dayTime;
    }

    /**
     * @param dayTime
     */
    public void setDayTime(Integer dayTime) {
        this.dayTime = dayTime;
    }

    /**
     * @return pro_def_id
     */
    public String getProDefId() {
        return proDefId;
    }

    /**
     * @param proDefId
     */
    public void setProDefId(String proDefId) {
        this.proDefId = proDefId;
    }
}
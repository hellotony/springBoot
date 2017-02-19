package com.dream.demo;

import java.util.Date;

public class BaseEntity{

    private static final long serialVersionUID = 8413510716038129599L;

    private Integer id;
    
    /**
     * 创建时间
     * */
    private Date addTime;

    /**
     * 上次修改时间
     * */
    private Date updateTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getAddTime() {
		return addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}

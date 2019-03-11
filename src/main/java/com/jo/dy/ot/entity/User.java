package com.jo.dy.ot.entity;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.Transient;

public class User implements Serializable {
	/**
	 * @date 2019年1月30日 上午10:33:20
	 * @author weixueqiang
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String username;

	private String password;

	private String salt;

	@Transient
	private String err;

	public String getErr() {
		return err;
	}

	public void setErr(String err) {
		this.err = err;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User() {

	}

	public User(Integer id, String username, String password, String salt) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.salt = salt;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt == null ? null : salt.trim();
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", salt=" + salt + "]";
	}

}
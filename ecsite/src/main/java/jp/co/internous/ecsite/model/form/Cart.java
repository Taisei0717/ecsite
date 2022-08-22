package jp.co.internous.ecsite.model.form;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import jp.co.internous.ecsite.model.entity.Purchase;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import jp.co.internous.ecsite.model.dto.*;
import jp.co.internous.ecsite.model.dao.*;
import java.util.ArrayList;



public class Cart implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private long id;
	private String goodsName;
	private long price;
	private long count;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getGoodsName() {
		return goodsName;
	}
	
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	
	public long getPrice() {
		return price;
	}
	
	public void setPrice(long price) {
		this.price = price;
	}
	
	public long getCount() {
		return count;
	}
	
	public void setCount(long count) {
		this.count = count;
	}
}

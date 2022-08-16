package com.basic.concepts.java8.stream;

import java.util.Comparator;
import java.util.Date;

public class ObjectToSort {

	public static Comparator<ObjectToSort> caComparator = (ObjectToSort o1, ObjectToSort o2) -> Long
			.valueOf(o1.getCorporateActionId()).compareTo(o2.getCorporateActionId());

	private long corporateActionId;
	private Date date;
	private String name;

	public long getCorporateActionId() {
		return corporateActionId;
	}

	public void setCorporateActionId(long corporateActionId) {
		this.corporateActionId = corporateActionId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ObjectToSort [corporateActionId=" + corporateActionId + ", date=" + date + ", name=" + name + "]";
	}

}

package io.sdb.model;

import io.sdb.model.base.BaseSpecification;
import lombok.Data;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
@Data
public class Specification extends BaseSpecification<Specification> {
	public static final Specification dao = new Specification().dao();

	String parentName;
	boolean open;
}

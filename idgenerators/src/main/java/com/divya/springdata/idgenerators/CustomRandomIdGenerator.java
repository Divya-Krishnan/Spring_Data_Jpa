package com.divya.springdata.idgenerators;

import java.util.Random;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

@SuppressWarnings("serial")
public class CustomRandomIdGenerator implements IdentifierGenerator {

	@Override
	public Object generate(SharedSessionContractImplementor arg0, Object arg1) {
		
		Random random=null;
		int id =0;
		random=new Random();
		id=random.nextInt(10000);
		
		
		return id;
	}

}

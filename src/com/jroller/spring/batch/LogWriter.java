package com.jroller.spring.batch;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.batch.item.ItemWriter;

public class LogWriter implements ItemWriter {

	private static Logger LOG = Logger.getLogger(LogWriter.class);
	
	@Override
	public void write(List item) throws Exception {

		LOG.info("Inside Custom ItemWriter Method");
		LOG.info(item);
	}

}

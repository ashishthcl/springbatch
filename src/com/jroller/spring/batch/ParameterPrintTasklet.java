package com.jroller.spring.batch;

import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.listener.StepExecutionListenerSupport;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class ParameterPrintTasklet extends StepExecutionListenerSupport implements Tasklet {
	
	private String message;
	
	
	
	@Override
	public void beforeStep(StepExecution stepExecution) {
		super.beforeStep(stepExecution);
		
		JobParameters jobParameters = stepExecution.getJobParameters();
		message = jobParameters.getString("message");
	}

	@Override
	public RepeatStatus execute(StepContribution arg0, ChunkContext arg1)
			throws Exception {
		System.out.println(message);
		return RepeatStatus.FINISHED;
	}

	
	//TODO - http://jroller.com/0xcafebabe/entry/spring_batch_hello_world_3
	
	
	
}

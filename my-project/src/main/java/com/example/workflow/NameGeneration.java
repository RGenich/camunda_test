package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class NameGeneration implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        String status = (String) delegateExecution.getVariable("status");
        String name = "Roma";
        String surname = "Genich";

        delegateExecution.setVariable("status", status);
        delegateExecution.setVariable("name", name);
        delegateExecution.setVariable("surname", surname);

    }
}

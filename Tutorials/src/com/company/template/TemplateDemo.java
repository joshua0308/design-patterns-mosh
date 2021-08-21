package com.company.template;

public class TemplateDemo {
    public static void show() {
        var transferTask = new TransferMoneyTask();
        transferTask.execute();
        // when task is used outside the class, doExecute cannot be called directly
        // we only want the consumer to call execute, not doExecute directly

        var reportTask = new GenerateReportTask();
        reportTask.execute();
    }
}

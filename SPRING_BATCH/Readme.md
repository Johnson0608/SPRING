材料：

中文-https://blog.csdn.net/Aria_Miazzy/article/details/88381998

英文-https://www.journaldev.com/17157/spring-batch-example

## 基础概念

（1）工作（job）可以包含'n'个步骤（step）。每个步骤都包含Read-Process-Write任务，或者它可以具有单个操作，称为tasklet。

（2）Read-Process-Write基本上是从数据库，CSV等源读取的，然后处理数据并将其写入数据库，CSV，XML等源。

（3）Tasklet意味着执行单个任务或操作，如清理连接，在处理完成后释放资源。

Read-Process-Write和tasklet可以链接在一起以运行作业。

##  表

Below are the details of each meta-data table.

1、Batch_job_instance: The BATCH_JOB_INSTANCE table holds all information relevant to a JobInstance.
（当执行一个job时，会在这个表里增加一条记录）

2、Batch_job_execution_params: The BATCH_JOB_EXECUTION_PARAMS table holds all information relevant to the JobParameters object.
（）

3、Batch_job_execution: The BATCH_JOB_EXECUTION table holds data relevant to the JobExecution object. A new row gets added every time a Job is run.
（记录了job的执行状态，与jobinstance对应，jobinstance）

4、Batch_step_execution: The BATCH_STEP_EXECUTION table holds all information relevant to the StepExecution object.
（记录了step的执行状态，案例只记录了一个step）

5、Batch_job_execution_context: The BATCH_JOB_EXECUTION_CONTEXT table holds data relevant to an Job’s ExecutionContext. There is exactly one Job ExecutionContext for every JobExecution, and it contains all of the job-level data that is needed for that particular job execution. This data typically represents the state that must be retrieved after a failure so that a JobInstance can restart from where it had failed.

6、Batch_step_execution_context: The BATCH_STEP_EXECUTION_CONTEXT table holds data relevant to an Step’s ExecutionContext. There is exactly one ExecutionContext for every StepExecution, and it contains all of the data that needs to persisted for a particular step execution. This data typically represents the state that must be retrieved after a failure so that a JobInstance can restart from where it failed.

7、Batch_job_execution_seq: This table holds the data execution sequence of job.

8、Batch_step_execution_seq: This table holds the data for sequence for step execution.

9、Batch_job_seq: This table holds the data for sequence of job in case we have multiple jobs we will get multiple rows.

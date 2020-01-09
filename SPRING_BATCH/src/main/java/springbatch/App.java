package springbatch;


import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        String[] springConfig = { "spring/batch/jobs/job-batch-demo.xml" };

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(springConfig);

        // 1
        JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
        // 2 根据job id获取job
        Job job = (Job) context.getBean("DemoJobXMLWriter");
        // 3 设置job参数
        JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
                .toJobParameters();

        try {
            // 4 执行job
            JobExecution execution = jobLauncher.run(job, jobParameters);
            System.out.println("Exit Status : " + execution.getStatus());

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Done");
        context.close();
    }
}

package springbatch;

import org.springframework.batch.item.ItemProcessor;
import springbatch.model.Report;

/*
 * Now as defined in the job configuration an itemProcessor will be fired before itemWriter. We have created a CustomItemProcessor.java class for the same.
 * */
public class CustomItemProcessor implements ItemProcessor<Report, Report> {

    public Report process(Report item) throws Exception {

        System.out.println("Processing..." + item);
        String fname = item.getFirstName();
        String lname = item.getLastName();

        item.setFirstName(fname.toUpperCase());
        item.setLastName(lname.toUpperCase());
        return item;
    }

}

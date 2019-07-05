package tesseract.sample;

import org.springframework.stereotype.Component;
import tesseract.core.annotation.TesseractJob;
import tesseract.core.context.ExecutorContext;
import tesseract.core.handler.JobHandler;

@TesseractJob(triggerName = "test")
@Component
public class TestJob implements JobHandler {
    @Override
    public void execute(ExecutorContext executorContext) throws Exception {
        System.out.println(executorContext);
    }
}
package springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import javax.servlet.http.HttpSession;

@RestController
public class SpringMvcController {

    private static Logger logger = LogManager.getLogger(SpringMvcController.class);

    @Autowired
    HttpSession session;

    @GetMapping("/")
    public IndexData root() {
        logger.info("Method: root");
        return new IndexData("1", "Hello World!!");
    }

    @GetMapping("/sleep") 
    public String sleep(Model model, @RequestParam(value = "sec", defaultValue = "0") int sec) {
        logger.info("Method: sleep");
        try {
            logger.info("Start sleep " + sec + " sec.");
            Thread.sleep(1000 * sec);
            logger.info("End sleep " + sec + " sec.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "sleep";
    }

    @GetMapping("/save") 
    public String save() {
        logger.info("Method: save");
        session.setAttribute("data", "Hello World(HttpSession)!!");
        return "save";
    }

    @GetMapping("/load")
    public String load() {
        logger.info("Method: load");
        String data = (String)session.getAttribute("data");
        logger.info("data: " + data);
        //session.invalidate();
        return "load";
    }

    @GetMapping("/healthz")
    public String healthz() {
        logger.info("Method: healthz");
        return "healthz";
    }
}

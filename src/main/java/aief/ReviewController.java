package aief;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController {

    private static final String template = "Hello %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="Worldd") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    @RequestMapping("/location")
    public String location() {
        return "llllllllll";
    }
    @RequestMapping("/order")
    public String getorder() {
        return Readorder();
    }
    
  
    
    public String Readorder(){
    	 String JSONorder="";
    	
    	BufferedReader br = null;
    	 
		try {
 
			String sCurrentLine;
           
			br = new BufferedReader(new FileReader("F:\\Danushka\\server\\order.txt"));
 
			while ((sCurrentLine = br.readLine()) != null) {
			//	System.out.println(sCurrentLine);
				
				JSONorder=JSONorder+sCurrentLine;
				
				
				
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		
		
    	return JSONorder;
    	
    	
    }
    
}

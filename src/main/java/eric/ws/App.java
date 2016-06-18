package eric.ws;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/z")
public class App 
{
    @RequestMapping("/hello/{num}")
    public @ResponseBody Map sayHello(@RequestParam(value="name", required=false, defaultValue="Stranger") String name,@PathVariable int num) {
    	Map<String, Object> resultMap = new HashMap<String, Object>();
    	resultMap.put("name", name);
    	resultMap.put("num", num);
    	resultMap.put("big_penis", "eric");
    	return resultMap;
    }
    
    @RequestMapping("/hello2/{num}")
    public @ResponseBody Map sayHello2(@RequestParam(value="name", required=false, defaultValue="Stranger") String name,@PathVariable int num) {
    	Map<String, Object> resultMap = new HashMap<String, Object>();
    	resultMap.put("name", name);
    	resultMap.put("num", num);
    	resultMap.put("big_penis", "evonne");
    	return resultMap;
    }
}

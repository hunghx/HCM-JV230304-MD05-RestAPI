package ra.mvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class APIController {
    @GetMapping("/data")
    public Map<String,Object> getObject(){
        Map<String,Object> map = new HashMap<>();
        map.put("name","HUngnx");
        map.put("age",18);
        return map;
    }
}

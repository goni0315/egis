package com.egis.test.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.egis.test.entity.Search;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;





@Controller
@RequestMapping("/*")
public class HomeController {

	//@Autowired
	//BoardDao boardDao;
	
	@RequestMapping(value="index")
	public String index(Model model) {
						
		//model.addAttribute("list", boardDao.getList());		
		
		//System.out.println("dd");
		return "index";
				
	}
	
	@RequestMapping(value="search")
	public String search(Model model, @RequestParam(value="q") String query ) {
				
		StringBuffer response;
		String clientId = "3cK614fe8K1RHXa2Hp4K";
        String clientSecret = "mk74hJSiu_";
        try {
            String text = URLEncoder.encode(query, "UTF-8");
            String apiURL = "https://openapi.naver.com/v1/search/blog?query="+ text; // json 
            //String apiURL = "https://openapi.naver.com/v1/search/blog.xml?query="+ text; // xml 
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("X-Naver-Client-Id", clientId);
            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
            int responseCode = con.getResponseCode();
            BufferedReader br;
            if(responseCode==200) { // ���� ȣ��
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else {  // ���� �߻�
                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
            }
            String inputLine;
            response = new StringBuffer();
            while ((inputLine = br.readLine()) != null) {
                response.append(inputLine);
            }
            br.close();
                        
                        
                   System.out.println(response.toString());
            
            JsonParser jsonParser = new JsonParser();
            JsonObject jsonObject = (JsonObject) jsonParser.parse(response.toString());
            System.out.println(jsonObject.get("items"));
            JsonArray dataArray = (JsonArray) jsonObject.get("items");
            System.out.println(dataArray.get(0));
            System.out.println(((JsonObject) dataArray.get(0)).get("title"));
            
            List<Search> list = new ArrayList<Search>();
            for(int i=0; i<=dataArray.size(); i++) {

            	Search search = new Search();
            	
            	search.setBloggemame(((JsonObject) dataArray.get(i)).get("bloggemame").toString());
            	search.setBloggerlink(((JsonObject) dataArray.get(i)).get("bloggerlink").toString());
            	search.setDescription(((JsonObject) dataArray.get(i)).get("description").toString());
            	search.setTitle(((JsonObject) dataArray.get(i)).get("title").toString());
            	search.setPostdate(((JsonObject) dataArray.get(i)).get("postdate").toString());
            	
            	list.add(search);
            	
            	
            }
            System.out.println(list.get(0).getTitle());
            model.addAttribute("list", list);
            
            
        return "list";    
        
            
        } catch (Exception e) {
            System.out.println(e);
            return "에러";
        }
		
		
		
		
		
		
		
		
				
	}
	

}
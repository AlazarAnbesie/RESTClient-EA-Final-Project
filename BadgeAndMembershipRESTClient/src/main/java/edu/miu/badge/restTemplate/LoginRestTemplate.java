package edu.miu.badge.restTemplate;

import edu.miu.badge.domain.Member;
import edu.miu.badge.domain.RequestUserDTO;
import edu.miu.badge.domain.ResponseMemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class LoginRestTemplate {
    @Autowired
    RestTemplate restTemplate ;
    private String serverUrl = "http://localhost:8080/authentication";

    public ResponseMemberDTO login(String username, String password){
        RequestUserDTO user = new RequestUserDTO();
        user.setUsername(username);
        user.setPassword(password);
        return restTemplate.postForObject(serverUrl,user,ResponseMemberDTO.class);
    }


}
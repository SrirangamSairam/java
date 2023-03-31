package com.example.L13RestTemplatedemo;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/naukri/{keyword}")
//    public JsonNode getNaukri(@PathVariable String keyword) {
    public JobResponse getNaukri(@PathVariable String keyword) {
        String url = "https://www.naukrigulf.com/spapi/jobapi/search?Limit=3&Keywords=";
        url = url + keyword;
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("appId","1112");
        httpHeaders.set("systemId","123");
        HttpEntity<String> httpEntity = new HttpEntity<>(httpHeaders);
        ResponseEntity<JobResponse> jsonNode = restTemplate.exchange(url, HttpMethod.GET, httpEntity, JobResponse.class);
        return jsonNode.getBody();
    }

    @GetMapping("/naukriWhole/{keyword}")
    public JsonNode getNaukriWhole(@PathVariable String keyword) {
        String url = "https://www.naukrigulf.com/spapi/jobapi/search?Limit=3&Keywords=";
        url = url + keyword;
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("appId","1112");
        httpHeaders.set("systemId","123");
        HttpEntity<String> httpEntity = new HttpEntity<>(httpHeaders);
        ResponseEntity<JsonNode> jsonNode = restTemplate.exchange(url, HttpMethod.GET, httpEntity, JsonNode.class);
        return jsonNode.getBody();
    }
}

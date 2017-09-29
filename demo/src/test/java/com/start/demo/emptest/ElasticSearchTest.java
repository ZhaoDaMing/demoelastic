package com.start.demo.emptest;

import org.apache.http.HttpHost;
import org.elasticsearch.client.Response;
import org.elasticsearch.client.RestClient;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by Administrator on 2017/9/25 0025.
 */
public class ElasticSearchTest {

    @Test
    public void test1() throws IOException {
        RestClient restClient = RestClient.builder(
                new HttpHost("118.192.65.92", 9200, "http")).build();

        Response response = restClient.performRequest("GET", "/");
        System.out.println(response.getEntity());
        System.out.println(response.getHost());
        System.out.println(response);
    }
}

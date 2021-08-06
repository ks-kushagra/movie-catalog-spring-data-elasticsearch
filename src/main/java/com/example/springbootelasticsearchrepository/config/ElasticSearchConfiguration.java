
package com.example.springbootelasticsearchrepository.config;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;

@Configuration
@EnableElasticsearchRepositories(basePackages = "com.example.springbootelasticsearchrepository.esrepository")
//@EnableMongoRepositories(basePackages = "com.example.springbootelasticsearchrepository.mongorepository")
@ComponentScan(basePackages = "com.example.springbootelasticsearchrepository")
public class ElasticSearchConfiguration extends AbstractElasticsearchConfiguration{
    
    
    @Bean
    @Override
    public RestHighLevelClient elasticsearchClient() {
    
        ClientConfiguration clientconfig = ClientConfiguration.builder().connectedTo("localhost:9200").build();
         return RestClients.create(clientconfig).rest();
    }
}

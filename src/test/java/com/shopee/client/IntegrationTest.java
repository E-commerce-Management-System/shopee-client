package com.shopee.client;

import com.shopee.client.config.AsyncSyncConfiguration;
import com.shopee.client.config.EmbeddedElasticsearch;
import com.shopee.client.config.EmbeddedKafka;
import com.shopee.client.config.EmbeddedRedis;
import com.shopee.client.config.EmbeddedSQL;
import com.shopee.client.config.JacksonConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { ShopeeClientApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class })
@EmbeddedRedis
@EmbeddedElasticsearch
@EmbeddedSQL
@EmbeddedKafka
public @interface IntegrationTest {
}

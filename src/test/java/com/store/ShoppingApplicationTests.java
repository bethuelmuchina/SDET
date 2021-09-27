package com.store;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.containing;
import static com.github.tomakehurst.wiremock.client.WireMock.post;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShoppingCartApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ShoppingApplicationTests {

    @Rule
    public WireMockRule wireMockRule = new WireMockRule(wireMockConfig().port(8070));

    @Test
    public void test_successful_Registration() {
        stubFor(
                post(urlEqualTo("/registration"))
                        .withRequestBody(containing("new"))
                        .willReturn(aResponse()
                                .withStatus(200)
                                .withHeader("Content-Type", "application/json")));
    }

    @Test
    public void test_unsuccessful_Registration() {
        stubFor(
                post(urlEqualTo("/registration"))
                        .willReturn(aResponse()
                                .withStatus(403)));
    }

    @Test
    public void test_cart() {
        stubFor(
                post(urlEqualTo("/shoppingCart"))
                        .willReturn(aResponse()
                                .withStatus(200)));

    }

    @Test
    public void test_cartCheckOut() {
        stubFor(
                post(urlEqualTo("/shoppingCart/checkout"))
                        .willReturn(aResponse()
                                .withStatus(200)));

    }
}

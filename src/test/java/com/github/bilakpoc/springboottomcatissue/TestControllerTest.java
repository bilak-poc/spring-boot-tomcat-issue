package com.github.bilakpoc.springboottomcatissue;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import mockit.Capturing;

@SpringBootTest(classes = {
  SpringBootTomcatIssueApplication.class }, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureWebTestClient
public class TestControllerTest {
  
  @Capturing
  private TestService testService;
  
  @Autowired
  private WebTestClient webTestClient;
  
  @Test
  void helloTest() {
    final String hello = webTestClient
      .get()
      .uri("/hello")
      .exchange()
      .expectBody(String.class)
      .returnResult()
      .getResponseBody();
    
    assertThat(hello, is("hello"));
  }
  
}
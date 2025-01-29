package org.maramincho.liar_game.user.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.jayway.jsonpath.JsonPath;
import jdk.jfr.ContentType;
import org.junit.jupiter.api.*;
import org.maramincho.liar_game.user.dto.CreateUser;
import org.maramincho.liar_game.user.repository.BasicUserRecordRepository;
import org.maramincho.liar_game.user.repository.BasicUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.*;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@AutoConfigureMockMvc
@TestMethodOrder(MethodOrderer.MethodName.class)
class BasicUserServiceTest {
    @Autowired
    protected MockMvc mockMvc;

    @Autowired
    private WebApplicationContext context;

    @Autowired
    protected ObjectMapper objectMapper;

    @Autowired
    private BasicUserRepository basicUserRepository;

    @Autowired
    private BasicUserRecordRepository basicUserRecordRepository;

    @BeforeEach
    public void setMockMvc() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(context)
                .build();
    }

    @Test
    @DisplayName("api/v1/user, POST, User추가에 성공합니다.")
    void createUserWithEmptyEmailAndEmptyPassword() throws Exception {
        // Assign
        final String url = "/api/v1/user";
        final CreateUser.Request request = new CreateUser.Request(null, null, null);
        final String requestBody = objectMapper.writeValueAsString(request);

        basicUserRepository.deleteAll();
        basicUserRecordRepository.deleteAll();

        // Act
        ResultActions mvcActions = mockMvc.perform(MockMvcRequestBuilders.post(url)
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
                        .content(requestBody)
                );
        MvcResult mvcResult = mvcActions.andExpect(MockMvcResultMatchers.status().isCreated()).andReturn();

        // Assert
        String responseString = mvcResult.getResponse().getContentAsString();
        CreateUser.Response response = new Gson().fromJson(responseString, CreateUser.Response.class);

        final var targetUserEntity = basicUserRepository.getReferenceById(response.id());

        assertThat(targetUserEntity.getNickName()).isEqualTo(response.nickName());
    }
}
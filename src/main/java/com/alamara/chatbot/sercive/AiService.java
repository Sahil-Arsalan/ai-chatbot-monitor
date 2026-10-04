package com.alamara.chatbot.sercive;

import com.alamara.chatbot.dto.AiResponse;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class AiService {

    private final ChatClient chatClient;

    public AiService(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    public AiResponse askfromAi(String query) {
        String responseFromAi = chatClient.prompt(query).call().content();
        return AiResponse.builder().response(responseFromAi).success(true).build();
    }
}

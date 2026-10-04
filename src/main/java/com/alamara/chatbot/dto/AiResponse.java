package com.alamara.chatbot.dto;

import lombok.Builder;

@Builder
public record AiResponse(
        String response,
        boolean success
) {
}

package com.alamara.chatbot.controller;

import com.alamara.chatbot.dto.AiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.alamara.chatbot.sercive.AiService;

@RestController
@RequestMapping("/api/v1/ai")
public class AiController {

    private final AiService aiService;

    public AiController(AiService aiService) {
        this.aiService = aiService;
    }

    @PostMapping
    public ResponseEntity<AiResponse> askFromAi(@RequestParam("query") String query){
        AiResponse aiResponse = aiService.askfromAi(query);
        return ResponseEntity.status(HttpStatus.OK).body(aiResponse);
    }
}

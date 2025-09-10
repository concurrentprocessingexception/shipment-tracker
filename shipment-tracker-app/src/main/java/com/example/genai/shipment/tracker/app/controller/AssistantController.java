package com.example.genai.shipment.tracker.app.controller;

import com.example.genai.shipment.tracker.app.dto.ChatRequest;
import com.example.genai.shipment.tracker.app.dto.ChatResponse;
import com.example.genai.shipment.tracker.app.service.GenAiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class AssistantController {

    @Autowired
    private GenAiService genAiService;

    @PostMapping("/app/chat")
    public ResponseEntity<ChatResponse> handleRequest(@RequestBody ChatRequest chatRequest) {
        log.info("Request Received : {}", chatRequest);
        ChatResponse chatResponse = null;
        try {
            chatResponse = genAiService.handleRequest(chatRequest);
            return ResponseEntity.ok(chatResponse);
        } catch(Exception e) {
            log.error("Error occurred while processing request : {}", e.getMessage());
            return ResponseEntity.ok(new ChatResponse("Error!!! Please try again!!!"));
        } finally {
            log.info("Request processing complete!!! Response : {}", chatResponse);
        }
    }
}

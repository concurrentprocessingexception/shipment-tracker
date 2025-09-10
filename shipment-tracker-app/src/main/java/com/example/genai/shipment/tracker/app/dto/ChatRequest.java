package com.example.genai.shipment.tracker.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatRequest {

    private String message;
    private List<ChatMessage> history;
}

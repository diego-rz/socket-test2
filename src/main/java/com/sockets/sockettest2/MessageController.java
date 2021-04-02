package com.sockets.sockettest2;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {

  @MessageMapping("/chat")
  @SendTo("/topic/messages")
  public Message send(Message message) {
    System.out.println("Nuevo mensaje: " + message);
    return message;
  }

}

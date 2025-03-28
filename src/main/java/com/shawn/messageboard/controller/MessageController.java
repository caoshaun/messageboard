package com.shawn.messageboard.controller;

import com.shawn.messageboard.entity.Message;
import com.shawn.messageboard.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/messages")
@CrossOrigin(origins = "*")
public class MessageController {

    @Autowired
    private MessageService messageService;

    // 获取所有留言
    @GetMapping
    public List<Message> getAllMessages() {
        return messageService.getAllMessages();
    }

    // 提交新留言
    @PostMapping
    public Message createMessage(@RequestBody Message message) {
        return messageService.saveMessage(message);
    }

    // 删除留言
    @DeleteMapping("/{id}")
    public void deleteMessage(@PathVariable Long id) {
        messageService.deleteMessage(id);
    }
}

package com.shawn.messageboard.service;

import com.shawn.messageboard.entity.Message;
import com.shawn.messageboard.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    // 查询所有留言
    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }

    // 保存留言
    public Message saveMessage(Message message) {
        return messageRepository.save(message);
    }

    // 根据ID查询留言
    public Optional<Message> getMessageById(Long id) {
        return messageRepository.findById(id);
    }

    // 删除留言
    public void deleteMessage(Long id) {
        messageRepository.deleteById(id);
    }
}

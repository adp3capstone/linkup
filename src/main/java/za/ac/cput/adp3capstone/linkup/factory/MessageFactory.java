package za.ac.cput.adp3capstone.linkup.factory;

import za.ac.cput.adp3capstone.linkup.domain.message.Message;
import za.ac.cput.adp3capstone.linkup.Domain.message.MessageStatus;
import za.ac.cput.adp3capstone.linkup.Domain.message.MessageType;
import za.ac.cput.adp3capstone.linkup.util.Helper;

import java.time.LocalDate;

public class MessageFactory {
    public static Message createMessage(long messageId, long senderId, long receiverId, long conversationId, long replyToMessageId, String message
            , boolean isRead, boolean isDeleted, MessageStatus status, String attachmentUrl, MessageType messageType) {
        if (!Helper.isValidLong(messageId) || !Helper.isValidLong(senderId) || !Helper.isValidLong(receiverId)
                || !Helper.isValidLong(conversationId) || !Helper.isValidLong(replyToMessageId) || Helper.isStringNullOrEmpty(message)
                || !Helper.isTrue(isRead) || Helper.isTrue(isDeleted) || Helper.isObjectNull(status)
                || Helper.isStringNullOrEmpty(attachmentUrl) || Helper.isObjectNull(messageType))
            return null;

        LocalDate timestamp = Helper.getDate(message);

        return new Message.Builder().setMessageId(messageId)
                .setSenderId(senderId)
                .setReceiverId(receiverId)
                .setConversationId(conversationId)
                .setReplyToMessageId(replyToMessageId)
                .setMessage(message)
                .setTimestamp(timestamp)
                .setRead(isRead)
                .setDeleted(isDeleted)
                .setStatus(status)
                .setAttachmentUrl(attachmentUrl)
                .setMessageType(messageType)
                .build();
    }
}

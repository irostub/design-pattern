package com.irostub.designpatterns._04builder.after;

import java.time.LocalDateTime;

public class EmbedMessage {
    private String title;
    private String author;
    private String desc;
    private String tail;
    private String avatarUrl;
    private LocalDateTime createAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDesc() {
        return desc;
    }

    public String getTail() {
        return tail;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setDeletedAt(LocalDateTime deletedAt) {
        this.deletedAt = deletedAt;
    }

    @Override
    public String toString() {
        return "EmbedMessage{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", desc='" + desc + '\'' +
                ", tail='" + tail + '\'' +
                ", avatarUrl='" + avatarUrl + '\'' +
                ", createAt=" + createAt +
                ", updatedAt=" + updatedAt +
                ", deletedAt=" + deletedAt +
                '}';
    }
}

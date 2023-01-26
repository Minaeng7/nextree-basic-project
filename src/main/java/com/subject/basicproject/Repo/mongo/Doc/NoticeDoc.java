package com.subject.basicproject.Repo.mongo.Doc;
import com.subject.basicproject.Entity.User;
import com.subject.basicproject.Entity.Notice;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.stream.Collectors;

@Document(collection = "notice")
@NoArgsConstructor
@Getter
@Setter
public class NoticeDoc{
    private String id;
    private String title;
    private String contents;
    private User user;

    public NoticeDoc(Notice notice) {
        super();
        BeanUtils.copyProperties(notice, this);
    }
    public Notice toEntity() {
        Notice notice = new Notice();
        BeanUtils.copyProperties(this, notice);
        return notice;
    }

    public static List<Notice> toEntities(List<NoticeDoc> noticeDocs) {
        return noticeDocs.stream().map(NoticeDoc::toEntity).collect(Collectors.toList());
    }
}

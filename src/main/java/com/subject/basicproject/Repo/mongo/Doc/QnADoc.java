package com.subject.basicproject.Repo.mongo.Doc;

import com.subject.basicproject.Entity.User;
import com.subject.basicproject.Entity.QnA;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.stream.Collectors;

@Document(collection = "qna")
@NoArgsConstructor
@Getter
@Setter
public class QnADoc {
    private String id;
    private String questionTitle;
    private String questionContents;
    private String answer;
    private User quesUser;
    private User ansUser;
    private String regDate;
    private String ansDate;

    public QnADoc(QnA qna) {
        super();
        BeanUtils.copyProperties(qna, this);
    }
    public QnA toEntity() {
        QnA qna = new QnA();
        BeanUtils.copyProperties(this, qna);
        return qna;
    }

    public static List<QnA> toEntities(List<QnADoc> qnaDocs) {
        return qnaDocs.stream().map(QnADoc::toEntity).collect(Collectors.toList());
    }
}

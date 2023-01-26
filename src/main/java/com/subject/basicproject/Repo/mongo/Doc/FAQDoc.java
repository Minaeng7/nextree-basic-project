package com.subject.basicproject.Repo.mongo.Doc;

import com.subject.basicproject.Entity.User;
import com.subject.basicproject.Entity.FAQ;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.stream.Collectors;

@Document(collection = "faq")
@NoArgsConstructor
@Getter
@Setter
public class FAQDoc {
    private String id;
    private String title;
    private String contents;
    private User user;

    public FAQDoc(FAQ faq) {
        super();
        BeanUtils.copyProperties(faq, this);
    }
    public FAQ toEntity() {
        FAQ faq = new FAQ();
        BeanUtils.copyProperties(this, faq);
        return faq;
    }

    public static List<FAQ> toEntities(List<FAQDoc> faqDocs) {
        return faqDocs.stream().map(FAQDoc::toEntity).collect(Collectors.toList());
    }
}

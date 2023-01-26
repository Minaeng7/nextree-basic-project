package com.subject.basicproject.Service;

import com.subject.basicproject.Entity.QnA;
import com.subject.basicproject.Repo.mongo.QnAMongoStore;
import com.subject.basicproject.Util.Util;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class QnAService {

    private final QnAMongoStore store;

    public QnAService(QnAMongoStore store) {
        this.store = store;
    }


    public List<QnA> getQnAList(){
        return store.retrieveAll();
    }


    public void regQnA(QnA qna) {// regQna 는 사용자가 질문 등록할 떄 호출함.
        qna.setId(Util.genId());
        qna.setRegDate(Util.genDate());
        store.create(qna);
    }

    public void modQnA(QnA qna) {
        qna.setAnsDate(Util.genDate());
        store.update(qna);
    } // modQna의 경우 답변자가 답변을 추가하거나 질문자가 질문을 수정할 때 호출.

    public void deleteQnA(String id) {
        store.delete(id);
    }

    public QnA getQnA(String id) {
        return store.retrieveById(id);
    }
}

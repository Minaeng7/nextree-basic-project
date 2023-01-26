package com.subject.basicproject.Repo.mongo;


import com.subject.basicproject.Entity.QnA;
import com.subject.basicproject.Repo.mongo.Doc.QnADoc;
import com.subject.basicproject.Repo.mongo.repository.QnARepo;
import com.subject.basicproject.Repo.qnaStore;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Repository
public class QnAMongoStore implements qnaStore {


    private final QnARepo repo;

    public QnAMongoStore(QnARepo repo) {
        this.repo = repo;
    }

    @Override
    public void create(QnA qna) {
        QnADoc qnaDoc = new QnADoc(qna);
        repo.save(qnaDoc);
    }

    @Override
    public void createAll(List<QnA> qnas) {

    }

    @Override
    public void update(QnA qna) {
        QnADoc qnaDoc = new QnADoc(qna);
        repo.save(qnaDoc);
    }

    @Override
    public void delete(QnA qna) {

    }

    @Override
    public void delete(String id) {
        repo.deleteById(id);
    }

    @Override
    public void deleteAll(List<String> ids) {

    }

    @Override
    public boolean exists(Long id) {
        return false;
    }

    @Override
    public QnA retrieveById(String id) {
        Optional<QnADoc> qnaDoc = repo.findById(id);
        return qnaDoc.map(QnADoc::toEntity).orElseGet(()-> null);
    }

    @Override
    public List<QnA> retrieveAll() {
        return QnADoc.toEntities(repo.findAll());
    }
}

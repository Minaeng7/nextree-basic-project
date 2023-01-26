package com.subject.basicproject.Service;

import com.subject.basicproject.Entity.Notice;
import com.subject.basicproject.Repo.mongo.NoticeMongoStore;
import org.springframework.stereotype.Service;
import com.subject.basicproject.Util.Util;
import java.util.List;


@Service
public class NoticeService {

    private final NoticeMongoStore store;

    public NoticeService(NoticeMongoStore store) {
        this.store = store;
    }



    public List<Notice> getNoticeList(){
        return store.retrieveAll();
    }

    public void regNotice(Notice notice) {
        notice.setId(Util.genId());
        store.create(notice);
    }

    public void modNotice(Notice notice) {
        store.update(notice);
    }

    public void deleteNotice(String id) {
        store.delete(id);
    }

    public Notice getNotice(String id) {
        return store.retrieveById(id);
    }
}

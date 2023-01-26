package com.subject.basicproject.Repo.mongo.Doc;

import com.subject.basicproject.Entity.SideMenu;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.stream.Collectors;

@Document(collection = "sidemenu")
@NoArgsConstructor
@Getter
@Setter
public class SideMenuDoc {
    private String name;
    private String menuId;
    private String url;

    public SideMenuDoc(SideMenu sideMenu) {
        super();
        BeanUtils.copyProperties(sideMenu,this);
    }

    public SideMenu toEntity() {
        SideMenu sideMenu = new SideMenu();
        BeanUtils.copyProperties(this, sideMenu);
        return sideMenu;
    }

    public static List<SideMenu> toEntities(List<SideMenuDoc> sideMenuDocs) {
        return sideMenuDocs.stream().map(SideMenuDoc::toEntity).collect(Collectors.toList());
    }
}

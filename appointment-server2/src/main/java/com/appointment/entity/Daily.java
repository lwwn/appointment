package com.appointment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Daily {

    private  int id;

    private  String title;

    private  String coverUrl;

    private  String content;

    public Daily(String title, String coverUrl, String content) {
        this.title = title;
        this.coverUrl = coverUrl;
        this.content = content;
    }
}

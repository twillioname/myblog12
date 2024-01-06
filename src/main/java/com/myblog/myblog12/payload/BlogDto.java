package com.myblog.myblog12.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlogDto {


    private long id;

    private String name;

    private String city;

    private long mobile;

    private String content;
}

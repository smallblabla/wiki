package com.panfy.wiki.req;

import lombok.Data;

/**
 * ebook
 * @author panfy
 * @date 2021-06-02 22:33:44
 */
@Data
public class EbookReq {
    /**
     * id
     */
    private Long id;

    /**
     * 名称
     */
    private String name;
}
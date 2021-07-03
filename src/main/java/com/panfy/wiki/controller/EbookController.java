package com.panfy.wiki.controller;

import com.panfy.wiki.req.EbookReq;
import com.panfy.wiki.resp.CommonResp;
import com.panfy.wiki.resp.EbookResp;
import com.panfy.wiki.service.EbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: wiki
 * @description: 书籍信息相关接口
 * @author: panfuyan
 * @create: 2021-06-05 20:21
 **/
@RestController
public class EbookController {

    @Autowired
    private EbookService ebookService;

    @GetMapping("/list")
    public CommonResp ebookList(EbookReq ebookReq){
        CommonResp<List<EbookResp>> commonResp = new CommonResp();
        List<EbookResp> list = ebookService.selectEbookLists(ebookReq);
        commonResp.setContent(list);
        return commonResp;
    }
}

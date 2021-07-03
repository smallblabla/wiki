package com.panfy.wiki.service;

import com.panfy.wiki.domain.Ebook;
import com.panfy.wiki.domain.EbookExample;
import com.panfy.wiki.mapper.EbookMapper;
import com.panfy.wiki.req.EbookReq;
import com.panfy.wiki.resp.EbookResp;
import com.panfy.wiki.utils.CopyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: wiki
 * @description: 电子书Service
 * @author: panfuyan
 * @create: 2021-06-05 17:47
 **/
@Service
public class EbookService {

    @Autowired
    private EbookMapper ebookMapper;


    /**
     * 根据信息查询相关列表
     * @param req
     * @return java.util.List<com.panfy.wiki.domain.Ebook>
     * @Author: panfuyan on 2021/6/5 20:28
     **/
    public List<EbookResp> selectEbookLists(EbookReq req){
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%" + req.getName() + "%");
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);
        List<EbookResp> ebookResp = CopyUtil.copyList(ebookList, EbookResp.class);
        return ebookResp;
    }


}

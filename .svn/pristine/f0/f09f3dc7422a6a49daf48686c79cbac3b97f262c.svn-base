package com.jz.quoteoperation.suggestion.service.impl;


import com.jz.quoteoperation.suggestion.dao.SuggestionMapper;
import com.jz.quoteoperation.suggestion.po.Suggestion;
import com.jz.quoteoperation.suggestion.po.SuggestionExample;
import com.jz.quoteoperation.suggestion.service.SuggestionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * 　　 ┏┓   ┏┓
 * 　　┏┛┻━━━┛┻┓
 * 　　┃       ┃
 * 　　┃   ━   ┃
 * 　　┃ ┳┛ ┗┳ ┃
 * 　　┃       ┃
 * 　　┃   ┻   ┃
 * 　　┃       ┃
 * 　　┗━┓   ┏━┛
 * 　　  ┃   ┃
 * 　　  ┃   ┃  　　
 * 　　  ┃   ┗━━━┓
 * 　　  ┃       ┣┓
 * 　　  ┃       ┏┛
 * 　　  ┗┓┓┏━┳┓┏┛
 * 　　   ┃┫┫ ┃┫┫
 * 　　   ┗┻┛ ┗┻┛
 * @author 张成
 * @date    2018/8/14
 */

@Service(value = "SuggestionService")
public class SuggestionServiceImpl implements SuggestionService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SuggestionMapper suggestionMapper;

    @Override
    public List<Suggestion> selectAll(SuggestionExample example) {
        logger.trace("日志输出 trace");
        logger.debug("日志输出 debug");
        logger.info("日志输出 info"+example.createCriteria().getAllCriteria());
        logger.warn("日志输出 warn");
        logger.error("日志输出 error");
        return suggestionMapper.selectByExample(example);
    }

    @Override
    public void save(Suggestion suggestion) {
        suggestionMapper.insert(suggestion);
    }

    @Override
    public void update(Suggestion suggestion,SuggestionExample suggestionExample) {
        suggestionMapper.updateByExample(suggestion,suggestionExample);
    }
}

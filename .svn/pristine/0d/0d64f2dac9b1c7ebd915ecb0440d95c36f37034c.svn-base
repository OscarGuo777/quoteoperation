package com.jz.quoteoperation.suggestion.dao;

import com.jz.quoteoperation.suggestion.po.Suggestion;
import com.jz.quoteoperation.suggestion.po.SuggestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SuggestionMapper {
    long countByExample(SuggestionExample example);

    int deleteByExample(SuggestionExample example);

    int insert(Suggestion record);

    int insertSelective(Suggestion record);

    List<Suggestion> selectByExample(SuggestionExample example);

    int updateByExampleSelective(@Param("record") Suggestion record, @Param("example") SuggestionExample example);

    int updateByExample(@Param("record") Suggestion record, @Param("example") SuggestionExample example);
}
package vn.myclass.core.service;

import java.util.Map;

public interface ExaminationQuestionService {
    Object[] findByProperty(Map<String, Object> property, String sortExpression, String sortDirection, Integer offset, Integer limit, Integer examinationId);
}

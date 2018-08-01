package com.hs.server.service;

import com.hs.server.domain.Record;
import com.hs.server.dto.param.RecordParam;

import java.util.List;

/**
 * Date:     2018/7/25 15:51<br/>
 *
 * @author Administrator
 * @see
 * @since JDK 1.8
 */
public interface RecordService {
    List<Record> getRecords(RecordParam record);

    void addRecord(Record record);

    void updateRecord(Record record);

    void delRecord(String recordId);

    Record queryRecordDetail(RecordParam record);
}

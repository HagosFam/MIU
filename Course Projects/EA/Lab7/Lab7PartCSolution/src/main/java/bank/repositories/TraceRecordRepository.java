package bank.repositories;



import java.util.Date;

import bank.domain.TraceRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;

import bank.domain.TraceRecord;

public interface TraceRecordRepository extends JpaRepository<TraceRecord, Long> {
	@Transactional(propagation=Propagation.REQUIRES_NEW)
    public default void storeTraceRecord(TraceRecord traceRecord) {
		this.save(traceRecord);
    	
    }

}





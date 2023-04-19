package bank.repositories;




import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import bank.domain.TraceRecord;

public interface TraceRecordRepository extends MongoRepository<TraceRecord, Long> {
	
	
}

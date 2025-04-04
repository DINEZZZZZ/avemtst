package com.redweber.amemtst;



import com.redweber.amemtst.Kit;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface KitRepository extends MongoRepository<Kit, String> {
}


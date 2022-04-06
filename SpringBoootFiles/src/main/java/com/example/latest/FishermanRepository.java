package com.example.latest;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface FishermanRepository extends MongoRepository<FisherMan,String> {

    public FisherMan findFisherManByUserId(String userId);

    // Note that this is not necessary
    /*
    public static void addCart(String userId,BankAccount account){
    }
    // FIXME
     */


}

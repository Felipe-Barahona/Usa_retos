package com.example.retosUsa.Repository.CrudRepository;

import com.example.retosUsa.Model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository<Message, Integer> {
}

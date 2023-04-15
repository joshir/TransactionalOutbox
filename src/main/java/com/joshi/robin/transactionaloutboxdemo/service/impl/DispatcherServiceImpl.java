package com.joshi.robin.transactionaloutboxdemo.service.impl;

import com.joshi.robin.transactionaloutboxdemo.repos.DedupRepository;
import com.joshi.robin.transactionaloutboxdemo.repos.EventOutboxRepository;
import com.joshi.robin.transactionaloutboxdemo.service.DispatcherService;
import org.springframework.stereotype.Service;

@Service
public class DispatcherServiceImpl implements DispatcherService{
  private final DedupRepository dedupRepository;
  private final EventOutboxRepository eventOutboxRepository;
  public DispatcherServiceImpl(DedupRepository dedupRepository, EventOutboxRepository eventOutboxRepository) {
    this.dedupRepository = dedupRepository;
    this.eventOutboxRepository = eventOutboxRepository;
  }

  @Override
  public void deDup() {
  }
  @Override
  public void dispatch() {
  }
}

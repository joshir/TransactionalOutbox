package com.transactionaloutbox.service.impl;

import com.transactionaloutbox.repos.DedupRepository;
import com.transactionaloutbox.repos.EventOutboxRepository;
import com.transactionaloutbox.service.DispatcherService;
import org.springframework.stereotype.Service;

@Service
public class DispatcherServiceImpl implements DispatcherService {
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

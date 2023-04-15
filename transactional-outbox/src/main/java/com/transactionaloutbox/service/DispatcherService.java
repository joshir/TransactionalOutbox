package com.transactionaloutbox.service;

public interface DispatcherService {
  void deDup();
  void dispatch();
}

package com.joshi.robin.transactionaloutboxdemo.service;

public interface DispatcherService {
  void deDup();
  void dispatch();
}

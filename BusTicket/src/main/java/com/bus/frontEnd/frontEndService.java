package com.bus.frontEnd;

import java.util.List;
import com.bus.model.Bus;

public interface frontEndService {
	public List<Bus> getAllBusByRoute(String from,String to);
}
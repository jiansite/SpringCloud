package com.lanjing.springcloud.service;

import java.util.List;

import com.lanjing.springcloud.entities.Dept;

public interface DeptService
{
	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
}

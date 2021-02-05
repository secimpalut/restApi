package com.techproed.restapi02;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;



//@Component
@Service
public class SB09StudentBeanService {

	
	public List<SB07StudentBean> getStudentList() {
		return List.of(
				new SB07StudentBean(101L,"Ali Can","ac@gmail.com",LocalDate.of(2002, Month.JANUARY, 12),19),
				new SB07StudentBean(102L,"Veli Han","vh@gmail.com",LocalDate.of(2002, Month.FEBRUARY, 1),21),
				new SB07StudentBean(103L,"Mary Star","ms@gmail.com",LocalDate.of(2002, Month.DECEMBER, 12),19)


				);
	}
}

package com.devsuperior.hrpayrool.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Worker implements Serializable {

	private Long id;
	private String name;
	private Double dailyIncome;
}

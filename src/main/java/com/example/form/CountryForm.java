package com.example.form;

import java.math.BigDecimal;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.example.domain.Country;

public class CountryForm extends Country{

	@NotNull
	@Size(max=3)
	@Override
	public String getCode() {
		// TODO Auto-generated method stub
		return super.getCode();
	}

	@Override
	public void setCode(String code) {
		// TODO Auto-generated method stub
		super.setCode(code);
	}

	@NotNull
	@Size(max=52)
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Size(max=20)
	@Override
	public String getContinent() {
		// TODO Auto-generated method stub
		return super.getContinent();
	}

	@Override
	public void setContinent(String continent) {
		// TODO Auto-generated method stub
		super.setContinent(continent);
	}

	@Size(max=26)
	@Override
	public String getRegion() {
		// TODO Auto-generated method stub
		return super.getRegion();
	}

	@Override
	public void setRegion(String region) {
		// TODO Auto-generated method stub
		super.setRegion(region);
	}

	@Digits(integer=8, fraction=2)
	@Override
	public BigDecimal getSurfaceArea() {
		// TODO Auto-generated method stub
		return super.getSurfaceArea();
	}

	@Override
	public void setSurfaceArea(BigDecimal surfaceArea) {
		// TODO Auto-generated method stub
		super.setSurfaceArea(surfaceArea);
	}

	@Override
	public BigDecimal getIndepYear() {
		// TODO Auto-generated method stub
		return super.getIndepYear();
	}

	@Override
	public void setIndepYear(BigDecimal indepYear) {
		// TODO Auto-generated method stub
		super.setIndepYear(indepYear);
	}

	@Override
	public BigDecimal getPopulation() {
		// TODO Auto-generated method stub
		return super.getPopulation();
	}

	@Override
	public void setPopulation(BigDecimal population) {
		// TODO Auto-generated method stub
		super.setPopulation(population);
	}

	@Override
	public BigDecimal getLifeExpectancy() {
		// TODO Auto-generated method stub
		return super.getLifeExpectancy();
	}

	@Override
	public void setLifeExpectancy(BigDecimal lifeExpectancy) {
		// TODO Auto-generated method stub
		super.setLifeExpectancy(lifeExpectancy);
	}

	@Override
	public BigDecimal getGnp() {
		// TODO Auto-generated method stub
		return super.getGnp();
	}

	@Override
	public void setGnp(BigDecimal gnp) {
		// TODO Auto-generated method stub
		super.setGnp(gnp);
	}

	@Override
	public BigDecimal getGnpOld() {
		// TODO Auto-generated method stub
		return super.getGnpOld();
	}

	@Override
	public void setGnpOld(BigDecimal gnpOld) {
		// TODO Auto-generated method stub
		super.setGnpOld(gnpOld);
	}

	@Override
	public String getLocalName() {
		// TODO Auto-generated method stub
		return super.getLocalName();
	}

	@Override
	public void setLocalName(String localName) {
		// TODO Auto-generated method stub
		super.setLocalName(localName);
	}

	@Override
	public String getGovernmentForm() {
		// TODO Auto-generated method stub
		return super.getGovernmentForm();
	}

	@Override
	public void setGovernmentForm(String governmentForm) {
		// TODO Auto-generated method stub
		super.setGovernmentForm(governmentForm);
	}

	@Override
	public String getHeadOfState() {
		// TODO Auto-generated method stub
		return super.getHeadOfState();
	}

	@Override
	public void setHeadOfState(String headOfState) {
		// TODO Auto-generated method stub
		super.setHeadOfState(headOfState);
	}

	@Override
	public BigDecimal getCapital() {
		// TODO Auto-generated method stub
		return super.getCapital();
	}

	@Override
	public void setCapital(BigDecimal capital) {
		// TODO Auto-generated method stub
		super.setCapital(capital);
	}

	@Override
	public String getCode2() {
		// TODO Auto-generated method stub
		return super.getCode2();
	}

	@Override
	public void setCode2(String code2) {
		// TODO Auto-generated method stub
		super.setCode2(code2);
	}
	
}

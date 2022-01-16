package com.juaracoding.magang.page.cuti;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.juaracoding.magang.driver.DriverSingleton;

public class AddPriode {

	private WebDriver driver;
	
	public AddPriode() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
// addpriodenya
	@FindBy(css="#content > div.row > div > div > div.panel-body > a")
	private WebElement btnAddPriode;
	
//selectPriode
	@FindBy(name="period")
	private WebElement txtPriode;
	
//inputNotes
	@FindBy(name="notes")
	private WebElement txtNotes;
	
//	tombol action
	@FindBy(css="#form_periode > div.modal-footer > button.btn.btn-primary")
	private WebElement btnAction;
//	createNew
	@FindBy(css="body > div.swal2-container.swal2-center.swal2-backdrop-show > div > div.swal2-actions > button.swal2-confirm.swal2-styled")
	private WebElement btnCreate;
//	click zoomout
	@FindBy(css="#content > div.row > div > div > div.panel-heading.ui-sortable-handle > div > a.btn.btn-xs.btn-icon.btn-circle.btn-default > i")
	private WebElement btnZoomOut;

//tombol clicklistnumber
	@FindBy(css="#dataTable_paginate > ul > li:nth-child(4) > a")
	private WebElement btnNumber;

	@FindBy(css="#dataTable > tbody > tr:nth-child(9) > td:nth-child(4) > a > i")
	private WebElement setHoliday;

	
	

//eksekusi	
	public void btnAddpriode() {
		btnAddPriode.click();
		
	}
	public void txtPriode(int selection) {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		txtPriode.click();
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			 lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();

	}
	
	public void txtNotes(String notes ) {
		txtNotes.sendKeys(notes);		
	}
	
	public void btnAction() {
		btnAction.click();
	}
	
	public void btnCreate() {
		btnCreate.click();
	}
	
	public void btnZoomOut() {
		btnZoomOut.click();
	}
	
	public void btnNumber() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,800)");
		btnNumber.click();
	}
	
	public void setHoliday() {
		setHoliday.click();
	}


}
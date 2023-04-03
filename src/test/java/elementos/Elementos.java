package elementos;

import org.openqa.selenium.By;

public class Elementos {

	By firstname = By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[1]/input");

	By lastname = By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[2]/input");

	By address = By.xpath("/html/body/section/div/div/div[2]/form/div[2]/div/textarea");

	By email = By.xpath("/html/body/section/div/div/div[2]/form/div[3]/div[1]/input");

	By phone = By.xpath("/html/body/section/div/div/div[2]/form/div[4]/div/input");

	By gender = By.xpath("/html/body/section/div/div/div[2]/form/div[5]/div/label[2]/input");

	By hobbies = By.xpath("/html/body/section/div/div/div[2]/form/div[6]/div/div[1]/input");

	By languages = By.xpath("/html/body/section/div/div/div[2]/form/div[7]/div/multi-select/div[1]");

	By ingles = By.xpath("/html/body/section/div/div/div[2]/form/div[7]/div/multi-select/div[2]/ul/li[8]/a");

	By skills = By.xpath("/html/body/section/div/div/div[2]/form/div[8]/div/select/option[2]");

	By country = By.xpath("/html/body/section/div/div/div[2]/form/div[9]/div/select");

	By selectcoutry = By.xpath("/html/body/section/div/div/div[2]/form/div[10]/div/span/span[1]/span");

	By australia = By.xpath("/html/body/span/span/span[2]/ul/li[2]");

	By year = By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[1]/select/option[70]");

	By month = By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[2]/select/option[6]");

	By day = By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[3]/select/option[25]");

	By password = By.xpath("/html/body/section/div/div/div[2]/form/div[12]/div/input");

	By confirme = By.xpath("/html/body/section/div/div/div[2]/form/div[13]/div/input");

	By submit = By.xpath("/html/body/section/div/div/div[2]/form/div[14]/div/button[1]");

	By suwitchto = By.xpath("/html/body/header/nav/div/div[2]/ul/li[4]/a");

	By frames = By.xpath("/html/body/header/nav/div/div[2]/ul/li[4]/ul/li[3]/a");

	By demoifraime = By.xpath("/html/body/section/div/div/div/input");

	By widgets = By.xpath("/html/body/header/nav/div/div[2]/ul/li[5]/a");

	By datepicker = By.xpath("/html/body/header/nav/div/div[2]/ul/li[5]/ul");

	By disabledmonth = By.xpath("/html/body/div/div/div/span[1]");

	By disabledday = By.xpath("/html/body/div/table/tbody/tr[4]/td[5]/a");

	By disabledyear = By.xpath("/html/body/div/div/div/span[2]");

	By enabledmonth = By.xpath("/html/body/div[2]/div/div[2]/div/div/select[1]/option[5]");

	By enabledday = By.xpath("/html/body/div[2]/div/div[2]/div/table/tbody/tr[4]/td[4]/a");

	By enablendyear = By.xpath("/html/body/div[2]/div/div[2]/div/div/select[2]/option[2]");

	By cookie = By.xpath("/html/body/div/div/div[1]/div[1]");

	By cookiedentro = By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div[2]/div/div/div[3]/div/span");

	By buttonPopUp = By.xpath("/html/body/script[2]s");

	By Photo = By.xpath("/html/body/section/div/div/div[3]/div[2]/input");
	
	By Slider = By.xpath("/html/body/header/nav/div/div[2]/ul/li[5]/a");
	
	By cursorslider = By.xpath("/html/body/section/div[1]/div/div/div/a");
	
	

	public By getSlider() {
		return Slider;
	}

	public void setSlider(By slider) {
		Slider = slider;
	}

	public By getCursorslider() {
		return cursorslider;
	}

	public void setCursorslider(By cursorslider) {
		this.cursorslider = cursorslider;
	}

	public By getPhoto() {
		return Photo;
	}

	public void setPhoto(By photo) {
		Photo = photo;
	}

	public By getButtonPopUp() {
		return buttonPopUp;
	}

	public void setButtonPopUp(By buttonPopUp) {
		this.buttonPopUp = buttonPopUp;
	}

	public By getCookiedentro() {
		return cookiedentro;
	}

	public void setCookiedentro(By cookiedentro) {
		this.cookiedentro = cookiedentro;
	}

	public By getCookie() {
		return cookie;
	}

	public void setCookie(By cookie) {
		this.cookie = cookie;
	}

	public By getIngles() {
		return ingles;
	}

	public By getSuwitchto() {
		return suwitchto;
	}

	public By getFrames() {
		return frames;
	}

	public void setFrames(By frames) {
		this.frames = frames;
	}

	public void setSuwitchto(By suwitch) {
		this.suwitchto = suwitch;
	}

	public By getDemoifraime() {
		return demoifraime;
	}

	public void setDemoifraime(By demoifraime) {
		this.demoifraime = demoifraime;
	}

	public By getWidgets() {
		return widgets;
	}

	public void setWidgets(By widgets) {
		this.widgets = widgets;
	}

	public By getDatepicker() {
		return datepicker;
	}

	public void setDatepicker(By datepicker) {
		this.datepicker = datepicker;
	}

	public By getDisabledmonth() {
		return disabledmonth;
	}

	public void setDisabledmonth(By disabledmonth) {
		this.disabledmonth = disabledmonth;
	}

	public By getDisabledday() {
		return disabledday;
	}

	public void setDisabledday(By disabledday) {
		this.disabledday = disabledday;
	}

	public By getDisabledyear() {
		return disabledyear;
	}

	public void setDisabledyear(By disabledyear) {
		this.disabledyear = disabledyear;
	}

	public By getEnabledmonth() {
		return enabledmonth;
	}

	public void setEnabledmonth(By enabledmonth) {
		this.enabledmonth = enabledmonth;
	}

	public By getEnabledday() {
		return enabledday;
	}

	public void setEnabledday(By enabledday) {
		this.enabledday = enabledday;
	}

	public By getEnablendyear() {
		return enablendyear;
	}

	public void setEnablendyear(By enablendyear) {
		this.enablendyear = enablendyear;
	}

	public By getSelectcoutry() {
		return selectcoutry;
	}

	public void setSelectcoutry(By selectcoutry) {
		this.selectcoutry = selectcoutry;
	}

	public By getAustralia() {
		return australia;
	}

	public void setAustralia(By australia) {
		this.australia = australia;
	}

	public By getYear() {
		return year;
	}

	public void setYear(By year) {
		this.year = year;
	}

	public By getMonth() {
		return month;
	}

	public void setMonth(By month) {
		this.month = month;
	}

	public By getDay() {
		return day;
	}

	public void setDay(By day) {
		this.day = day;
	}

	public By getPassword() {
		return password;
	}

	public void setPassword(By password) {
		this.password = password;
	}

	public By getConfirme() {
		return confirme;
	}

	public void setConfirme(By confirme) {
		this.confirme = confirme;
	}

	public By getSubmit() {
		return submit;
	}

	public void setSubmit(By submit) {
		this.submit = submit;
	}

	public void setIngles(By ingles) {
		this.ingles = ingles;
	}

	public By getFirstname() {
		return firstname;
	}

	public void setFirstname(By firstname) {
		this.firstname = firstname;
	}

	public By getLastname() {
		return lastname;
	}

	public void setLastname(By lastname) {
		this.lastname = lastname;
	}

	public By getAddress() {
		return address;
	}

	public void setAddress(By address) {
		this.address = address;
	}

	public By getEmail() {
		return email;
	}

	public void setEmail(By email) {
		this.email = email;
	}

	public By getPhone() {
		return phone;
	}

	public void setPhone(By phone) {
		this.phone = phone;
	}

	public By getGender() {
		return gender;
	}

	public void setGender(By gender) {
		this.gender = gender;
	}

	public By getHobbies() {
		return hobbies;
	}

	public void setHobbies(By hobbies) {
		this.hobbies = hobbies;
	}

	public By getLanguages() {
		return languages;
	}

	public void setLanguages(By languages) {
		this.languages = languages;
	}

	public By getSkills() {
		return skills;
	}

	public void setSkills(By skills) {
		this.skills = skills;
	}

	public By getCountry() {
		return country;
	}

	public void setCountry(By country) {
		this.country = country;
	}

}

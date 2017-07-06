package testing;

import org.testng.annotations.Test;

import Credenciales.Credenciales;
import DataDrive.Data;

import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class test_calculadora {

	public static AppiumDriver<WebElement> driver;

	DesiredCapabilities capabilities = new DesiredCapabilities();

	@BeforeMethod
	public void setUpAppium() throws MalformedURLException, InterruptedException {
		/*
		 * APK INFO:com.google.android.calculator2.Calculator
		 * com.google.android.calculator2.CalculatorSecurity
		 */
		String packagename = "com.badoo.mobile";
		String URL = "http://127.0.0.1:4723/wd/hub";
		// String activityname = "com.android.calculator2.Calculator";
		String activityname = "com.badoo.mobile.android.BadooActivity";
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Name");
		capabilities.setCapability("udid", "3100719eb68c2400");
		capabilities.setCapability("platformVersion", "6.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", packagename);
		capabilities.setCapability("appActivity", activityname);
		driver = new AndroidDriver<WebElement>(new URL(URL), capabilities);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

	}

	@AfterTest
	public void CleanUpAppium() {

		driver.quit();
	}

	@Test
	public void mytest() throws InterruptedException {

		try {

			Assert.assertNotNull(driver.getContext());
			Thread.sleep(5000);
			
			WebElement num2 = driver.findElement(By.id("com.badoo.mobile:id/landingScreen_otherOptions"));
			num2.click();
			
			WebElement num3 = driver.findElement(By.xpath("//android.widget.TextView[@bounds = '[72,977][190,999]']"));
			num3.click(); 
			
			/**
			 * Ingreso a la aplicacion 
			 */
			
			Credenciales credencial = new Credenciales();
			Assert.assertNotNull(driver.getContext());
			Data data = new Data("C://Users//Administrator//Desktop//Libro.xlsx");
			System.out.println("datos capturados");
			int row = 0;
			credencial=data.getCellData(row);
			String Username=credencial.getUsername();
			String Password=credencial.getPassword();
			
			WebElement user = driver.findElement(By.id("com.badoo.mobile:id/user"));
			user.click();

			user.sendKeys(Username);

			WebElement contra = driver.findElement(By.id("com.badoo.mobile:id/password"));
			contra.click();

			contra.sendKeys(Password);
			WebElement con = driver.findElement(By.id("com.badoo.mobile:id/signIn"));
			con.click();

			WebElement numMAS = driver.findElement(By.id("com.badoo.mobile:id/whatsNew_action"));
			numMAS.click();
			WebElement numMAaS = driver.findElement(By.id("com.badoo.mobile:id/whatsNew_action"));
			numMAaS.click();
			WebElement numMAaaS = driver.findElement(By.id("com.badoo.mobile:id/whatsNew_action"));
			numMAaaS.click();

			driver.navigate().back();
			WebElement num9 = driver.findElement(By.id("com.badoo.mobile:id/encountersCards_voteRight"));
			num9.click();
			WebElement plussss = driver.findElement(By.id("android:id/button2"));
			plussss.click();

			WebElement num333 = driver
					.findElement(By.xpath("//android.widget.ImageView[@bounds = '[450,976][600,1024]']"));
			num333.click();

			WebElement num3334 = driver
					.findElement(By.xpath("//android.widget.FrameLayout[@bounds = '[20,491][600,545]']"));
			num3334.click();

			WebElement num33333 = driver
					.findElement(By.xpath("//android.widget.RelativeLayout[@bounds = '[40,191][558,244]']"));
			num33333.click();

			WebElement plus = driver.findElement(By.id("com.badoo.mobile:id/accountSignOut"));
			plus.click();

			WebElement pluss = driver.findElement(By.id("android:id/button1"));
			pluss.click();
			
			String FinalStatus = "Completado";
			data.setStatus(row ,"C://Users//Administrator//Desktop//Libro.xlsx",FinalStatus);
			
			int row2 = 1;
			credencial=data.getCellData(row2);
			String Username2=credencial.getUsername();
			String Password2=credencial.getPassword();

			WebElement user2 = driver.findElement(By.id("com.badoo.mobile:id/user"));
			user2.click();
			user2.clear();

			user2.sendKeys(Username2);

			WebElement contra2 = driver.findElement(By.id("com.badoo.mobile:id/password"));
			contra2.click();

			contra2.sendKeys(Password2);

			WebElement entrar = driver.findElement(By.id("com.badoo.mobile:id/signIn"));
			entrar.click();
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().back();
			//
			WebElement num99 = driver.findElement(By.id("com.badoo.mobile:id/encountersCards_voteRight"));
			num99.click(); // like a nueva cuenta
			
			driver.navigate().back();

			WebElement num3332 = driver
					.findElement(By.xpath("//android.widget.ImageView[@bounds = '[450,976][600,1024]']"));
			num3332.click();
			
			WebElement num38332 = driver.findElement(By.xpath("//android.widget.ImageView[@bounds = '[0,25][60,89]']"));
			num38332.click(); // añadir foto boton

			WebElement num33378 = driver
					.findElement(By.xpath("//android.widget.ImageView[@bounds = '[151,199][298,346]']"));
			num33378.click(); // selecciona imagen

			WebElement anadirr = driver
					.findElement(By.xpath("//android.widget.Button[@bounds = '[524,972][588,1012]']"));
			anadirr.click(); // se añade imagen
			//
			Thread.sleep(15000);

			WebElement num33342 = driver
					.findElement(By.xpath("//android.widget.ImageView[@bounds = '[150,977][300,1024]']"));
			num33342.click(); // boton buscar personas

			WebElement num333742 = driver
					.findElement(By.xpath("//android.widget.ImageView[@bounds = '[450,976][600,1024]']"));
			num333742.click(); // boton personita izquierda

			WebElement numm3334 = driver
					.findElement(By.xpath("//android.widget.FrameLayout[@bounds = '[20,427][600,481]']"));
			numm3334.click();

			WebElement nump33333 = driver
					.findElement(By.xpath("//android.widget.RelativeLayout[@bounds = '[40,191][558,244]']"));
			nump33333.click();

			WebElement plust = driver.findElement(By.id("com.badoo.mobile:id/accountSignOut"));
			plust.click();

			WebElement pluss3 = driver.findElement(By.id("android:id/button1"));
			pluss3.click();
			
			data.setStatus(row + 1,"C://Users//Administrator//Desktop//Libro.xlsx",FinalStatus);
			
			int row3 = 2;
			credencial=data.getCellData(row3);
			String Username3=credencial.getUsername();
			String Password3=credencial.getPassword();

			WebElement user3 = driver.findElement(By.id("com.badoo.mobile:id/user"));
			user3.click();
			user3.clear();

			user3.sendKeys(Username3);

			WebElement contra3 = driver.findElement(By.id("com.badoo.mobile:id/password"));
			contra3.click();

			contra2.sendKeys(Password3);

			WebElement entrar2 = driver.findElement(By.id("com.badoo.mobile:id/signIn"));
			entrar2.click();
			
			String FinalStatus1 = "Contraseña erronea ";
			data.setStatus(row + 2,"C://Users//Administrator//Desktop//Libro.xlsx",FinalStatus1);
			
			// entra con contraseña erronea , se debe capturar el error 
			
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().back();
			
			WebElement user4 = driver.findElement(By.id("com.badoo.mobile:id/user"));
			user4.click();
			user4.clear();

			user4.sendKeys(Username2);

			WebElement contra4 = driver.findElement(By.id("com.badoo.mobile:id/password"));
			contra4.click();
			contra4.clear();

			contra4.sendKeys(Password2);

			WebElement entrar4 = driver.findElement(By.id("com.badoo.mobile:id/signIn"));
			entrar4.click();
			
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().back();
			
			/// entra correctamente a la nueva cuenta 
			
			WebElement num9999 = driver.findElement(By.id("com.badoo.mobile:id/encountersCards_voteRight"));
			num9999.click(); // se vota un like para ver si funciona 
			
			driver.navigate().back();
			
			
			WebElement num43332 = driver
					.findElement(By.xpath("//android.widget.ImageView[@bounds = '[450,976][600,1024]']"));
			num43332.click();
			
			WebElement num438332 = driver.findElement(By.xpath("//android.widget.ImageView[@bounds = '[0,25][60,89]']"));
			num438332.click(); // añadir foto boton

			WebElement num433378 = driver
					.findElement(By.xpath("//android.widget.ImageView[@bounds = '[0,199][147,346]']"));
			num433378.click(); // selecciona imagen de camara
			
			WebElement num5433378 = driver
					.findElement(By.xpath("//android.widget.ImageButton[@bounds = '[270,882][330,942]']"));
			num5433378.click(); // toma foto
			Thread.sleep(2000);
			WebElement num56433378 = driver
					
					.findElement(By.xpath("//android.widget.ImageButton[@bounds = '[528,877][568,917]']"));
			num56433378.click();
			Thread.sleep(2000);
			
			WebElement anadirrr = driver
					.findElement(By.xpath("//android.widget.Button[@bounds = '[524,972][588,1012]']"));
			anadirrr.click(); // se añade imagen
			//
			Thread.sleep(15000);

			WebElement num333423 = driver
					.findElement(By.xpath("//android.widget.ImageView[@bounds = '[150,977][300,1024]']"));
			num333423.click(); // boton buscar personas

			WebElement num3337425 = driver
					.findElement(By.xpath("//android.widget.ImageView[@bounds = '[450,976][600,1024]']"));
			num3337425.click(); // boton personita izquierda

			WebElement numm33346 = driver
					.findElement(By.xpath("//android.widget.FrameLayout[@bounds = '[20,427][600,481]']"));
			numm33346.click();
		
			WebElement nump333337 = driver
					.findElement(By.xpath("//android.widget.RelativeLayout[@bounds = '[40,191][558,244]']"));
			nump333337.click();


			WebElement plust9 = driver.findElement(By.id("com.badoo.mobile:id/accountSignOut"));
			plust9.click();

			WebElement pluss389 = driver.findElement(By.id("android:id/button1"));
			pluss389.click();
			
			
			
		} catch (Exception e) {
			System.out.print("\n\t Se presento Excepción " + e);
			// }
			///[0,199][147,346] coordenadas para tomar foto , android.widget.ImageView clase 
			
		// android.widget.ImageButton, clase boton tomar foto , [270,882][330,942] coordenadas 
			
			// android.widget.ImageButton cooordenadas para subir foto, esperar un momento mientras se toma [528,877][568,917]
			
			// despues q se sube la foto se añade , [524,972][588,1012]  android.widget.Button
			
			//ya de ahi sigue los mismos pasos de el usuario anterior 
		}
	}
}
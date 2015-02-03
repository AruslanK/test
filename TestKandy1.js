var webdriver = require('selenium-webdriver');
var assert = require('chai').assert;
var test = require('selenium-webdriver/testing');
var CountryArray = require('CountryArray');
var array =[];


var driver = new webdriver.Builder().
		withCapabilities(webdriver.Capabilities.chrome()).
				build();
var chgriver = new webdriver.Builder().
		withCapabilities(webdriver.Capabilities.chrome()).
				build();	
// console.log(assert);
var obj = new CountryArray.HelpFunc(driver,webdriver,assert);
// console.log(obj.assert);
var link1 = 'http://webapps.kandy.io/KandyCommunicator/'
	, link2 = 'http://fring.pub.globallogic.com/kandy/'
	, link3 = 'http://webapps.kandy.io/KandyCommunicator/'
	, cCodeFieldPath = '//*[@id="registrationView"]/div/div/div[1]/form/div/div[2]/input[1]'
	, numberFieldPath = '//*[@id="registrationView"]/div/div/div[1]/form/div/div[2]/input[2]';





test.describe('Kandy-Registration', function() {
	
	// test.it('App should be opened', function() {
			
	// 	driver.get(link1);
	// 	// var win = driver.windows.getAll();
	// 	// var drhandler = driver.getWindowHandle().then(function(drhandler) {console.log(drhandler);});
	// 	// driver.findElement(webdriver.By.id('open')).click().then(function() {driver.sleep(2000);});
	// 	driver.sleep(2000);
	// 	driver.close(); //close first page
		
	// 	var handlers = driver.getAllWindowHandles().then(function(handlers) {
	// 												driver.switchTo().window(handlers[0]);});
			
	// 		driver.findElement(webdriver.By.tagName('body')).getCssValue('height').then(function(height) {
	// 															assert.equal(parseInt(height),618);
	// 															}); //body height
			
	// 		driver.findElement(webdriver.By.tagName('body')).getCssValue('width'). then(function(width) {
	// 															assert.equal(parseInt(width),320);
	// 															});	//body width	
	// 		driver.manage().window().getSize().then(function(size) {
	// 			// console.log(typeof(size));
	// 			assert.equal(size.height, 687);
	// 			assert.equal(size.width, 336);
	// 		}); //window size
	// });
	
	// test.it('Title should be Kandy', function() {
	// 	driver.getTitle().
	// 		then(function(title) {
	// 			assert.equal(title,'Kandy');
	// 		});			
	// });

	// test.it('Check flags list on server', function() {
	// 		driver.get(link1 + 'src/img/flags/');
	// 		driver.findElements(webdriver.By.tagName('a')).
	// 								then(function(arr) {
										
	// 										for(var i = 1; i <= arr.length-1; i++) {
												
	// 											arr[i].getAttribute('href').then(function(text) {
	// 													array = array.push(text); 
	// 													console.log(array);												
	// 												// for(var j = 0; j <= obj.countryArray.length-1; j++){
	// 												// 	if (text === obj.countryArray[j]) {
															
	// 												// 		// console.log(text, obj.countryArray[j]);
	// 												// 		assert.equal(text, obj.countryArray[j]); break;
	// 													// };//for if
														
	// 												// };//loop for#2

	// 											}); //func text
	// 										};//loop for
	// 								});//func arr
	// 		driver.navigate().back();//return to Kandy welcome page
	// });

	// test.it('Open Community', function() {
	// 	driver.sleep(3000);
	// 	obj.findClick('//*[@id="domainView"]/div/div[1]/button[2]');//Open Community button	
	// });

	// test.it('Check country list loading to app', function() {
		
	// 	driver.findElements(webdriver.By.xpath('//*[@id="registrationView"]/div/div/div[1]/form/div/div[3]/ul/li')).
	// 									then(function(flagListArray) {
	// 										var checkDriver = new webdriver.Builder().
	// 															withCapabilities(webdriver.Capabilities.chrome()).
	// 																build();											
	// 										for(var i=1; i < 225; i++) {
	// 											var flagUrl = flagListArray[i].getCssValue('background-image').
	// 												then(function(flagUrl) {																														
	// 													var fullFlagUrl;
	// 													// console.log(flagUrl,'url(\''+ link1 + 'src/img/flags/Congo%20(Zaire).jpg)');
	// 													if (flagUrl === 'url(\''+ link1 + 'src/img/flags/Congo%20(Zaire).jpg\')') {
	// 															console.log('...');
	// 													 		fullFlagUrl = link1 + 'src/img/flags/Congo%20(Zaire).jpg';
	// 													} else {
	// 														fullFlagUrl = flagUrl.substring(flagUrl.indexOf("h"), flagUrl.indexOf(")"));
	// 													};	
	// 													// console.log(fullFlagUrl);
	// 													checkDriver.get(fullFlagUrl);
	// 													checkDriver.getTitle().then(function(title) {
	// 														assert.notEqual(title, '404 Not Found');
	// 													}); 
	// 													// if (obj.countryArray.indexOf(fullFlagUrl) === -1) {
	// 													// 	console.log(fullFlagUrl);
	// 													// 	assert.equal(fullFlagUrl,'Not in server country list');
	// 													// }																											
														
	// 												});//func flagUrl
													
	// 										};//loop for#1										
	// 										checkDriver.quit();
	// 									});//func flagListArray
	// });

	// test.it('Number normalization - 00 in first position => no country code field', function() {
	// 	driver.sleep(3000);
	// 	obj.findSendKey(numberFieldPath, '00');
	// 	driver.sleep(1500);
	// 	obj.findGetAttribute(cCodeFieldPath ,'class','country-code collapsed');
	// });

	// test.it('Number normalization - delete 00 => appear country code field', function() {
	// 	obj.findDelKey(numberFieldPath);
	// 	driver.sleep(1500);
	// 	obj.findGetAttribute(cCodeFieldPath ,'class','country-code');
	// });

	// test.it('Number normalization - + in number field=>  no country code field', function() {
	// 	driver.sleep(1500);
	// 	obj.findSendKey(numberFieldPath, '+');
	// 	driver.sleep(2500);
	// 	obj.findGetAttribute(cCodeFieldPath ,'class','country-code collapsed');
	// });

	// test.it('Number normalization - number with code in number field=> no pop up "Normalization failed"', function() {
	// 	obj.findDelKey(numberFieldPath);
	// 	obj.findSendKey(numberFieldPath, '380930980749');
	// 	obj.findClick('//*[@id="registrationView"]/div/div/div[1]/form/button');//Continue button
	// 	driver.sleep(2000);
	// 	driver.isElementPresent(webdriver.By.xpath('//*[@id="app"]/body/div[5]')). then(function(el) {assert.equal(el, true);});//Pop up checking	
	// 	obj.findClick('//*[@id="app"]/body/div[5]/div/menu/button');
	// 	driver.sleep(2000);	
	// 	obj.findDelKey(numberFieldPath);
	// }); // not valid? normalization was fixed

	// test.it('Number normalization - 0 in first position => 0 sould be deleted', function() {
	// 	obj.findDelKey(numberFieldPath);
	// 	// driver.sleep(2500);
	// 	obj.findSendKey(numberFieldPath, '0');
	// 	driver.sleep(1500);
	// 	obj.findGetText(numberFieldPath ,'');
	// });

	// test.it('Flag detection by input code => +1 = United States; +380 = Ukraine', function() {
	// 	obj.findDelKey(cCodeFieldPath);
	// 	obj.findSendKey(cCodeFieldPath, '+1');
	// 	driver.findElement(webdriver.By.xpath('//*[@id="registrationView"]/div/div/div[1]/form/div/div[1]/div/div')).getCssValue('background-image'). 
	// 				then(function(image) {
	// 					// console.log(image);
	// 					var countryName = image.slice(image.indexOf('U'), -1);
	// 					// console.log(countryName);
	// 					assert.equal(countryName, 'United%20States.jpg');
	// 				});
	// 	obj.findDelKey(cCodeFieldPath);
	// 	obj.findSendKey(cCodeFieldPath, '+380');
	// 	driver.findElement(webdriver.By.xpath('//*[@id="registrationView"]/div/div/div[1]/form/div/div[1]/div/div')).getCssValue('background-image'). 
	// 				then(function(image) {
	// 					// console.log(image);
	// 					var countryName = image.slice(image.indexOf('U'), -1);
	// 					// console.log(countryName);
	// 					assert.equal(countryName, 'Ukraine.jpg');
	// 				});
	// });

	// test.it('Flag invalid input code => +999 = None', function() {
	// 	obj.findDelKey(cCodeFieldPath);
	// 	obj.findSendKey(cCodeFieldPath, '+999');
	// 	driver.findElement(webdriver.By.xpath('//*[@id="registrationView"]/div/div/div[1]/form/div/div[1]/div/div')).getCssValue('background-image'). 
	// 				then(function(image) {
	// 					// console.log(image);
	// 					var countryName = image.slice(image.indexOf('None'), -1);
	// 					// console.log(countryName);
	// 					assert.equal(countryName, 'None.jpg');
	// 				});
	// 	driver.sleep(2500);			
	// 	obj.findDelKey(cCodeFieldPath);
	// 	driver.sleep(2500);	
	// });

	// test.it('Flag max length input code field => more than 5 ', function() {
	// 	obj.findSendKey(cCodeFieldPath, '12345');
	// 	driver.sleep(2000);
	// 	obj.findGetAttribute(cCodeFieldPath,'value', '+1234');
	// 	obj.findDelKey(cCodeFieldPath);
	// 	driver.sleep(2000);
	// });

	// test.it('Flag char input code field => Test ', function() {
	// 	obj.findSendKey(cCodeFieldPath, 'Test');
	// 	driver.sleep(2000);
	// 	obj.findGetAttribute(cCodeFieldPath,'value', '+');
	// 	obj.findDelKey(cCodeFieldPath);
	// 	driver.sleep(2000);
	// });

	// test.it('Input invalid number => 123456789 & 380930980749111 => pop up "Normalization failed"', function() {
	// 	driver.sleep(1000);
	// 	obj.findSendKey(cCodeFieldPath, '+380');
	// 	obj.findSendKey(numberFieldPath,'123456789');
	// 	obj.findClick('//*[@id="registrationView"]/div/div/div[1]/form/button');//Continue button	//*[@id="registrationView"]/div/div/div[1]/form/button
	// 	driver.sleep(2000);
	// 	driver.isElementPresent(webdriver.By.xpath('//*[@id="app"]/body/div[5]')). then(function(el) {assert.equal(el, true);});//*[@id="app"]/body/div[5]
	// 	obj.findClick('//*[@id="app"]/body/div[5]/div/menu/button');
	// 	driver.sleep(2000);
	// 	obj.findDelKey(numberFieldPath);
	// 	obj.findSendKey(numberFieldPath,'380930980749111');
	// 	obj.findClick('//*[@id="registrationView"]/div/div/div[1]/form/button');//Continue button	
	// 	driver.sleep(2000);
	// 	driver.isElementPresent(webdriver.By.xpath('//*[@id="app"]/body/div[5]')). then(function(el) {assert.equal(el, true);});
	// 	obj.findClick('//*[@id="app"]/body/div[5]/div/menu/button');
	// 	obj.findDelKey(numberFieldPath);
	// });

	// test.it('Number field max length input  => more than 15 ', function() {
	// 	obj.findSendKey(numberFieldPath, '123456789123456789');
	// 	driver.sleep(2000);
	// 	obj.findGetAttribute(numberFieldPath,'value', '123456789123456');
	// 	obj.findDelKey(numberFieldPath);
	// 	driver.sleep(2000);
	// });

	// test.it('Char input number field => Test ', function() {
	// 	obj.findSendKey(numberFieldPath, 'Test');
	// 	driver.sleep(2000);
	// 	obj.findGetAttribute(numberFieldPath,'value', '');
	// 	obj.findDelKey(numberFieldPath);
	// 	driver.sleep(2000);
	// });

	// test.it('Input valid number => 937212701 =>OTP input screen', function() {
	// 	driver.sleep(2000);
	// 	obj.findSendKey(numberFieldPath,'934212701');
	// 	obj.findClick('//*[@id="registrationView"]/div/div/div[1]/form/button');//Continue button	
	// 	driver.sleep(2000);
		
	// });
	
	// test.it('Invalid input OTP => pop up "Incorrect validation code"', function() {
						
	// 					var code = '0000';
	// 					var codeArray = code.split('');
						
	// 					driver.findElements(webdriver.By.xpath('//*[@id="registrationView"]/div/div/div[2]/form/div/input')).
	// 						then(function(inputfields) {
	// 							for (var i = 0; i < inputfields.length; i++) {
	// 								inputfields[i].sendKeys(codeArray[i]);
	// 							};
									
	// 						});
						
	// 					obj.findClick('//*[@id="registrationView"]/div/div/div[2]/form/button[1]');
	// 					driver.sleep(2000);
						
	// 					driver.isElementPresent(webdriver.By.xpath('//*[@id="app"]/body/div[5]')). then(function(el) {assert.equal(el, true);});//Pop up checking
						
	// 					obj.findClick('//*[@id="app"]/body/div[5]/div/menu/button');
	// 					driver.sleep(2000);					
	// });

	// test.it('Char input OTP => Emty code field', function() {
						
	// 					var codeArray = 'aaaa'.split('');
						
	// 					driver.findElements(webdriver.By.xpath('//*[@id="registrationView"]/div/div/div[2]/form/div/input')).
	// 						then(function(inputfields) {
	// 							for (var i = 0; i < inputfields.length; i++) {
	// 								inputfields[i].sendKeys(codeArray[i]);
	// 								inputfields[i].getAttribute('value').
	// 									then(function(chr) {assert.equal(chr,'');
	// 									});
	// 							}
									
	// 						});
										
	// });

	// test.it('Resend code => code field is empty"', function() {
						
	// 					obj.findClick('//*[@id="registrationView"]/div/div/div[2]/form/button[2]');					
	// 					driver.sleep(2000);
	// 					obj.findClick('//*[@id="registrationView"]/div/div/div[1]/form/button');//Continue button
						
	// 					driver.sleep(2000);	

	// 					driver.findElements(webdriver.By.xpath('//*[@id="registrationView"]/div/div/div[2]/form/div/input')).
	// 						then(function(inputfields) {
	// 							for (var i = 0; i < inputfields.length; i++) {
	// 								inputfields[i].getAttribute('value').
	// 												then(function(chr) {assert.equal(chr,'');
	// 												});
	// 							}
	// 						});
	// });

	// test.it('Get Fum OTP', function() {
	// 					// driver.sleep(2000);
						
	// 					chgriver.get('http://172.18.1.99:99/get?host=KANDY_DB_SITE&path=validation_getByPhone.xml&phone=%2B380934212701');
	// 					chgriver.sleep(5000);
	// 					chgriver.findElements(webdriver.By.className('line')).
	// 						then(function(codes) {
	// 							console.log(codes);
	// 							codes[codes.length-1].getInnerHtml().then(function(html){console.log(html);});
	// 							var codePos = codes.length-2;
	// 							console.log(codePos);
							
								var xpathCode = '//*[@id="collapsible0"]/div[1]/div[2]/div[' + codePos + ']/span/span[2]/span[2]';
								console.log(xpathCode);
								chgriver.findElement(webdriver.By.css(xpathCode)).getText().
									then(function(text) {
										console.log(text);
										var codeArray = text.split('');	
									
										driver.findElements(webdriver.By.xpath('//*[@id="registrationView"]/div/div/div[2]/form/div/input')).
											then(function(inputfields) {
												for (var i = 0; i < inputfields.length; i++) {
													inputfields[i].sendKeys(codeArray[i]);
											}//for
									
										});
										obj.findClick('//*[@id="registrationView"]/div/div/div[2]/form/button[1]');
									});//
							});
						// chgriver.close();
										
	});
		

	



	//NOT valid
	
	
			
	

 }); //Close Describe


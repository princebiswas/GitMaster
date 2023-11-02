from time import sleep

from selenium import webdriver
from selenium.webdriver import ActionChains
from selenium.webdriver.common.by import By

driver = webdriver.Chrome()
driver.get("https://www.amazon.com/")
driver.maximize_window()
sleep(3)

AccountList = driver.find_element(By.XPATH,"//span[text()='Account & Lists']")
Act = ActionChains(driver)
Act.move_to_element(AccountList).perform()

driver.find_element(By.XPATH,"//span[text()='Orders']").click()

sleep(5)


##  Unable to move forword,
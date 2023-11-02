from time import sleep

from selenium import webdriver

driver = webdriver.Chrome()

driver.get("https://www.facebook.com")
driver.maximize_window()

print(driver.title)

sleep(4)
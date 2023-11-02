from time import sleep

from selenium import webdriver
from selenium.webdriver import ActionChains
from selenium.webdriver.common.by import By

driver = webdriver.Chrome()
driver.get("https://demo.guru99.com/test/drag_drop.html")
driver.maximize_window()
starting = driver.find_element(By.XPATH,"//a[text()=' BANK ']")
target = driver.find_element(By.ID,"bank")

act = ActionChains(driver)
act.drag_and_drop(starting,target).perform()
sleep(5)

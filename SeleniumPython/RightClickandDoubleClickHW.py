from time import sleep

import selenium
from selenium import webdriver

from selenium.webdriver import ActionChains
from selenium.webdriver.common import alert
from selenium.webdriver.common.alert import Alert
from selenium.webdriver.common.by import By

driver = webdriver.Chrome()
driver.get("https://demo.guru99.com/test/simple_context_menu.html")
driver.maximize_window()

DoubleClickButton = driver.find_element(By.XPATH, "//button[text()='Double-Click Me To See Alert']")
act = ActionChains(driver)
act.double_click(DoubleClickButton).perform()

al = driver.switch_to.alert

print(al.text)
al.accept()

sleep(2)

rightclick = driver.find_element(By.XPATH,"//span[text()='right click me']");
act.context_click(rightclick).perform()
sleep(5)

## Need help for right Click
from time import sleep

from selenium import webdriver
from selenium.webdriver import ActionChains
from selenium.webdriver.common.by import By

driver = webdriver.Chrome()
driver.get("https://yatra.com")
driver.maximize_window()

Support = driver.find_element(By.XPATH,"//a[text()='Support ']")
Act = ActionChains(driver)
Act.move_to_element(Support).perform()

driver.find_element(By.XPATH,"//a[text()='Talk To Us']").click()

sleep(2)

driver.switch_to.frame("iframeChatBot") ###user is inside into the frame

driver.find_element(By.XPATH,"//button[text()='Cancellation']").click()

driver.switch_to.default_content() ##user some out from the frame
driver.find_element(By.ID,"chatbot_close_button").click()



sleep(5)
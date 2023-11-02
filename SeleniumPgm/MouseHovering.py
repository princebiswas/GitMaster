from time import sleep

from selenium import webdriver
from selenium.webdriver import ActionChains
from selenium.webdriver.common.by import By

driver = webdriver.Chrome()

driver.get("https://www.amazon.com")
driver.maximize_window()

accountlist = driver.find_element(By.XPATH, "//span[text()='Account & Lists']")

act = ActionChains(driver)

act.move_to_element(accountlist).perform()

driver.find_element(By.XPATH,"//span[text()='Account']").click()

print(driver.title)

##driver.find_element(By.CSS_SELECTOR,"input[id='twotabsearchtextbox']").send_keys("Mobile")

##act.drag_and_drop("","").perform()

##act.c

alrt = driver.switch_to.alert

alrt.accept()
alrt.dismiss()

print(alrt.text)



sleep(4)
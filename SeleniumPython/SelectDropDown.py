from time import sleep

from selenium import webdriver
from selenium.webdriver import ActionChains
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select

driver = webdriver.Chrome()
driver.get("https://demo.guru99.com/test/newtours/register.php")
driver.maximize_window()

dropdown = driver.find_element(By.NAME,"country")

sel = Select(dropdown)

sel.select_by_index(4)

sel.select_by_value("EGYPT")

sel.select_by_visible_text("INDONESIA")

for option in sel.options:
    option.click()
    print(option.text)

sleep(3)
from time import sleep

from select import select
from selenium import webdriver
from selenium.webdriver import ActionChains
from selenium.webdriver.chrome import options
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select

driver = webdriver.Chrome()
driver.get("https://demo.guru99.com/test/newtours/register.php")
driver.maximize_window()

dropdown = driver.find_element(By.NAME, "country")

sel = Select(dropdown)

for option in sel.options:
    print(option.text)

    if(option.text=="CANADA"):
        option.click()
        break;

sleep(3)

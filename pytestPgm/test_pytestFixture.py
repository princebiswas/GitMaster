import pytest
from selenium import webdriver


@pytest.fixture(params=["chrome","Edge"],scope='class')
def init_chrome_driver(request):
    if request.param=="chrome":
        driver = webdriver.Chrome()
    if request.param=="Edge":
        driver = webdriver.Edge()
    request.cls.driver=driver
    yield
    driver.close()



@pytest.mark.usefixtures("init_chrome_driver")
class Base_Test:
    pass

class Test_ChromeTest(Base_Test):

    def test_googleTitle(self):
        self.driver.get("https://google.com")
        assert self.driver.title == "Google"

    def test_Facebbok(self):
        self.driver.get("https://facebook.com")
        assert self.driver.title =="Facebook - log in or sign up"

    def test_yahoo(self):
        self.driver.get("https://yahoomail.com")
        assert self.driver.title== "Google"


    def test_yatra(self):
        self.driver.get("https://Yatra.com")
        assert self.driver.title =="Facebook - log in or sign up"
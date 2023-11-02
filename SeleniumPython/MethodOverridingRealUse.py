class KFCAmerica :
    def Location(self):
        print("California")
    def Product(self):
        print("KFC")

class KFCIndia(KFCAmerica):
    def Location(self):
        print("Delhi")

class KFCUK(KFCAmerica):
    def Location(self):
        print("London")

k = KFCIndia()
k.Location()
k.Product()

## driver = ChromeDriver() //Run time polymorphism in selenium
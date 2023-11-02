class MOR:
    def Test(self):
        print("calling Test Method in MOR Class")

class MOR1(MOR):

    def Test(self):
        print("Calling Test Method in MOR1 class")


m = MOR1()
m.Test()
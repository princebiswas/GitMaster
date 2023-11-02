class ABC:
    def Booking(self):
        print("Flight")


class Image:
    def getShape(self):
        print("Tringle")
        print("Cirlce")

    def getColor(self):
        print("orange")


class Transportation():

    def Vehicle (self):
        print("Car")
        print("Truck")


class Food():
    def Breakfast(self):
        print("Tea")
        print("Coffee")


## ref =Constructor()
##ref.method()

i = Image()
i.getShape()

i.getColor()

a = ABC()
a.Booking()

b = Food()
b.Breakfast()

t = Transportation()
t.Vehicle()





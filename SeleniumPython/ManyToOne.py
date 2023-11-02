class Animal:
    def Category(self):
        print("Animal")

class Dog(Animal):
    def Voice(self):
        print("Bark")

class Cat(Animal):
    def Voice(self):
        print("Meow")

class Tiger(Animal):
    def Voice(self):
        print("Roar")

t = Tiger()
t.Voice()
t.Category()
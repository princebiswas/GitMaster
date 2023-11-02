class GP:
    def GPFeature(self):
        print("calling GP feature")

class Parent:
    def ParentFeature(self):
        print("calling parent feature")

class Child(Parent,GP):
    def ChildFeature(self):
        print("calling child feature")

c = Child()
c.ChildFeature()
c.ParentFeature()
c.GPFeature()
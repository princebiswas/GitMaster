import pytest

def test_M1():
    a="ABC"
    b="ABC"
    assert a==b,"Test case failed if not Matching"

def test_M2():
    a=10
    b=20
    assert a!=b,"Test case failed if not Matching"


def test_M3():
    a="ABD"
    b="ABC"
    assert a==b,"Test case failed if not Matching"

def test_Login_Gmail():
    username="Admin"
    assert username == "Admin","Test case Failed if not matching"


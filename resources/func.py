import os

def Func(name: str,  switch: bool):
    if(switch=="true"):
        print("NAME: {}".format(name))
    else:
        print("switched off")

name = os.environ['stringParam']
switch = os.environ['boolParam']

Func(name,switch)

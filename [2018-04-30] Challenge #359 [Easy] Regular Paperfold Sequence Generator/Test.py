array = [1]
repeat = int(input("Please enter how many time you would like it to repeat:"))
for a in range(repeat):
    for b in range(1,len(array)+2):
        y = b % 2
        x = (b * 2) - 2
        array.insert(x,y)
    print(array)

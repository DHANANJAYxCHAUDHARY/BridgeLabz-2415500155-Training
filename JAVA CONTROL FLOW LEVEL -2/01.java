number = int(input("Enter a natural number: "))
if number < 1:
    print("Please enter a natural number (1 or more).")
else:
    for i in range(1, number + 1):
        if i % 2 == 0:
            print(f"{i} is even")
        else:
            print(f"{i} is odd")

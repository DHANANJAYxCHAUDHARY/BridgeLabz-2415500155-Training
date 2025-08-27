number = int(input("Enter a positive number less than 100: "))
if number <= 0 or number >= 100:
    print("Enter a positive number less than 100.")
else:
    print(f"Multiples of {number} below 100 are:")
    for i in range(100, 0, -1):
        if i % number == 0:
            print(i)

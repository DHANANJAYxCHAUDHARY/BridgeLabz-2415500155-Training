number = int(input("Enter a positive integer: "))
if number <= 0:
    print("Enter a positive integer.")
else:
    print(f"Factors of {number} are:")
    for i in range(1, number + 1):
        if number % i == 0:
            print(i)

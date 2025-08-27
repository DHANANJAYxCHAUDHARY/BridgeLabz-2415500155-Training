number = int(input("Enter a positive integer: "))
if number <= 0:
    print("Enter a positive integer.")
else:
    i = 1
    print(f"Factors of {number} are:")
    while i <= number:
        if number % i == 0:
            print(i)
        i += 1

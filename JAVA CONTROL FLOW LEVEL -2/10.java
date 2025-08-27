number = int(input("Enter a number: "))
greatestFactor = 1
counter = number - 1

while counter > 0:
    if number % counter == 0:
        greatestFactor = counter
        break
    counter -= 1

print(f"Greatest factor of {number} beside itself is {greatestFactor}")

number = int(input("Enter a number: "))
greatestFactor = 1

for i in range(number - 1, 0, -1):
    if number % i == 0:
        greatestFactor = i
        break

print(f"Greatest factor of {number} beside itself is {greatestFactor}")

salary = float(input("Enter salary: "))
years_of_service = int(input("Enter years of service: "))

if years_of_service > 5:
    bonus = salary * 0.05
else:
    bonus = 0
print(f"Bonus amount: {bonus}")

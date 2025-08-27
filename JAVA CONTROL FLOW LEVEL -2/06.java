# Input ages
amar_age = int(input("Enter Amar's age: "))
akbar_age = int(input("Enter Akbar's age: "))
anthony_age = int(input("Enter Anthony's age: "))

# Input heights
amar_height = float(input("Enter Amar's height: "))
akbar_height = float(input("Enter Akbar's height: "))
anthony_height = float(input("Enter Anthony's height: "))

# Find youngest
youngest_age = min(amar_age, akbar_age, anthony_age)
if youngest_age == amar_age:
    youngest = "Amar"
elif youngest_age == akbar_age:
    youngest = "Akbar"
else:
    youngest = "Anthony"

# Find tallest
tallest_height = max(amar_height, akbar_height, anthony_height)
if tallest_height == amar_height:
    tallest = "Amar"
elif tallest_height == akbar_height:
    tallest = "Akbar"
else:
    tallest = "Anthony"

print(f"The youngest friend is {youngest} with age {youngest_age}.")
print(f"The tallest friend is {tallest} with height {tallest_height}.")

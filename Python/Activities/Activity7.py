num_list = list(input("Enter List of numbers : ").split(","))

#num_list = [1,6,4,2,9]
sum = 0

for x in num_list:
    sum=sum+int(x)
    
print(sum)
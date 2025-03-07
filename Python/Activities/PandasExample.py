import pandas

data = {
  "Vehicle Type": ["Car", "Car", "Bike"],
  "Manufacturer": ["Maruti", "Toyota", "Royal Enfield"],
  "Model" : ["Swift", "Corolla", "Thunderbird"]
}

dataframe = pandas.DataFrame(data)
 
# Print the DataFrame
print(dataframe)
 

dataframe.to_csv("Vehicle.csv", index=False)
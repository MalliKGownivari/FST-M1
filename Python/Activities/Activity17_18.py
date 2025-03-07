
import pandas

# create the data set
data = {
  "Usernames": ["admin", "Charles", "Deku"],
  "Passwords": ["password", "Charl13", "AllMight"]
}

# convert data set into data frame
dataframe = pandas.DataFrame(data)
 
# Print the DataFrame
print(dataframe)
 
# writing the data frame into a csv file
dataframe.to_csv("sample.csv", index=False)


# read data from csv file
input_data = pandas.read_csv("sample.csv")

# print the values in the user name

username_col = input_data["Usernames"]
print(username_col)

#print username and password of the second row

# print username and password of second row
print(username_col[1])
print(input_data["Passwords"])


#sorting usernames
print(input_data.sort_values("Usernames",ascending=False))
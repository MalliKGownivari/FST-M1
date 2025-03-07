# Import pandas
import pandas
from pandas import ExcelWriter
 
# data set
data = {
	'FirstName':["Satvik", "Avinash", "Lahri"],
	'LastName':["Shah", "Kati", "Rath"],
	'Email':["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
	'PhoneNumber':["4537829158", "4892184058", "4528727830"]
}
 
# convert into dataset
dataframe = pandas.DataFrame(data)
 
# Print the dataframe
print(dataframe)
 
# Writing the dataframe to a Excel file
writer = ExcelWriter('sample.xlsx')
dataframe.to_excel(writer, 'Sheet1', index = False)
 
# closing the writer
writer.close()

# Read the excel file
input_date = pandas.read_excel("sample.xlsx")


#print number of rows and columns
print(input_date.shape)

print("Number of rows " , input_date.shape[0])
print("Number of columns " , input_date.shape[1])

#print data in email columns only

print(input_date["Email"])

#Sort the data

print(input_date.sort_values("FirstName"))
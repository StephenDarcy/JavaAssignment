C18490924 Naive Bayes ML Assignment

Classes:
Case - This class set up the constraits for what a case object is. Factors are temperature,
Cough, Aches, Danger Zone, Sore Throat and COVID-19 positive yes or no

Dataset - This class reads in a csv and converts it into an arrayList of case objects. It does this 
so ArrayLists can be used in the NaiveBayes class

TestData - This class is used to test a dataset and return its accuarcy. A dataset object is passed to this class
which is then split into two smaller ArrayLists one to be trained on and the other to be tested on

GuiFile - This class is a file selector window that allows the user to choose between 3 different datasets, small default
and big

Control - This class creates a GUI object and a static variable which is the file in use

NaiveBayes - This class calculates the probability of having Covid-19 using a case that is passed to it and a dataset to train on

GUI - This class displays several radio buttons and 3 other JButtons. The user can change the dataset, test the accuracy of the 
dataset or enter symptoms and get their probability of having COVID-19.


If I had more time I would have added a JFileChooser and a way for users to append their symptoms to a dataset to make it larger. 
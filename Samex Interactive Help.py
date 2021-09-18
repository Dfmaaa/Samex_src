# -*- coding: utf-8 -*-
"""
Created on Mon Jul 26 21:23:02 2021
@author: Sameer Achhab
"""
print("Enter a command to learn more about it. Enter all to see all commands. ")
def help(command):
   if command=="all":
       print("1.shutdown")
       print("2.content")
       print("3.write")
       print("4.restart")
       print("5.dir [path]")
       print("6.cd [path]")
       print("8.exists")
       print("9.create")
       print("10.remove")
       print("11.rename")
       print("download");
   if command=="shutdown":
       print("It closes the program.")
   if command=="download":
      print("it will allow users to download files from the web.")
   if command=="create":
       print("It creates a file.")
   if command=="write":
       print("It writes into a file.")
   if command=="content":
       print("It shows the contents of a file")
   if command=="exists":
       print("It tells if a file exists or not.")
   if command=="create":
       print("It creates a file.")
   if command=="dir [path]":
       print("It shows all the files in a directory or a folder.")
   if command=="cd [path]":
       print("it opens a file.")
   if command=="remove":
       print("It deletes a file.")
   if command=="restart":
       print("It stops the program for 4-5 seconds.")
   if command=="rename":
       print("Typing this will rename the file.")
   if command=="change password":
      print("Type this to change your password.") 
while True:
 cmd=input() 
 help(cmd)      

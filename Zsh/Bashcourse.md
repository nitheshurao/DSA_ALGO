- 
basic:

- #!/bin/sh
echo "What is your name?"
read PERSON
echo "Hello, $PERSON"

- - Shell − The shell is the utility that processes your requests. When you type in a command at your terminal, the shell interprets the command and calls the program that you want. The shell uses standard syntax for all commands. C Shell, Bourne Shell and Korn Shell are the most famous shells which are available with most of the Unix variants.

- which shell types your operating system supports, type the command into the terminal as given below:
cat /etc/shells    

-  And to know where bash is located in your OS, type the below command and you will get a specific location:
 which bash 

- Variable 
Sysetm varibale are in Capital Letter;

User defined Variable = lowercase;

- Syste Varible we can use:
```js ech $BASH o/p name of the shell
ech $BASH__VERSION
ech $HOME
ech $PWD 
```


- User Defined Variable
```js
nae =Nitheh
ech The name is $nae
o/p: The name is Nithes
```

- #####  - Read User Input

Allow user to enter some name;
```js
echo "Enter the name of the user..?"
read name

```





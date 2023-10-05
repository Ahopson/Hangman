#implement a hangman game
 
#import a random generator so the computer can randomly chose words for the hangman game
import random 
 
 
words =["rock","paper","scissors","act","turtle","window","skateboard","zigzag"]
guess_word = random.choice(words)
board = "*" * len(guess_word)
asterisk = len(guess_word)
board_list=list(board)
previous_choices=[]
play_again= 'y'
lives = 6

def letter_choice(list):
    global lives
    global asterisk
    while play_again == "y":
       
      print("")
      print(board_list)
      print("number of lives:", lives)
      print("previous choices",previous_choices)
      print("")
#ask for users guess of letters
      user_guess_letter = input("Pick any letter in the alphabet: ")
 
      not_valid(previous_choices,user_guess_letter)
      changes = 0
 
        #looks through guess word to see of user guess letters match any letters in guess_word
      for i in range(len(list)):
 #tells user there is a match and changes * to guess letter 
        if user_guess_letter == list[i]:
            changes = changes + 1
            board_list[i] = (user_guess_letter)
      if changes >= 1:
            asterisk = asterisk - changes
            print("There is ", changes , user_guess_letter)
            print("")
            
        #tells user there is no match and subtracts a 1 life
      if changes == 0:
            lives -= 1
            print("There is no", user_guess_letter,"you have", lives,"lives")
            print("")
          
      user_won()

 # Determines if the user has 0 lives = lose or if the user got rid of all the asterisk = win 
def user_won():
    global lives
    global play_again
    if lives <= 0:
        print("you have 0 lives left")
        print("The word was",guess_word)
        play_again ="n"
        print("Game over")
        another_round()
       
    if asterisk == 0:
        print("You have guessed", guess_word, "You won!")
        play_again = "n"
        print("Game over")
        another_round()
      
# If user inputs a number, previous choice, or more than one letter the computer ask for another input it tells user input is invalid
def not_valid(list,user_guess_letter):
    while True:
            if user_guess_letter in list or user_guess.isnumeric() or len(user_guess_letter)>1  :
 
                print("Input is invalid!")
                user_guess = input("Pick any letter in the alphabet: ")
            else:
                list.append(user_guess_letter)
                return list
                
#allows user to play as many times as they want
def another_round():
  global play_again
  global asterisk
  global board_list
  global previous_choices
  global lives
  del previous_choices[:]
  play_again =input("Do you want to play again? enter y for yes and n for no:")
  if play_again == "y":
    print("")
    guess_word = random.choice(words)
    board = "*" * len(guess_word) 
    asterisk = len(guess_word)
    board_list=list(board)
    #previous_choices=[]
    play_again= 'y'
    lives = 6
    changes=0
    letter_choice(guess_word)
  else:
    print("thanks for playing")
    letter_choice(guess_word)

                   
#The code for the game to start
while play_again == "y":
    print("Welcome to hangman! You get six lives to guess the correct word. Good Luck!")
    letter_choice(guess_word)

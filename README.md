# 4ULN
## CSC207 Project Repo

### Week 3 Group README Tasks
- [ ] a description of the problem domain your team is tentatively wanting to focus on in the project. 
(e.g., trivia, finance, real estate, etc…) -- Dorothy

Our problem domain will be a text-based adventure game that requires users to survive as a University of Toronto student.

An event will be displayed on the user-interface screen as text along with options to choose from like a multiple choice 
question. Sometimes there will be images shown for a visual understanding of the events. The event that is displayed is 
decided or produced randomly by the ChatGPT API we will utilize for our project. The player will interact by clicking on one of the options that are available. 

The game is played until the player dies (specific conditions written below).

The player will have the attributes ID, password, and highscore.
The player first has to sign up to play a game with a unique ID and a password.
The highscore will be 0 until the player finishes the first game and is updated with the first game's score. 
With more games played, it will only update its score when the most recent score is higher than the saved value of highscore.

Each unique player will be stored by writing on/updating a textfile named Accounts once the sign up is complete. Accounts will be within the main project file.

The player will choose what type of student to play the game with.
The student will have the attributes health, stress, TBucks, capability, and bag.
There will be many types of students to choose from and each will have different health, stress, TBucks, and capabilities.

The player has to have more than one of health and less than three stress to keep itself alive.
The player can spend TBucks to buy items that help with surviving in the game or can earn TBucks in different events.
The items the player receives or buys will be stored in the student's bag. When the item is lost or used, it will be removed from the bag. 

A private archive of events the choices made for each event will exist. The archived will be accessed for an evaluation of the total score of the game after it is finished. 
The score, calculated from the archive based on specific principles, will be shown to the player after the game has ended.



##### Example: Adventure Game
- text-based game along the lines of Zork
- an appropriate API leveraged for some aspect of the game content
- templating system for creating new stories
- different types of items and collectibles
- inventory system

- [ ] a brief, high-level description of what kind of application your team is thinking of developing. -- Paul
- [ ] a link to the documentation for an API your team can use related to the domain. -- Dorothy
- [ ] a screenshot of using a tool to try out the API -- Jason/Minseok
- [ ] example output of running your Java code (see below). -- Jason/Minseok
- [ ] a list of any technical problems blocking progress (if any) -- All

Magical Arena :
Magical Arena is a Java project where players battle using their skills and luck. Implemented with object-oriented programming, the project includes a game simulation and unit tests for testing various scenarios.

Introduction :
In this magical arena, players fight against each other until one's health drops to zero. Each player is defined by three attributes:

Health: The player's health indicates how much damage they can withstand before being defeated.
Strength: The player's strength determines how much damage they can defend against during a battle.
Attack: The player's attack power indicates how much damage they can inflict on their opponent.

Gameplay :
Players attack in turns.
Player with lower Health attacks first.
The attacking player rolls the attacking dice, and the defending player rolls the defending dice.
The attack damage is calculated by multiplying the attack value with the outcome of the attacking dice roll.
The defending player's strength value is multiplied by the outcome of the defending dice roll to calculate the damage defended.
Any excess damage beyond what the defender can defend reduces the defender's health.
The game ends when a player's health drops to zero.

To Run This Game Follow these steps :
1. Download the Source Code.
2. Open the src folder and look for main Package.
3. Open the main package and and run the main Package in any IDE [Eclipse,IntelliJ].
4. Then provide the Appropriate Inputs for the Game.
5. Then the result will be displayed.
6. All kinds of Exceptions are Handled in this project using Exception Handling Mechanism in oreder to avoid the Failure.
7. The Result will be shown as per the given Inputs by the player.
8. You can re run the game as many time as you wish.
9. Inorder to improve the code reliablity the code is tested with different inputs.
10. You can check the unit tests in the src/test Package.
11. You can run the MainTest file to check the code reliability.
12. The End of Game.

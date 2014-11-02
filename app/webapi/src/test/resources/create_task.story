Meta:

Narrative:
As a user
I want to create new task
So that I can manage it properly

Scenario: user creates a first task
Given a task repository
When user adds new task with name Write walking skeleton for user jacek
Then I can find this task by name Write walking skeleton for user jacek
When user adds new task with name Devil's Advocate job for user mikolaj
Then I can find this task by name Devil's Advocate job for user mikolaj


# Emily's Wordtrainer RELOADEEEED

The word trainer is back! From a programming perspective, you shouldn't have a problem with that, now it's about the software development process and the tools we have at our disposal. Here are the requirements to be met, followed by a reminder of the content of the word trainer.

The content of the task is deliberately formulated less precisely than the “original” from the third year. Of course you can proceed exactly as you did back then, but with the experience you have gained you can also approach things differently. However, you should definitely use the tools listed later - which, especially because of Gradle, means that this task has to be implemented in Java (or Kotlin).

To do this, use this GitHub Classroom link (with an empty repository, you need to initialize the Gradle project yourself): https://classroom.github.com/a/5l41o_QP

Requirements regarding development process
In addition to the implementation of the required functionality, the development process is particularly important in the assessment:

The entire application must be developed from the start in a Git repository and with Gradle as the build system. To do this, use this GitHub Classroom link (with an empty repository, you need to initialize the Gradle project yourself): https://classroom.github.com/a/5l41o_QP
Give the repository at least a minimal README.md from the start.
The order in which the required features are implemented is up to you: you can implement the entire model first, then persistence, then GUI. For example, you can also do without the statistics first, add the GUI, and only then add the rest. However, the following applies to every feature: the design comes before the implementation, and this must also be evident in the commit history! So development for each feature should go something like this:
First expand your draft (UML class diagram) to include the planned classes, methods, associations, ... Commit these changes, including an updated png export of the diagram!
Implement the new feature; Make commits in between where it makes sense.
Make sure that the code is tested and documented - i.e. automated test cases and Javadoc comments are available - at the latest after the feature is completed. If necessary, correct the class diagram if you deviated from the plan during implementation.
Make sure that the README describes the program in a meaningful way: what can the program do and what technologies were used? Is there anything to consider as a user?
3 half days are planned for this SEW exercise!
Extended requirements (will be assessed in a separate submission)
implement an additional two (EKü) or three (EKv) of these points:

Integrate at least one external library (except JUnit) using Gradle and use it sensibly in your word trainer.
Use Github Actions to further automate at least one aspect of the software development process (e.g. test execution, Jar file creation, Javadoc generation, ...).
Participate in a classmate's word trainer: use issue tracking and/or a pull request to suggest a (non-trivial) improvement.
This point is only completed when the issue/pull request has been successfully completed.
Maintain a constructive attitude when working together.
Allow a classmate to participate in your word trainer: fix a (non-trivial) problem reported as an issue by someone else
This point is only completed once the issue has been successfully resolved. Simply merging a finished pull request doesn't count!
Maintain a constructive attitude when working together.
Submission & assessment
To submit, enter a direct Github link to the last commit in your repository. So this link should look like this: https://github.com/TGM-HIT/sew9-2425-worttrainer-<github-username>/commit/<commit-id>;

The assessment takes place in a submission interview.

Content of the application
A first draft of the functionality is to be created for a spelling trainer for words (target group for elementary school children). The children should type in the corresponding word for a picture (e.g. a dog). This word is then compared with the correct spelling and a corresponding message is displayed.

Model
Pairs of words with their corresponding images (stored via a URL pointing to each image) are mapped as a class.
Objects of this class are in a valid state at all times thanks to appropriate checks (e.g. regarding null values ​​or invalid URLs).
The spelling trainer itself is shown as a class.
The spelling trainer has a lot of word-picture pairs available. Initially no couple is selected.
To train, a word-picture pair can be selected: either a specific pair is chosen (using an index), or a random one is chosen.
After a pair is selected, the image URL can be retrieved and the associated word can be guessed. If the answer is incorrect, the word-picture pair remains selected; If the answer is correct, the pair is no longer selected and a new pair must be selected before the next guess.
The spelling trainer keeps statistics on how often the total number of correct/incorrect guesses was made.
Objects of this class are in a valid state at all times thanks to appropriate checks (e.g. regarding null values ​​or statistics); Attempts to perform invalid actions are detected and prevented.
Persistence
A word trainer session (consisting of the available word-image pairs, the currently selected pair (if available) and the current statistics) should also be able to be saved. The exact implementation is largely up to you:

choose any storage format (e.g. custom, Java serialization, JSON, XML, SQLite, ...)
use any suitable libraries if necessary (e.g. org.json:json, one of numerous XML libraries, org.xerial:sqlite-jdbc)
To integrate persistence into your application, choose a sensible pattern so that the storage strategy remains interchangeable.
Graphical interface
Make it possible to use the word trainer via a graphical interface. It is sufficient to use JOptionPane. The process would then be something like this:

When the program starts, the persisted data is loaded. If no data is persisted, a new word trainer is created with a few permanently programmed word pairs.
The following steps are then repeated:
A pair of words is randomly selected.
Using JOptionPane, the previous statistics and the current image are displayed. If it is not the first attempt, it will also show whether the previous attempt was right or wrong. There is also an option to enter the word here.
If the input is not empty, the input is checked and the process starts again. Otherwise the loop is aborted.
Finally, the current state of the word trainer is persisted.
Other GUI technologies are also permitted if at least equivalent functionality is guaranteed.


## Deployment

To deploy this project run

```bash
  npm run deploy
```

// idk maybe that works
## Support

For support, email fake@tgm.com or join our Slack channel.


## Optimizations

What optimizations did you make in your code? E.g. refactors, performance improvements, accessibility

//sheesh lots to do here
